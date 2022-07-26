package ks43team02.service;


import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks43team02.dto.AnnualSetting;
import ks43team02.dto.AnnualStandard;
import ks43team02.dto.CateAnnual;
import ks43team02.mapper.AnnualSettingMapper;

@Service
@Transactional
public class AnnualSettingService {
   /*
    * 의존성 주입
    * */
   private final AnnualSettingMapper annualSettingMapper;
   
   public AnnualSettingService(AnnualSettingMapper annualSettingMapper) {
      this.annualSettingMapper = annualSettingMapper;
   }

   
   //휴가유형관리(CateAnnual) 리스트
   public List<CateAnnual> getCateAnnualListSetting() {
      List<CateAnnual> cateAnnual = annualSettingMapper.getCateAnnualListSetting();
      
      return cateAnnual;
   }
   

}