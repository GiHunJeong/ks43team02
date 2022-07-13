package ks43team02.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks43team02.dto.DeductionList;
import ks43team02.dto.Emply;
import ks43team02.dto.FixedAllowanceList;
import ks43team02.dto.PayAdd;
import ks43team02.dto.PaySet;

@Mapper
public interface PayMapper {
	
	//급여등록 리스트 조회
	public int removePayAdd(String emplyId);
	
	//급여등록 리스트 조회
	public List<PayAdd> getPayAddList();
	
	//급여세팅 등록
	public int payAdd(PayAdd payAdd);
	
	//회원목록조회
	public List<Emply> getEmplyListForPayAdd();
		
	//세팅값 가져오기(급여등록)
	public PaySet getPaySetForPayAdd();

	//세팅값 가져오기
	public PaySet getPaySet();
	
	//급여세팅 등록
	public int addPaySet(PaySet paySet);
	
	//고정지급 급여 리스트
	public List<FixedAllowanceList> getFixedAllowList();
	
	//공제액 리스트
	public List<DeductionList> getDeductionList();
}
