package ks43team02.mapper;

import java.util.*;

import org.apache.ibatis.annotations.Mapper;

import ks43team02.dto.DocumentCateS;

@Mapper
public interface PaymentMapper {
	//문서 카테고리소 조회
	public List<DocumentCateS> getDocumentCateSList();
}