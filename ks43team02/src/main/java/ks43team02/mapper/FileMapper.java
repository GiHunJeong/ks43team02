package ks43team02.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ks43team02.dto.FileDto;

@Mapper
public interface FileMapper {
	
	// 파일 삽입
	public int addFile(List<FileDto> fileList);
		
	// 1:N 관계 테이블(파일)
	public int addFileControl(List<Map<String,String>> addFileControlList);
	
	public List<FileDto> getFileList();
}
