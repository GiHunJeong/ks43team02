package ks43team02.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import ks43team02.dto.ChatRoom;

@Controller
public class ChatController {
	
	List<ChatRoom> roomList = new ArrayList<ChatRoom>();
	static int roomNumber = 0;
	
	@RequestMapping("/app")
	public ModelAndView chat() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/app-chat");
		return mv;
	}
	
	/**
	 * 방 페이지
	 * @return
	 */
	@RequestMapping("/room/room")
	public ModelAndView room() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/room/room");
		return mv;
	}
	
	/**
	 * 방 생성하기
	 * @param params
	 * @return
	 */
	@RequestMapping("/createRoom")
	public @ResponseBody List<ChatRoom> createRoom(@RequestParam HashMap<Object, Object> params){
		String roomName = (String) params.get("roomName");
		if(roomName != null && !roomName.trim().equals("")) {
			ChatRoom chatRoom = new ChatRoom();
			chatRoom.setRoomNumber(++roomNumber);
			chatRoom.setRoomName(roomName);
			roomList.add(chatRoom);
		}
		return roomList;
	}
	
	/**
	 * 방 정보가져오기
	 * @param params
	 * @return
	 */
	@RequestMapping("/getRoom")
	public @ResponseBody List<ChatRoom> getRoom(@RequestParam HashMap<Object, Object> params){
		return roomList;
	}
	
	/**
	 * 채팅방
	 * @return
	 */
	@RequestMapping("/moveChating")
	public ModelAndView chating(@RequestParam HashMap<Object, Object> params) {
		
		ModelAndView mv = new ModelAndView();
		int roomNumber = Integer.parseInt((String) params.get("roomNumber"));
		
		List<ChatRoom> new_list = roomList.stream().filter(o->o.getRoomNumber()==roomNumber).collect(Collectors.toList());
		if(new_list != null && new_list.size() > 0) {
			mv.addObject("roomName", params.get("roomName"));
			mv.addObject("roomNumber", params.get("roomNumber"));
			mv.setViewName("/room/chat");
		}else {
			mv.setViewName("/room/room");
		}
		return mv;
	}
}