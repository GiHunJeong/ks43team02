
$(function() {
    "use strict";
    
    /* 급여계산기 function Start */
    var payCirculater = function(){
		var 
		fixedPayAmount = $('.fixedPayAmount'),
		deductionPayAmount = $('.deductionPayAmount');
		
		var fixedAmountArray = new Array();
		fixedPayAmount.each(function(i){
			fixedAmountArray.push(fixedPayAmount.eq(i).val());
				console.log(fixedAmountArray,'fixedAmountArray');
			});
		
		var deduceAmountArray = new Array();
		deductionPayAmount.each(function(i){
			deduceAmountArray.push(deductionPayAmount.eq(i).val());
				console.log(deduceAmountArray,'deduceAmountArray');
			});
		
		var basicPayVal = Number($('input[name="basicPay"]').val());
		console.log(basicPayVal);
		
		var 
		fAmountSum = 0,
		dAmountSum = 0;
		
		for(var i=0; i<fixedAmountArray.length; i++){
			fAmountSum += Number(fixedAmountArray[i]);
		}
		console.log(fAmountSum);
		
		for(var j=0; j<deduceAmountArray.length; j++){
			dAmountSum += Number(deduceAmountArray[j]);
		}
		console.log(dAmountSum);
		
		var
		totalPaymentResult = basicPayVal + fAmountSum - dAmountSum;
		
		$('input[name="bonusPay"]').val(fAmountSum);
		$('input[name="totalDeduction"]').val(dAmountSum);
		$('input[name="totalPayment"]').val(totalPaymentResult);
		
	};
    /* 급여계산기 function End */
	
	/* 수정 컨펌 Start */
	$(document).ready(function(){
		$('#modifyBtn').click(function(){
			var result = confirm('수정하시겠습니까?');
			
	        if(result == true) {
	           //yes
	        	alert('수정이 완료되었습니다.')
	            location.replace('payAdd_list');
	        } else {
	        	return false;
	            //no
	        }
	    });
	});
	/* 수정 컨펌 End */
	
	/* 기본급 수정 function Start */	
	$(document).on('click','#modifySalaryBtn', function(){
		var salaryInfo = $('#salaryInfo').val();
		if(salaryInfo != 0 && salaryInfo != '' && salaryInfo != ' '){
			console.log(salaryInfo);
			$('#basicPay').val(salaryInfo);
			alert('기본급이 변경되었습니다.');
			payCirculater();
		} else {
			alert('정상적인 값을 입력해주세요!');
		}
	});
	/* 기본급 수정 function End */
	
	/* 공제액 모달 확인버튼 클릭시 창닫고 값전송 Start */
	$(document).on('click','#closeDeduceModal', function(){
		$('#deducePayList').empty();
		var tr = $('#selectedDeduceList tr');
		var deductionName = tr.find('#deductionName');
		var deductionAmount = tr.find('#deductionAmount');
		console.log(deductionName.text(), deductionAmount.text());
	
		var nameArr = new Array();
		deductionName.each(function(i){
			nameArr.push(deductionName.eq(i).text());
				console.log(nameArr);
			});
		
		var amountArr = new Array();
		deductionAmount.each(function(i){
			amountArr.push(deductionAmount.eq(i).text());
				console.log(amountArr);
			});
			
		var html2 = '';
		html2 += '<tr>';
		html2 += '	<td class="bg-primary text-white col-md-8">공제액 항목</td>';
		html2 += '	<td class="bg-primary text-white">금액(원)</td>';
		html2 += '</tr>';
		$('#deducePayList').append(html2);
		
			for(var i=0; i<nameArr.length; i++){
				var html = '';
				html += '<tr>';;
				html += '	<td>';
				html += '		<input type="hidden" class="deducePayList" name="deductionPayList" value="'+ nameArr[i] +'"/>'+ nameArr[i];
				html += '	</td>';
				html += '	<td>';
				html += '		<input type="hidden" class="deductionPayAmount" name="deductionPayAmount" value="'+ amountArr[i] +'"/>'+ amountArr[i];
				html += '	</td>';
				html += '</tr>';
				$('#deducePayList').append(html);
			}
			payCirculater();
			$('#deduceMyModal').modal('hide');
	});
	/* 공제액 모달 확인버튼 클릭시 창닫고 값전송 End */
	
	/* 공제액 모달에서 선택된 리스트 x 클릭시 삭제 및 리스트로 보내기 Start */
	$(document).on('click','.dDelList', function(){
		var text = $(this).parent().find('span').text();
		console.log(text);
		var option = '';
		option += '<option>';
		option += 		text;
		option += '</option>';
		$('#setDeduceList').append(option);
		$(this).parent().parent().remove();
	});
	/* 공제액 모달에서 선택된 리스트 x 클릭시 삭제 및 리스트로 보내기 End */
	
	/* 공제액 항목 불러오기 ajax Start */
	var request =
		$.ajax({
		url: "/pay/deductionSetting",
		method: "POST",
		dataType: "json",
		});
		request.done(function(data) {
			console.log(data);
			for(var i=0; i<data.length; i++){
				var html = '';
				html += '<option value="' + data[i].deductionName + '">' + data[i].deductionName + '</option>'
				$('#setDeduceList').append(html);
			}
			/* 공제액 모달에서 항목선택시 추가 Start */
			$(document).on('change', '#setDeduceList', function(){
				console.log($(this).val());
				for(var j=0; j<data.length; j++){
					console.log(data[j]);
					if(data[j].deductionName == $(this).val()){
						console.log(data[j].deductionAmount);
						var html = 	'';
						html += '<tr>';
						html += '	<td>';
						html += '		<span id="deductionName">'; 
						html += 			$(this).val(); 
						html += '		</span>';
						html += '		<a href="javascript:void(0);" class="fDelList"> x</a>'; 
						html += '	</td>';
						html += '	<td>';
						html += '		<span id="deductionAmount">'; 
						html += 			data[j].deductionAmount; 
						html += '		</span>';
						html += '	</td>';
						html += '</tr>';
						$('#selectedDeduceList tbody').append(html);
						$('#setDeduceList option:selected').remove();
					}
				}
    		});
			/* 공제액 모달에서 항목선택시 추가 End */
		});
		request.fail(function( jqXHR, textStatus ) {
			alert( "Request failed: " + textStatus );
		});
	/* 공제액 항목 불러오기 ajax End */
	
	/* 고정지급금 모달 확인버튼 클릭시 창닫고 값전송 Start */
	$(document).on('click','#closeFixedModal', function(){
		$('#fixedPayList').empty();
		var tr = $('#selectedFixedList tr');
		var fixedName = tr.find('#fixedName');
		var fixedAmount = tr.find('#fixedAmount');
		console.log(fixedName.text(), fixedAmount.text());
		
		var nameArr = new Array();
		fixedName.each(function(i){
			nameArr.push(fixedName.eq(i).text());
				console.log(nameArr);
			});
		
		var amountArr = new Array();
		fixedAmount.each(function(i){
			amountArr.push(fixedAmount.eq(i).text());
				console.log(amountArr);
			});
		
		var html2 = '';
		html2 += '<tr>';
		html2 += '	<td class="bg-primary text-white col-md-8">고정지급급여 항목</td>';
		html2 += '	<td class="bg-primary text-white">금액(원)</td>';
		html2 += '</tr>';
		$('#fixedPayList').append(html2);
		
			for(var i=0; i<nameArr.length; i++){
				var html = '';
				html += '<tr>';
				html += '	<td>';
				html += '		<input type="hidden" class="fixedPayList" name="fixedPayList" value="'+ nameArr[i] +'"/>'+ nameArr[i];
				html += '	</td>';
				html += '	<td>';
				html += '		<input type="hidden" class="fixedPayAmount" name="fixedPayAmount" value="'+ amountArr[i] +'"/>'+ amountArr[i];
				html += '	</td>';
				html += '</tr>';
				$('#fixedPayList').append(html);
			}
			payCirculater();
			$('#fixedMyModal').modal('hide');
	});
	/* 고정지급금 모달 확인버튼 클릭시 창닫고 값전송 End */
	
	/* 고정지급금 모달에서 선택된 리스트 x 클릭시 삭제 및 리스트로 보내기 Start */
	$(document).on('click','.fDelList', function(){
		var text = $(this).parent().find('span').text();
		console.log(text);
		var option = '';
		option += '<option>';
		option += 		text;
		option += '</option>';
		$('#setFixedList').append(option);
		$(this).parent().parent().remove();
	});
	/* 고정지급금 모달에서 선택된 리스트 x 클릭시 삭제 및 리스트로 보내기 End */
	
	/* 고정지급급여 항목 불러오기 ajax Start */
	var request = 
		$.ajax({
		url: "/pay/fixedSetting",
		method: "POST",
		dataType: "json",
		async: false
	});
	request.done(function(data) {
		for(var i=0; i<data.length; i++){
			var html = '';
			html += '<option value="' + data[i].fixedAllowName + '">' + data[i].fixedAllowName + '</option>'
			if($())
			$('#setFixedList').append(html);
		}
		/* 고정지급금 모달에서 항목선택시 추가 Start */
		$(document).on('change', '#setFixedList', function(){
			console.log($(this).val());
			for(var j=0; j<data.length; j++){
				if(data[j].fixedAllowName == $(this).val()){
					console.log(Number(data[j].fixedAllowAmount));
					var html = 	'';
					html += '<tr>';
					html += '	<td>';
					html += '		<span id="fixedName">'; 
					html += 			$(this).val(); 
					html += '		</span>';
					html += '		<a href="javascript:void(0);" class="fDelList"> x</a>'; 
					html += '	</td>';
					html += '	<td>';
					html += '		<span id="fixedAmount">'; 
					html += 			data[j].fixedAllowAmount; 
					html += '		</span>';
					html += '	</td>';
					html += '</tr>';
					$('#selectedFixedList tbody').append(html);
					$('#setFixedList option:selected').remove();
				}
			}
		});
		/* 고정지급금 모달에서 항목선택시 추가 End */
	});
	request.fail(function( jqXHR, textStatus ) {
  		alert( "Request failed: " + textStatus );
	});
});
/* 고정지급급여 항목 불러오기 ajax End */