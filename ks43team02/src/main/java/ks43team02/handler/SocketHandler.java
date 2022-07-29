package ks43team02.handler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Component
public class SocketHandler extends TextWebSocketHandler {
	
	private static final Logger log = LoggerFactory.getLogger(SocketHandler.class);
	
	HashMap<String, WebSocketSession> sessionMap = new HashMap<>(); //웹소켓 세션을 담아둘 맵
	List<HashMap<String, Object>> rls = new ArrayList<>(); //웹소켓 세션을 담아둘 리스트 ---roomListSessions
	
	@Override
	public void handleTextMessage(WebSocketSession session, TextMessage message) {
		//메시지 발송
		String msg = message.getPayload();
		log.info("chating === {}", msg);
		JSONObject obj = jsonToObjectParser(msg);
		
		String rN = (String) obj.get("roomNumber");
		HashMap<String, Object> temp = new HashMap<String, Object>();
		for(String key : sessionMap.keySet()) {
			WebSocketSession wss = sessionMap.get(key);
			try {
				wss.sendMessage(new TextMessage(msg));
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		if(rls.size() > 0) {
			for(int i=0; i<rls.size(); i++) {
				String roomNumber = (String) rls.get(i).get("roomNumber"); //세션리스트의 저장된 방번호를 가져와서
				if(roomNumber.equals(rN)) { //같은값의 방이 존재한다면
					temp = rls.get(i); //해당 방번호의 세션리스트의 존재하는 모든 object값을 가져옴
					break;
				}
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		//소켓 연결
		super.afterConnectionEstablished(session);
		sessionMap.put(session.getId(), session);
		boolean flag = false;
		String url = session.getUri().toString();
		String roomNumber = url.substring(url.indexOf("=") + 1, url.length());
		System.out.println(roomNumber+"<<<<roomnumber");
		System.out.println(url+"<<<<url");
		//String roomNumber = url.split("/chating/")[1];
		
		int idx = rls.size(); //방의 사이즈 조사
		if(rls.size() > 0) {
			for(int i=0; i<rls.size(); i++) {
				String rN = (String) rls.get(i).get("roomNumber");
				if(rN.equals(roomNumber)) {
					flag = true;
					idx = i;
					
					break;
				}
			}
			if(flag) { //존재하는 방이라면 세션만 추가
				HashMap<String, Object> map = rls.get(idx);
				map.put(session.getId(), session);
			}else { //최초 생성하는 방이라면 방번호와 세션을 추가
				HashMap<String, Object> map = new HashMap<String, Object>();
				map.put("roomNumber", roomNumber);
				map.put(session.getId(), session);
				rls.add(map);
			}
			
			//세션등록이 끝나면 발급받은 세션ID값의 메시지를 발송
			JSONObject obj = new JSONObject();
			obj.put("type", "getId");
			obj.put("sessionId", session.getId());
			session.sendMessage(new TextMessage(obj.toJSONString()));
		}
	}
	
	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		//소켓 종료
		sessionMap.remove(session.getId());
		
		if(rls.size() > 0) { //소켓이 종료되면 해당 세션값들을 찾아서 삭제
			for(int i=0; i<rls.size(); i++) {
				rls.get(i).remove(session.getId());
			}
		}
		super.afterConnectionClosed(session, status);
	}
	
	private static JSONObject jsonToObjectParser(String jsonStr) {
		JSONParser parser = new JSONParser();
		JSONObject obj = null;
		try {
			obj = (JSONObject) parser.parse(jsonStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return obj;
	}
}