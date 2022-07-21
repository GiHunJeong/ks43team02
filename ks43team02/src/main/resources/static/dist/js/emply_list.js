$(function(){
	"use strict";	
	/* 모달 동적 반응 */		
	$('.modalBtn').click(function(){ //모달 삭제 버튼을 눌렀을대 반응
		var 
			$delBtn = $('#delBtn')
		   ,emplyId= $(this).parents('tr').children('td')[0].innerText; //td요소의 0번째인 emplyId를 가져옴
		
		$delBtn.click(function(){
			location.href='/member/emply_del_all?emplyId=' + emplyId; //해당 주소로 가져온 emplyId를 뿌려줌
		});
	});
	/* 모달 동적 반응 */
});