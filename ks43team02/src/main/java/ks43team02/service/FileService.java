package ks43team02.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import ks43team02.dto.FileDto;
import ks43team02.mapper.FileMapper;
import ks43team02.util.FileUtil;

@Service
@Transactional
public class FileService {
	
	private FileUtil fileUtil;
	private FileMapper fileMapper;
	
	public FileService(FileUtil fileUtil, FileMapper fileMapper) {
		
		this.fileUtil = fileUtil;
		this.fileMapper = fileMapper;
	}
	
	public List<String> fileUpload(MultipartFile[] uploadfile, String fileRealPath) {
		
		List<FileDto> fileList= fileUtil.parseFileInfo(uploadfile, fileRealPath);
		List<String> filePathList = new ArrayList<String>(); 
		for(int i=0; i<fileList.size();i++)
		{
			filePathList.add(fileList.get(i).getAttachFilePath());
		}
		if(fileList != null) fileMapper.addFile(fileList);
		return filePathList;
	}
	
	public int addFileControl(List<Map<String,String>> addFileControlList) {
		fileMapper.addFileControl(addFileControlList);
		return 0;
	};
	
	public List<FileDto> getFileList(){
		return fileMapper.getFileList();
	}
	
	public FileDto getFileInfoByIdx(String attachFileCode) {
		return fileMapper.getFileInfoByIdx(attachFileCode);
	}
}
