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
	
	//부서별 게시판 게시글 조회
	public DepartmentBoard getDepartmentDetail(int departmentPostCode) {
		DepartmentBoard departmentDetail = boardMapper.getDepartmentDetail(departmentPostCode);
		
		return departmentDetail;
	}
	
	//부서별 게시판 리스트 조회
	public List<DepartmentBoard> getDepartmentBoardList(){
		
		List<DepartmentBoard> departmentBoardList = boardMapper.getDepartmentBoardList();
		
		return departmentBoardList;
	}
	
	//공지 게시글 작성
	public int addNotice(NoticeBoard noticeBoard, String sessionName, MultipartFile[] fileImage, String fileRealPath) {
		
		System.out.println("BoardService/addNotice");
		String cpNoticeCode = noticeBoard.getCpNoticeCode();
		
		noticeBoard.setRegUserName(sessionName);
		  
		int result = boardMapper.addNotice(noticeBoard);

		List<FileDto> fileList = fileUtil.parseFileInfo(fileImage, fileRealPath);
		System.out.println("BoardService/addNotice/fileDto");
		fileMapper.addFiles(fileList);
		
		List<Map<String, String>> paramList = new ArrayList<Map<String, String>>();
		System.out.println("BoardService/addNotice/paramList");
		Map<String, String> paramMap = null; 
		
		for(FileDto fileDto : fileList) {
			paramMap = new HashMap<String, String>();
			paramMap.put("referenceCode", cpNoticeCode);
			paramMap.put("attach_file_code", fileDto.getAttachFileCode());
			paramList.add(paramMap);
		}
		
		fileMapper.addFilesContol(paramList);
		
		return result;
	}
	
	
	//공지 게시글 조회
	public NoticeBoard getNoticeDetail(int cpNoticeCode) {
		
		NoticeBoard noticeDetail = boardMapper.getNoticeDetail(cpNoticeCode);
		
		return noticeDetail;
	}
	
	//공지 리스트 조회
	public List<NoticeBoard> getNoticeBoardList(){
		
		List<NoticeBoard> noticeBoardList = boardMapper.getNoticeBoardList();
		
		return noticeBoardList;
	}
}
