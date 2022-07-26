package ks43team02.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks43team02.dto.DocumentCateS;
import ks43team02.mapper.DocumentSettingMapper;


@Service
@Transactional
public class DocumentSettingService {
	/*
	 * 의존성주입
	 */
	private final DocumentSettingMapper documentSettingMapper;
	
	public DocumentSettingService(DocumentSettingMapper documentSettingMapper) {
		this.documentSettingMapper = documentSettingMapper;
	}
	
	//등록된 문서 양식 리스트 (DocumentCateS)
	public List<DocumentCateS> getDocSetList(){
		List<DocumentCateS> documentCateS = documentSettingMapper.getDocSetList();
		return documentCateS;
	}
	
	//문서 양식 등록
	public int addDocumentCate(DocumentCateS documentCateS) {
		int result = documentSettingMapper.addDocumentCate(documentCateS);
		return result;
	}
	
	
}
