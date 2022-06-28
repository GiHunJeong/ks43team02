package ks43team02.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks43team02.dto.DepartmentBoard;
import ks43team02.dto.NoticeBoard;


@Mapper
public interface BoardMapper {
	
	//부서별 게시판 게시글 조회
	public DepartmentBoard getDepartmentDetail(int departmentPostCode);
	
	//부서별 게시판 목록 조회
	public List<DepartmentBoard> getDepartmentBoardList();
	
	//공지사항 작성
	public int addNotice(NoticeBoard notice);
	
	//공지사항 게시글 조회
	public NoticeBoard getNoticeDetail(int cpNoticeCode);
	
	//공지사항 목록 조회
	public List<NoticeBoard> getNoticeBoardList();
	
}
