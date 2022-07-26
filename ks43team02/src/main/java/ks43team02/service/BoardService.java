package ks43team02.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import ks43team02.dto.FileDto;
import ks43team02.dto.DepartmentBoard;
import ks43team02.dto.DepartmentBoardCate;
import ks43team02.dto.DepartmentComment;
import ks43team02.dto.NoticeBoard;
import ks43team02.mapper.BoardMapper;
import ks43team02.mapper.FileMapper;
import ks43team02.util.FileUtil;

@Service
@Transactional
public class BoardService {
	
	private BoardMapper boardMapper;
	private FileUtil fileUtil;
	private FileMapper fileMapper;
	
	public BoardService (BoardMapper boardMapper, FileUtil fileUtil, FileMapper fileMapper) {
		this.boardMapper = boardMapper;
		this.fileUtil = fileUtil;
		this.fileMapper = fileMapper;
	}
	
	//부서별 게시판 댓글 목록
	public List<DepartmentComment> getCommentList(DepartmentComment departmentComment){
		
		List<DepartmentComment> CommentList = boardMapper.getCommentList(departmentComment);
		
		return CommentList;
	}
	
	//부서별 게시판 댓글 삭제
	public int removeComment(String departmentCommentCode) { 
		
		int result = boardMapper.removeComment(departmentCommentCode);
		
		return result; 
	}
	
	//부서별 게시판 댓글 작성
	public int addComment(DepartmentComment departmentComment,String sessionName) {
		
		//String comment = boardMapper.getDepartmentPostCode();
		//departmentComment.setDepartmentPostCode(comment);
		departmentComment.setRegUserName(sessionName);
		
		int result = boardMapper.addComment(departmentComment);
		
		return result;
	}
	
	//부서별 게시판 검색
	public List<DepartmentBoard> getSearchDepartmentList(String searchKey, String searchValue){
		
		List<DepartmentBoard> searchDepartmentList = boardMapper.getSearchDepartmentList(searchKey, searchValue);
		
		return searchDepartmentList;
	}
	
	//부서별 게시판 글 삭제
	public int removePost(String departmentPostCode) {
		
		int result = boardMapper.removePost(departmentPostCode);
		
		result += boardMapper.removePost(departmentPostCode);
		
		return result;
	}
	
	//부서별 게시판 글 작성
	public void addDepartment(DepartmentBoard departmentBoard, String sessionName, MultipartFile[] fileImage, String fileRealPath) {
		
		boolean fileCheck = true;
			
		for (MultipartFile multipartFile : fileImage){
			if(!multipartFile.isEmpty()) {
				fileCheck = false;
			}
		}
		
		if (!fileCheck) { // 파일이 널이 아니라면
			departmentBoard.setRegUserName(sessionName);
			String temp = boardMapper.getCpNoticeIdx();
			System.out.println("______temp_____" + temp);
			departmentBoard.setDepartmentIdx(temp);
			boardMapper.addDepartment(departmentBoard);
			System.out.println(departmentBoard.getDepartmentPostCode()+ "!!!!!!!!!!");
			
			//tb_attach_file 삽입
			List<FileDto> fileList = fileUtil.parseFileInfo(fileImage, fileRealPath);
			System.out.println("BoardService/addDepartment/fileDto");
			fileMapper.addFile(fileList);
			
			List<Map<String, String>> paramList = new ArrayList<Map<String, String>>();
			System.out.println("BoardService/addDepartment/paramList");
			Map<String, String> paramMap = null;

			for(FileDto fileDto : fileList) { 
				//file_control 테이블 삽입
				paramMap = new HashMap<String, String>();
				paramMap.put("reference_code", departmentBoard.getDepartmentPostCode());
				paramMap.put("attach_file_code", fileDto.getAttachFileCode());
				paramList.add(paramMap);
				fileMapper.addFileControl(paramList);
			}
			
		}else { //파일이 널이라면
			departmentBoard.setRegUserName(sessionName);
			String temp = boardMapper.getDepartmentIdx();
			departmentBoard.setDepartmentIdx(temp);
			boardMapper.addDepartment(departmentBoard);
		}
		
	}
	
	//부서별 게시글 카테고리 조회
	public List<DepartmentBoardCate> getBoardCateCode(DepartmentBoardCate departmentboardCate){
		
		List<DepartmentBoardCate> departmentCate = boardMapper.getBoardCateCode(departmentboardCate);
		
		return departmentCate;
	}
	
	// 공지 게시글 조회수 증가
	public int departmentViewUpdate(String departmentPostCode) {
			
		return boardMapper.departmentViewUpdate(departmentPostCode);
	}
	
	//부서별 게시판 게시글 조회
	public DepartmentBoard getDepartmentDetail(String departmentPostCode) {
		
		DepartmentBoard departmentDetail = boardMapper.getDepartmentDetail(departmentPostCode);
		
		return departmentDetail;
	}
	
	//부서별 게시판 페이징 처리
	public Map<String, Object> getDepartmentPaging(int currentPage){
		// 몇개 행 노출
		int rowPerPage = 5;
		int startPageNum = 1;
		int endPageNum = 3;
		
		// 총 행의 갯수
		double rowCount = boardMapper.getDepartmentPagingCount();
		
		// 마지막페이지
		int lastPage = (int) Math.ceil(rowCount/rowPerPage);
		
		//페이징 처리
		int startRow = (currentPage - 1) * rowPerPage;
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("startRow", startRow);
		paramMap.put("rowPerPage", rowPerPage);
		
		List<Map<String, Object>> departmentPagingList = boardMapper.getDepartmentPaging(paramMap);
		
		// 동적 페이지번호 
		if(currentPage > 3) {
			startPageNum = currentPage - 2;
			endPageNum = currentPage + 1;
		
			if(endPageNum >= lastPage) {
				startPageNum = lastPage - 2;
				endPageNum = lastPage;
			}
		}
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("lastPage", lastPage);
		resultMap.put("departmentPagingList", departmentPagingList);
		resultMap.put("startPageNum", startPageNum);
		resultMap.put("endPageNum", endPageNum);
				
		return resultMap;
	}
	
	//부서별 게시판 리스트 조회
	public List<DepartmentBoard> getDepartmentBoardList(){
		
		List<DepartmentBoard> departmentBoardList = boardMapper.getDepartmentBoardList();
		
		return departmentBoardList;
	}
	
	//공지 게시글 삭제
	public int removeNotice(String cpNoticeCode) {
		
		int result = boardMapper.removeNotice(cpNoticeCode);
		
		result += boardMapper.removeNotice(cpNoticeCode);
		
		return result;
	}
	
	//공지 게시글 작성
	public void addNotice(NoticeBoard noticeBoard, String sessionName, MultipartFile[] fileImage, String fileRealPath) {
		
		boolean fileCheck = true;
		
		for (MultipartFile multipartFile : fileImage){
			if(!multipartFile.isEmpty()) {
				fileCheck = false;
			}
		}
		
		if (!fileCheck) { // 파일이 널이 아니라면
			noticeBoard.setRegUserName(sessionName);
			String temp = boardMapper.getCpNoticeIdx();
			System.out.println("______temp_____" + temp);
			noticeBoard.setCpNoticeIdx(temp);
			boardMapper.addNotice(noticeBoard);
			System.out.println(noticeBoard.getCpNoticeCode()+ "!!!!!!!!!!");
			
			//tb_attach_file 삽입
			List<FileDto> fileList = fileUtil.parseFileInfo(fileImage, fileRealPath);
			System.out.println("BoardService/addNotice/fileDto");
			fileMapper.addFile(fileList);
			
			List<Map<String, String>> paramList = new ArrayList<Map<String, String>>();
			System.out.println("BoardService/addNotice/paramList");
			Map<String, String> paramMap = null;

			for(FileDto fileDto : fileList) { 
				//file_control 테이블 삽입
				paramMap = new HashMap<String, String>();
				paramMap.put("reference_code", noticeBoard.getCpNoticeCode());
				paramMap.put("attach_file_code", fileDto.getAttachFileCode());
				paramList.add(paramMap);
				fileMapper.addFileControl(paramList);
			}
			
		}else { //파일이 널이라면
			noticeBoard.setRegUserName(sessionName);
			String temp = boardMapper.getCpNoticeIdx();
			noticeBoard.setCpNoticeIdx(temp);
			boardMapper.addNotice(noticeBoard);
		}
		
	}
		
	// 공지사항 게시판 페이징 처리
	public Map<String, Object> getNoticePaging(int currentPage){
		// 몇개 행 노출
		int rowPerPage = 5;
		int startPageNum = 1;
		int endPageNum = 3;
		
		// 총 행의 갯수
		double rowCount = boardMapper.getNoticePagingCount();
		
		// 마지막페이지
		int lastPage = (int) Math.ceil(rowCount/rowPerPage);
		
		//페이징 처리
		int startRow = (currentPage - 1) * rowPerPage;
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("startRow", startRow);
		paramMap.put("rowPerPage", rowPerPage);
		
		List<Map<String, Object>> noticePagingList = boardMapper.getNoticePaging(paramMap);
		
		// 동적 페이지번호 
		if(currentPage > 3) {
			startPageNum = currentPage - 2;
			endPageNum = currentPage + 1;
		
			if(endPageNum >= lastPage) {
				startPageNum = lastPage - 2;
				endPageNum = lastPage;
			}
		}
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("lastPage", lastPage);
		resultMap.put("noticePagingList", noticePagingList);
		resultMap.put("startPageNum", startPageNum);
		resultMap.put("endPageNum", endPageNum);
				
		return resultMap;
	}
	
	
	// 공지 게시글 조회수 증가
	public int noitceViewUpdate(String cpNoticeCode) {
		
		return boardMapper.noitceViewUpdate(cpNoticeCode);
	}

	//공지 게시글 조회
	public NoticeBoard getNoticeDetail(String cpNoticeCode) {
		
		NoticeBoard noticeDetail = boardMapper.getNoticeDetail(cpNoticeCode);
		
		return noticeDetail;
	}
	
	//공지 리스트 조회
	public List<NoticeBoard> getNoticeBoardList(Map<String, Object> paramMap){
		
		List<NoticeBoard> noticeBoardList = boardMapper.getNoticeBoardList(paramMap);
		
		return noticeBoardList;
	}
}
