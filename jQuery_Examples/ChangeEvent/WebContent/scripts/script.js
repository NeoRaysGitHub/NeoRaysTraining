"use strict";
$(document).ready(function(){
	$('#ddlCity').change(function(){
		var selectedValue=$(this).val();
		if(selectedValue=='Select')
			selectedValue="Please select city";
		$('#divResult').html(selectedValue);
	});
});
$(document).ready(function(){
	var result='';
	$('.inputRequired').change(function(){
		if(result==''){
			result=$(this).val();
		}else{
			result+=','+$(this).val();
		}
		$('#divResult').html(result);
	});
});