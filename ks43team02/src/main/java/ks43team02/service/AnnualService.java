package ks43team02.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks43team02.dto.Annual;
import ks43team02.mapper.AnnualMapper;

@Service
@Transactional
public class AnnualService {

	private final AnnualMapper annualMapper;
	
	public AnnualService(AnnualMapper annualMapper) {
		this.annualMapper = annualMapper;
	}
	public List<Annual> getAnnualList(){
		List<Annual> annualList = annualMapper.getAnnualList();
		return annualList;
	}
}
