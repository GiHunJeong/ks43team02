package ks43team02.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks43team02.dto.ApprovalProgress;
import ks43team02.dto.ApprovalRequest;

@Mapper
public interface DocumentMapper {

	//문서리스트
	public List<ApprovalRequest> getDocApprovalRequest();
}
