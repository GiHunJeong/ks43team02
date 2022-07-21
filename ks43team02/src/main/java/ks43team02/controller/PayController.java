package ks43team02.controller;

import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ks43team02.dto.DeductionList;
import ks43team02.dto.Emply;
import ks43team02.dto.FixedAllowanceList;
import ks43team02.dto.PayAdd;
import ks43team02.dto.PaySet;
import ks43team02.service.PayService;

@Controller
@RequestMapping("/pay")
public class PayController {
	
	private static final Logger log = LoggerFactory.getLogger(PayController.class);

	private final PayService payService;

	public PayController(PayService payService) {
		this.payService = payService;
	}
	
	//급여등록내역 검색
	@PostMapping("/payAddList")
	public String getSearchPayAddList(@RequestParam(name="searchKey") String searchKey
									 ,@RequestParam(name="searchValue", required = false) String searchValue
									 ,Model model) {
		log.info("searchKey   : {}", searchKey);
		log.info("searchValue : {}", searchValue);
		if("emplyId".equals(searchKey)) {
			searchKey="emply_id";
		} else if("emplyName".equals(searchKey)) {
			searchKey="emply_name";
		} else if("emplyRank".equals(searchKey)) {
			searchKey="emply_rank";
		} else {
			searchKey="emply_organization";
		}
		
		List<PayAdd> payAddList = payService.getSearchPayAddList(searchKey, searchValue);
		
		if(payAddList != null) {
			model.addAttribute("payAddList", payAddList);
			log.info("payAddList : {}", payAddList);
		}
		return "pay/payAddList";
	}
	
	// 급여등록내역 삭제
	@GetMapping("/payRemove")
	public String removePayAddList(@RequestParam(name="emplyId", required = false) String emplyId) {
		log.info("------------removeList : {}", emplyId);
		payService.removePayAdd(emplyId);
		System.out.println(emplyId+" <- removeList!");
		return "redirect:/pay/payAddList";
	};

	// 사원 급여등록 리스트 조회
	@GetMapping("/payAddList")
	public String getPayAddList(Model model) {
		List<PayAdd> payAddList = payService.getPayAddList();
		model.addAttribute("payAddList", payAddList);
		return "pay/payAddList";
	};
	
	// 급여등록 내역 ajax
	@RequestMapping(value = "/getPayAddList")
	@ResponseBody 
	public List<PayAdd> getPayAddListForIdCheck() { 
		List<PayAdd> payAddListForIdCheck = payService.getPayAddList(); 
		
		log.info("payAddListForIdCheck", payAddListForIdCheck);
		
		return payAddListForIdCheck; 
	};
	
	// 급여등록
	@PostMapping("/payAdd")
	public String payAdd(PayAdd payAdd
						,@RequestParam(name="payAddCode", required = false, defaultValue = "payAdd_Code_001") String payAddCode) {
		log.info("------------payAdd : {}", payAdd);
		payService.payAdd(payAdd);
		System.out.println(payAdd+" <- payAdd!");
		return "redirect:/pay/payAddList";
	};

	// 사원 급여 등록페이지
	@GetMapping("/payAdd")
	public String getPaySetForPayAdd(Model model) {

		HashMap<String, String> fixedPayMap = new HashMap<>();
		HashMap<String, String> deducePayMap = new HashMap<>();
		
		PaySet paySet = payService.getPaySet();
		log.info("paySet : {}",paySet);
		
		if(paySet == null) {
			return "redirect:/pay/ifPaySetNull";
		}
		
		String fixedPayList = paySet.getFixedPayList();
		String[] fixedPayArray = null;
		if(fixedPayList != null) {
			fixedPayArray = fixedPayList.split(",");
		}
		
		String fixedPayAmount = paySet.getFixedPayAmount();
		String[] fixedAmountArray = null;
		if(fixedPayAmount != null) {
			fixedAmountArray = fixedPayAmount.split(",");
		}
		
		if(fixedPayArray != null) {
			for(int i = 0; i < fixedPayArray.length; i++) {
				fixedPayMap.put(fixedPayArray[i], fixedAmountArray[i]);
			}
		}
		
		String deducePayList = paySet.getDeductionPayList(); 
		String[] deducePayArray = null;
		if(deducePayList != null) {
			deducePayArray = deducePayList.split(",");
		}
		
		String deducePayAmount = paySet.getDeductionPayAmount();
		String[] deduceAmountArray = null;
		if(deducePayAmount != null) {
			deduceAmountArray = deducePayAmount.split(",");
		}
		
		if(deducePayArray != null) {
			for(int j = 0; j < deducePayArray.length; j++) {
				deducePayMap.put(deducePayArray[j], deduceAmountArray[j]);
			}
		}
		
		System.out.println(fixedPayArray+" <-fixedPayArray");
		System.out.println(deducePayArray+" <-deducePayArray");
		System.out.println(fixedAmountArray+" <-fixedAmountArray");
		System.out.println(deduceAmountArray+" <-deduceAmountArray");
		  
		paySet.setFixedPayArrays(fixedPayArray);
		paySet.setFixedAmountArrays(fixedAmountArray);
		paySet.setDeductionPayArrays(deducePayArray);
		paySet.setDeductionAmountArrays(deduceAmountArray);
		
		log.info("paySet", paySet);
		
		List<Emply> emplyList = payService.getEmplyListForPayAdd();
		
		log.info("emplyList", emplyList);
		
		model.addAttribute("paySet", paySet);
		model.addAttribute("emplyList", emplyList);
		model.addAttribute("fixedPayMap", fixedPayMap);
		model.addAttribute("deducePayMap", deducePayMap);
		
		return "pay/payAdd";
	};
	/*
	 * // 급여등록페이지 사원목록 조회 ajax
	 * 
	 * @RequestMapping(value = "/emplyListForPayAdd")
	 * 
	 * @ResponseBody public List<Emply> getEmplyListForPayAdd(Model model) {
	 * List<Emply> emplyList = payService.getEmplyListForPayAdd();
	 * model.addAttribute("emplyList", emplyList);
	 * 
	 * log.info("emplyList", emplyList);
	 * 
	 * return emplyList; }
	 */
	
	// 급여세팅값이 null일경우
	@GetMapping("/ifPaySetNull")
	public String ifPaySetNull() {
		return "pay/ifPaySetNull";
	};
	
	// 급여세팅페이지(현재 세팅값 확인)
	@GetMapping("/paySetting")
	public String getPaySet(Model model) { 

		HashMap<String, String> fixedPayMap = new HashMap<>();
		HashMap<String, String> deducePayMap = new HashMap<>();
		
		PaySet paySet = payService.getPaySet();
		log.info("paySet : {}",paySet);
		
		if(paySet == null) {
			return "redirect:/pay/ifPaySetNull";
		}
		
		String fixedPayList = paySet.getFixedPayList();
		String[] fixedPayArray = null;
		if(fixedPayList != null) {
			fixedPayArray = fixedPayList.split(",");
		}
		
		String fixedPayAmount = paySet.getFixedPayAmount();
		String[] fixedAmountArray = null;
		if(fixedPayAmount != null) {
			fixedAmountArray = fixedPayAmount.split(",");
		}
		
		if(fixedPayArray != null) {
			for(int i = 0; i < fixedPayArray.length; i++) {
				fixedPayMap.put(fixedPayArray[i], fixedAmountArray[i]);
			}
		}
		
		String deducePayList = paySet.getDeductionPayList(); 
		String[] deducePayArray = null;
		if(deducePayList != null) {
			deducePayArray = deducePayList.split(",");
		}
		
		String deducePayAmount = paySet.getDeductionPayAmount();
		String[] deduceAmountArray = null;
		if(deducePayAmount != null) {
			deduceAmountArray = deducePayAmount.split(",");
		}
		
		if(deducePayArray != null) {
			for(int j = 0; j < deducePayArray.length; j++) {
				deducePayMap.put(deducePayArray[j], deduceAmountArray[j]);
			}
		}
		
		System.out.println(fixedPayArray+" <-fixedPayArray");
		System.out.println(deducePayArray+" <-deducePayArray");
		System.out.println(fixedAmountArray+" <-fixedAmountArray");
		System.out.println(deduceAmountArray+" <-deduceAmountArray");
		  
		paySet.setFixedPayArrays(fixedPayArray);
		paySet.setFixedAmountArrays(fixedAmountArray);
		paySet.setDeductionPayArrays(deducePayArray);
		paySet.setDeductionAmountArrays(deduceAmountArray);
		
		log.info("paySet", paySet);
		
		model.addAttribute("paySet", paySet);
		model.addAttribute("fixedPayMap", fixedPayMap);
		model.addAttribute("deducePayMap", deducePayMap);
		
		return "pay/paySetting";
	};
	
	// 급여세팅페이지(세팅값 등록(변경))
	@PostMapping("/addPaySet")
	public String addPaySet(PaySet paySet
							,@RequestParam(name="paySetCode", required = false, defaultValue = "paySet_Code_001") String paySetCode) {
		
		payService.addPaySet(paySet);
		System.out.println(paySet+" <-paySet!");
		
		log.info("paySet", paySet);
		
		return "redirect:/pay/paySetting";
	};
	
	// 급여 세팅페이지
	@GetMapping("/addPaySet")
	public String addPaySet() {
		return "pay/addPaySet";
	};
	
	// 고정지급금 ajax
	@RequestMapping(value = "/fixedSetting")
	@ResponseBody 
	public List<FixedAllowanceList> getFixedAllowList() { 
		List<FixedAllowanceList> fixedAllowanceList = payService.getFixedAllowList();
		
		log.info("fixedAllowanceList", fixedAllowanceList);
		
		return fixedAllowanceList; 
	};
	  
	// 공제액 ajax
	@RequestMapping(value = "/deductionSetting")
	@ResponseBody 
	public List<DeductionList> getDeductionList() { 
		List<DeductionList> deductionList = payService.getDeductionList(); 
		
		log.info("deductionList", deductionList);
		
		return deductionList; 
	};
	 
}
