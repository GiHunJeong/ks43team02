$(function(){
	"use strict";	
	/* 패스워드 유효성 검사 */
	var checkFailed  = 0;
	function validationCheckPw(data){
		var 
		    english = data.search(/[a-z]/ig)
		    ,spece = data.search(/[`~!@@#$%^&*|₩₩₩'₩";:₩/?]/gi)
			,reg = /^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$/;
		if(typeof data == 'undefined' || data == null || data == '' || data == '@ksmart.or.kr') {
			$('input[name="emplyPw"]').val('');
			$('input[name="emplyPw"]').attr('placeholder','비밀번호를 입력해 주세요.');
			return true;
		}else if(/(\w)\1\1\1/.test(data)) {
			$('input[name="emplyPw"]').val('');
			$('input[name="emplyPw"]').attr('placeholder','같은 문자를 연속으로 4번 이상 사용할수 없습니다.');
			return true;
		}else if(number < 0 || english < 0) {
			$('input[name="emplyPw"]').val('');
			$('input[name="emplyPw"]').attr('placeholder','영문과 숫자를 조합해 입력해주세요.');
			return true;
		}else if(data.search(/\s/) != -1) {
			$('input[name="emplyPw"]').val('');
			$('input[name="emplyPw"]').attr('placeholder','아이디에 공백을 추가할수 없습니다.');
			return true;
		}else if(data.length < 5 || data.length > 17){
			$('input[name="emplyPw"]').val('');
			$('input[name="emplyPw"]').attr('placeholder','5자 이상 17자 이하로 입력하세요');
			return true;
		}else if(spece != -1) {
			$('input[name="emplyPw"]').val('');
			$('input[name="emplyPw"]').attr('placeholder','특수문자불가');
			return true;
		}
		return false;
	}
	/* 패스워드 유효성 검사 끝 */
	
	/* 나머지 유효성 검사 */
	function validationCheckBasic(data){
		/*var 
		    number = data.search(/[0-9]/g)
		    ,english = data.search(/[a-z]/ig)
		    ,spece = data.search(/[`~!@@#$%^&*|₩₩₩'₩";:₩/?]/gi)
			,reg = /^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$/;*/
		if(typeof data == 'undefined' || data == null || data == '' || data == 'Choose...') {
			alert('입력하지 않은 부분이 있습니다.');
			return true;
		}
		return false;
	}
	/* 나머지 유효성 끝 */
	
	/* 유효성검사 패스워드*/
	$(document).on('blur', 'input[name="emplyPw"]', function(){
		var 
			emplyPw = $('input[name="emplyPw"]').val()
		   ,emplyPwCheck = $('input[name="emplyPwCheck"]').val();
		console.log('떨어졌다.');
		if(validationCheckPw(emplyPw)) {
			$('input[name="emplyPw"]').attr('class','form-control is-invalid');
			$('input[name="emplyPw"]').focus();
			if(emplyPw != emplyPwCheck || checkFailed == 1) {
				$('input[name="emplyPwCheck"]').attr('class','form-control is-invalid');
			}
			return false;
		}else{
			$('input[name="emplyPw"]').attr('class','form-control');
			checkFailed  = 0;
			if(emplyPw == emplyPwCheck && checkFailed == 0) {
				$('input[name="emplyPwCheck"]').attr('class','form-control is-valid');
			}
		}
	});
	/* 유효성검사 패스워드 */
	/* 나머지 유효성 검사  */
	$(document).on('click', '#modifyBtn', function(){
		var
		   emplyId = $('input[name="emplyId"]').val()
		   ,emplyName = $('input[name="emplyName"]').val()
		   ,emplyNumber = $('input[name="emplyNumber"]').val()
		   ,emplyBirth = $('input[name="emplyBirth"]').val()
		   ,emplyHomeAddressZip = $('input[name="emplyHomeAddressZip"]').val()
		   ,emplyHomeAddress = $('input[name="emplyHomeAddress"]').val()
		   ,emplyHomeAddressDetail = $('input[name="emplyHomeAddressDetail"]').val()
		   ,modifyForm = $('#modifyForm');
		console.log('눌렀다.');
		if(validationCheckBasic(emplyName) 		  || validationCheckBasic(emplyNumber)			 ||
		   validationCheckBasic(emplyBirth) 	  || validationCheckBasic(emplyHomeAddressZip) 	 ||
		   validationCheckBasic(emplyHomeAddress) || validationCheckBasic(emplyHomeAddressDetail)) {
			return false;
		}else{
			$('input[name="emplyId"]').prop('disabled', false);
			modifyForm.submit();
		}
	});
	/* 나머지 유효성 검사 끝  */
});