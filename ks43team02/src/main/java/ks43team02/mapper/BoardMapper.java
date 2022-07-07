package ks43team02.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ks43team02.dto.DepartmentBoard;
import ks43team02.dto.DepartmentBoardCate;
import ks43team02.dto.NoticeBoard;


@Mapper
public interface BoardMapper {
	
	//부서별 게시판 게시글 조회
	public DepartmentBoard getDepartmentDetail(String departmentPostCode);
	
	//부서별 게시판 검색
	public List<DepartmentBoard> getSearchDepartmentList(String searchKey, String searchValue); 
	
	//부서별 게시판 목록 조회
	public List<DepartmentBoard> getDepartmentBoardList();
	
	//부서별 게시판 목록 테이블 총 row(튜플)수
	public int getDepartmentPagingCount();
	
	//부서별 게시판 목록 페이징 처리
	public List<Map<String,Object>> getDepartmentPaging(Map<String,Object> paramMap);
	
	//부서별 게시판 글 작성
	public int addDepartment(DepartmentBoard department);
	
	//부서별 게시판 카테고리 조회
	public List<DepartmentBoardCate> getBoardCateCode(DepartmentBoardCate boardCate);
	
	//부서별 게시판 게시글 번호 조회
	public String getDepartmentIdx();
	
	//공지사항 작성
	public int addNotice(NoticeBoard notice);
	
	//공지사항 목록 페이징 처리
	public List<Map<String,Object>> getNoticePaging(Map<String,Object> paramMap);
	
	//공지사항 목록 테이블 총 row(튜플)수
	public int getNoticePagingCount();
	
	//공지사항 조회수 업데이트
	public int noitceViewUpdate(String cpNoticeCode);
	
	//공지사항 게시글 조회
	public NoticeBoard getNoticeDetail(String cpNoticeCode);
	
	//공지사항 목록 조회
	public List<NoticeBoard> getNoticeBoardList(Map<String, Object> paramMap);
	
	//공지사항 게시글 번호 조회
	public String getCpNoticeIdx();
	
}
