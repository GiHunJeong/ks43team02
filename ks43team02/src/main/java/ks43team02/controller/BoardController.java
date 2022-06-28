package ks43team02.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import ks43team02.dto.DepartmentBoard;
import ks43team02.dto.NoticeBoard;
import ks43team02.service.BoardService;


@Controller
@RequestMapping("/board")
public class BoardController {
	
	private final BoardService boardService;
	
	private static final Logger log = LoggerFactory.getLogger(BoardController.class);
	
	public BoardController(BoardService boardService) {
		this.boardService = boardService;
	}
	
	/* 게시글 상세화면 이동 */
	@GetMapping("/department_detail")
	public String departmentDetail(Model model, @RequestParam(value = "departmentPostCode",
															  required = false) int departmentPostCode) {
		
		DepartmentBoard departmentDetail = boardService.getDepartmentDetail(departmentPostCode);
		
		model.addAttribute("departmentDetail", departmentDetail);
		
		return "/board/department_detail";
	}
	
	/* 게시글 작성 */
	@PostMapping("/department_write")
	public String boardwrite() {
		
		return "board/department_list";
	}
	
	/* 게시글 등록 페이지 이동 */
	@GetMapping("/department_write")
	public String boardwrite(Model model) {
		

		return "board/department_write";
	}
	
	/* 게시글 리스트 페이지 */
	@GetMapping("/department_list")
	public String boardlist(Model model){
		
		List<DepartmentBoard> departmentBoardList = boardService.getDepartmentBoardList();
		
		log.info("게시글 전체 목록 : {}", departmentBoardList);
		model.addAttribute("departmentBoardList", departmentBoardList);
		
		return "board/department_list";
	}
	
	/* 공지사항 상세화면 이동 */
	@GetMapping("/notice_detail")
	public String noticeDetail(Model model, @RequestParam(value = "cpNoticeCode",
														  required = false) int cpNoticeCode) {
		
		NoticeBoard noticeDetail = boardService.getNoticeDetail(cpNoticeCode);
		
		model.addAttribute("noticeDetail", noticeDetail);
		
		return "/board/notice_detail";
	}
	
	/* 공지사항 작성 */
	@PostMapping("/notice_write")
	public String noticeWrite(NoticeBoard noticeBoard
							 ,HttpSession session
							 ,@RequestParam MultipartFile[] fileImage
							 ,HttpServletRequest request) {
		System.out.println("ddd");
		String sessionName = (String)session.getAttribute("SNAME");
		//파일 업로드
		String serverName = request.getServerName();
		String fileRealPath = "";
		if("localhost".equals(serverName)) {				
			fileRealPath = System.getProperty("user.dir") + "/src/main/resources/static/";
			//fileRealPath = request.getSession().getServletContext().getRealPath("/WEB-INF/classes/static/");
		}else {
			fileRealPath = request.getSession().getServletContext().getRealPath("/WEB-INF/classes/static/");
		}
		
		boardService.addNotice(noticeBoard, sessionName, fileImage, fileRealPath);
		
		
		return "redirect:/board/notice_list";
	}
	
	/* 공지사항 등록 페이지 이동 */
	@GetMapping("/notice_write")
	public String noticewrite(Model model) {
		

		return "board/notice_write";
	}
	
	/* 공지사항 리스트 페이지*/
	@GetMapping("/notice_list")
	public String getNoticeBoardList(Model model){
		
		List<NoticeBoard> noticeBoardList = boardService.getNoticeBoardList();
		
		log.info("공지사항 전체 목록 : {}", noticeBoardList);
		model.addAttribute("noticeBoardList", noticeBoardList);
		
		return "board/notice_list";
	}
}
