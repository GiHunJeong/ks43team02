package ks43team02.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks43team02.dto.DocumentCateS;

@Mapper
public interface DocumentSettingMapper {
	
	//등록된 문서 양식 리스트 (DocumentCateS)
	public List<DocumentCateS> getDocSetList();
	
	//문서 양식 등록
	public int addDocumentCate(DocumentCateS documentCateS);
}
