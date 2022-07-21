$(function(){
	"use strict";
	/* 아이디 유효성 검사 */
	function validationCheckId(data){
		var 
		    number = data.search(/[0-9]/g)
		    ,english = data.search(/[a-z]/ig)
		    ,spece = data.search(/[`~!@@#$%^&*|₩₩₩'₩";:₩/?]/gi)
			,reg = /^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$/;
		if(typeof data == 'undefined' || data == null || data == '' || data == '@ksmart.or.kr') {
			$('input[name="emplyId"]').attr('placeholder','아이디를 입력해 주세요.');
			return true;
		}else if(/(\w)\1\1\1/.test(data)) {
			$('input[name="emplyId"]').val('');
			$('input[name="emplyId"]').attr('placeholder','같은 문자를 연속 4번 이상 사용 할 수 없습니다.');
			return true;
		}else if(number < 0 || english < 0) {
			$('input[name="emplyId"]').val('');
			$('input[name="emplyId"]').attr('placeholder','영문과 숫자를 조합해 주세요.');
			return true;
		}else if(data.search(/\s/) != -1) {
			$('input[name="emplyId"]').val('');
			$('input[name="emplyId"]').attr('placeholder','아이디에 공백을 추가 할 수 없습니다.');
			return true;
		}else if(data.length < 5 || data.length > 17){
			$('input[name="emplyId"]').val('');
			$('input[name="emplyId"]').attr('placeholder','아이디를 5자 이상 17자 이하로 입력하세요.');
			return true;
		}else if(spece != -1) {
			$('input[name="emplyId"]').val('');
			$('input[name="emplyId"]').attr('placeholder','아이디에 특수문자를 사용 할 수 없습니다.');
			return true;
		}
		return false;
	}
	/* 아이디 유효성 검사 끝 */
	$(document).on('blur', '#emplyId', function(){
		var 
			 addDomain = '@ksmart.or.kr'
			,emplyId = $('input[name="emplyId"]').val();
		if(validationCheckId(emplyId)) {
			$('input[name="emplyId"]').attr('class','form-control is-invalid');
			$('input[name="emplyId"]').focus();
			return false;
		}else{
			emplyId = $('input[name="emplyId"]').val()+addDomain;
			/* ajax 아이디 중복체크 */
			var request = $.ajax({
				url: "/member/emailCheck", 
				method: "POST", 
				data: { 'emplyId' : emplyId}, 
				dataType: "json" 
			});				 
			request.done(function( isEmailCheck ) {
				console.log(isEmailCheck);	
				/* 아이디 중복여부에 따른 input, select, button 활성화 여부 */
				/* 아이디 중복 시 alert "중복된 아이디입니다." */
				// true : 아이디 중복 x , false: 아이디 중복 o
				if(isEmailCheck){
					$('input[name="emplyId"]').attr('class','form-control is-valid');
					$('input[name="emplyId"]').val(emplyId);
					$('#signUp').prop('disabled',false);
				}else{
					$('input[name="emplyId"]').attr('class','form-control is-invalid');
					$('input[name="emplyId"]').attr('placeholder','이미 사용중인 아이디 입니다.');
					$('input[name="emplyId"]').focus();
					$('input[name="emplyId"]').val('');
				}
				
			});				 
			request.fail(function( jqXHR, textStatus ) {
				alert( "Request failed: " + textStatus );
			});	
		}							
	});
	/* 아이디 중복체크끝 */	
	/* 패스워드확인 */
	/* 패스워드 유효성 검사 */
	var checkFailed  = 0;
	function validationCheckPw(data){
		var 
		    number = data.search(/[0-9]/g)
		    ,english = data.search(/[a-z]/ig)
		    ,spece = data.search(/[`~!@@#$%^&*|₩₩₩'₩";:₩/?]/gi)
			,reg = /^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$/;
		if(typeof data == 'undefined' || data == null || data == '' || data == '@ksmart.or.kr') {
			$('input[name="emplyPw"]').val('');
			$('input[name="emplyPw"]').attr('placeholder','비밀번호를 입력해 주세요.');
			checkFailed  = 1;
			return true;
		}else if(/(\w)\1\1\1/.test(data)) {
			$('input[name="emplyPw"]').val('');
			$('input[name="emplyPw"]').attr('placeholder','같은 문자를 연속으로 4번 이상 사용할수 없습니다.');
			checkFailed  = 1;
			return true;
		}else if(number < 0 || english < 0) {
			$('input[name="emplyPw"]').val('');
			$('input[name="emplyPw"]').attr('placeholder','영문과 숫자를 조합해 입력해주세요.');
			checkFailed  = 1;
			return true;
		}else if(data.search(/\s/) != -1) {
			$('input[name="emplyPw"]').val('');
			$('input[name="emplyPw"]').attr('placeholder','아이디에 공백을 추가할수 없습니다.');
			checkFailed  = 1;
			return true;
		}else if(data.length < 5 || data.length > 17){
			$('input[name="emplyPw"]').val('');
			$('input[name="emplyPw"]').attr('placeholder','5자 이상 17자 이하로 입력하세요');
			checkFailed  = 1;
			return true;
		}else if(spece != -1) {
			$('input[name="emplyPw"]').val('');
			$('input[name="emplyPw"]').attr('placeholder','특수문자불가');
			checkFailed  = 1;
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
			$('#signUp').attr('data-target', '#info-alert-modal');
			return true;
		}
		$('#signUp').attr('data-target', '');
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
				$('#signUp').prop('disabled',false);
			}
		}
	});
	/* 유효성검사 패스워드 */
	/* 유효성검사 패스워드확인 */
	$(document).on('blur', 'input[name="emplyPwCheck"]', function(){
		var 
			emplyPw = $('input[name="emplyPw"]').val()
		   ,emplyPwCheck = $('input[name="emplyPwCheck"]').val();
		if(emplyPw != emplyPwCheck || checkFailed == 1) {
			$('input[name="emplyPwCheck"]').attr('class','form-control is-invalid');
		}else{
			$('input[name="emplyPwCheck"]').attr('class','form-control is-valid');
			$('#signUp').prop('disabled',false);
			checkFailed  = 0;
		}
	});
	/* 유효성검사 패스워드확인 */
	$(document).on('click', '#signUp', function(){
		var
		   emplyName = $('input[name="emplyName"]').val()
		   ,emplyNumber = $('input[name="emplyNumber"]').val()
		   ,emplyBirth = $('input[name="emplyBirth"]').val()
		   ,emplyHomeAddressZip = $('input[name="emplyHomeAddressZip"]').val()
		   ,emplyHomeAddress = $('input[name="emplyHomeAddress"]').val()
		   ,emplyHomeAddressDetail = $('input[name="emplyHomeAddressDetail"]').val()
		   ,emplyAccount = $('input[name="emplyAccount"]').val()
		   ,organizationCodeS = $('#organiS option:selected').val()
		   ,signUpForm = $('#signUpForm');
		console.log('눌렀다.');
		if(validationCheckBasic(emplyName) 		  || validationCheckBasic(emplyNumber)			 ||
		   validationCheckBasic(emplyBirth) 	  || validationCheckBasic(emplyHomeAddressZip) 	 ||
		   validationCheckBasic(emplyHomeAddress) || validationCheckBasic(emplyHomeAddressDetail)||
		   validationCheckBasic(emplyAccount)	  || validationCheckBasic(organizationCodeS)) {
			return false;
		}else{
			signUpForm.submit();
		}
	});
	
	/* 다시 패스워드 패스워드 확인창을 선택했을시 */
	$(document).on('focus', '#emplyId', function(){
		$('#signUp').prop('disabled',true);
		$('#emplyId').val('');
	});
	$(document).on('focus', '#emplyPw', function(){
		$('#signUp').prop('disabled',true);
		$('#emplyPw').val('');
	});
	$(document).on('focus', '#emplyPwCheck', function(){
		$('#signUp').prop('disabled',true);
		$('#emplyPwCheck').val('');
	});
	/* 다시 패스워드 패스워드 확인창을 선택했을시 */
	
	/* 부서 리스트 뿌리기 */
	/* 부 서 대 -> 중 리 스 트 가 져 오 기 */
	$(document).on('change','#organiL', function(){
		var organiL = $('#organiL option:selected').val();
		console.log(organiL);
		/* 에이작스 */
		var request = $.ajax({
			url: "/member/organizationMName", 
			method: "GET", 
			data: { 'organiL' : organiL}, 
			dataType: "json"
		});				 
		request.done(function( organiMName ) {
			console.log(organiMName);
			var option2 = $("<option>"+'Choose...'+"</option>");
			$('#organiMSelect').css('display','block');
			$('#organiM').empty();
			$('#organiM').append(option2);
			for(var i = 0;i < organiMName.length;i++){
				console.log(organiMName[i].organizationNameM);
				var option = $("<option value="+organiMName[i].organizationNameM+">"+organiMName[i].organizationNameM+"</option>");
				$('#organiM').append(option);
			}
			if(organiMName == '' || organiMName == null || organiMName == 'undefined'){
				$('#organiMSelect').css('display','none');
				$('#organiSSelect').css('display','none');
			}
		});				 
		request.fail(function( jqXHR, textStatus ) {
			alert( "Request failed: " + textStatus );
		});
		/* 에이작스 */
	});
	/* 부 서 대 -> 중 리 스 트 가 져 오 기 */		
	/* 부 서 중 -> 소 리 스 트 가 져 오 기 */
	$(document).on('change','#organiM', function(){
		var organiM = $('#organiM option:selected').val();
		console.log(organiL);
		/* 에이작스 */
		var request = $.ajax({
			url: "/member/organizationSName", 
			method: "GET", 
			data: { 'organiM' : organiM}, 
			dataType: "json"
		});				 
		request.done(function( organiSName ) {
			console.log(organiSName);
			var option2 = $("<option>"+'Choose...'+"</option>");
			$('#organiSSelect').css('display','block');
			$('#organiS').empty();
			$('#organiS').append(option2);
			for(var i = 0;i < organiSName.length;i++){
				console.log(organiSName[i].organizationNameS);
				var option = $("<option value="+organiSName[i].organizationCodeS+">"+organiSName[i].organizationNameS+"</option>");
				$('#organiS').append(option);
			}
			if(organiSName == '' || organiSName == null || organiSName == 'undefined'){
				$('#organiSSelect').css('display','none');
			}
		});				 
		request.fail(function( jqXHR, textStatus ) {
			alert( "Request failed: " + textStatus );
		});
		/* 에이작스 */
	});
	/* 부 서 중 -> 소 리 스 트 가 져 오 기 */
	/* 부서 리스트 뿌리기끝 */	
});