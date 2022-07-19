package ks43team02.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks43team02.dto.AnnualStandard;
import ks43team02.dto.AnnualApplication;
import ks43team02.dto.AnnualList;
import ks43team02.dto.AnnualSetting;
import ks43team02.dto.CateAnnual;
import ks43team02.mapper.AnnualMapper;
import ks43team02.mapper.AnnualSettingMapper;

@Service
@Transactional
public class AnnualService {
   /*
    * 의존성 주입
    * */
   private final AnnualMapper annualMapper;
   private final AnnualSettingMapper annualSettingMapper;
   
   public AnnualService(AnnualMapper annualMapper, AnnualSettingMapper annualSettingMapper) {
      this.annualMapper = annualMapper;
      this.annualSettingMapper = annualSettingMapper;
   }
   
   //연차등록 가져오기 select
   public List<AnnualApplication> getAnnualApplication() {
      List<AnnualApplication> annualApplication = annualMapper.getAnnualApplication();
      return annualApplication;
   }
   
   
   //연차등록 폼 insert
   public int addAnnualApplication(AnnualApplication annualApplication) {
      int result = annualMapper.addAnnualApplication(annualApplication);
      return result;
   }
   
   //등록된 연차 리스트 select
   public List<AnnualList> getAnnualList(){
      List<AnnualList> annualList = annualMapper.getAnnualList();
      return annualList;
   }
   
   //등록된 연차 리스트 
   public int getAnnualList(AnnualList annualList) {
      int result = annualMapper.getAnnualList(annualList);
      return result;
   }


   //연차세팅 가져오기
   public List<AnnualSetting> getAnnualSetting(){ 
      List<AnnualSetting> annualSetting = annualSettingMapper.getAnnualSetting(); 
      return annualSetting;
   }

   //연차기준 가져오기
   public List<AnnualStandard> getAnnualStandard(){
      List<AnnualStandard> annualStandard = annualMapper.getAnnualStandard();
      return annualStandard;
   }

   //연차카테고리 가져오기
   public List<CateAnnual> getCateAnnual(){ 
      List<CateAnnual> cateAnnual = annualMapper.getCateAnnual();
      return cateAnnual; 
   }
   
    
 
}