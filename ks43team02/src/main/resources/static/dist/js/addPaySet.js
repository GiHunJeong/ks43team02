
$(function() {
	"use strict";
	/* db에 데이터 전송 컨펌 */
	$(document).on('click','#saveModifyBtn', function(){
		var 
		setDate = $('#paySetDate option:selected').val(),
		setTime = $('#paySetTime').val(),
		fixedList = $('#fixedPayList input').val(),
		deduceList = $('#deductionPayList input').val();
		
		if(setDate == 'undefined' || setDate == null || setDate == ''){
			alert('날짜를 선택해주세요');
			return false;
		}else if(setTime == 'undefined' || setTime == null || setTime == ''){
			alert('시간을 선택해주세요');
			return false;
		}else if(fixedList == 'undefined' || fixedList == null || fixedList == ''){
			alert('고정지급 급여를 선택해주세요');
			return false;
		}else if(deduceList == 'undefined' || deduceList == null || deduceList == ''){
			alert('공제내역을 선택해주세요');
			return false;
		} else {
			var result = confirm('저장하시겠습니까?');
			//no
			console.log(result);
			if(result) {
				$("#paySetForm").submit();
			}
		}
	});
	
	/* 공제액 모달 확인버튼 클릭시 창닫고 값전송 Start */
	$(document).on('click','#closeDeduceModal', function(){
		$('#deductionPayList').empty();
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
		$('#deductionPayList').append(html2);
		
			for(var i=0; i<nameArr.length; i++){
				var html = '';
				html += '<tr>';;
				html += '	<td>';
				html += '		<input type="hidden" class="deductionPayList" name="deductionPayList" value="'+ nameArr[i] +'"/>'+ nameArr[i];
				html += '	</td>';
				html += '	<td>';
				html += '		<input type="hidden" class="deductionPayAmount" name="deductionPayAmount" value="'+ amountArr[i] +'"/>'+ amountArr[i];
				html += '	</td>';
				html += '</tr>';
				$('#deductionPayList').append(html);
			}
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
	var request2 =
		$.ajax({
		url: "/pay/deductionSetting",
		method: "POST",
		dataType: "json",
		});
		request2.done(function(data2) {
			console.log(data2);
			for(var i=0; i<data2.length; i++){
				var html = '';
				html += '<option value="' + data2[i].deductionName + '">' + data2[i].deductionName + '</option>'
				$('#setDeduceList').append(html);
			}
			/* 공제액 모달에서 항목선택시 추가 Start */
			$(document).on('change', '#setDeduceList', function(){
				console.log($(this).val());
				for(var j=0; j<data2.length; j++){
					console.log(data2[j]);
					if(data2[j].deductionName == $(this).val()){
						console.log(data2[j].deductionAmount);
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
						html += 			data2[j].deductionAmount; 
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
		request2.fail(function( jqXHR, textStatus ) {
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