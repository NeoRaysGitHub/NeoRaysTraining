"use strict";
$(document).ready(function(){
	$('#btnClickMe').bind('click mouseover mouseout',function(event){
		if(event.type=='click'){
		$('#divResult').html('Button clicked at'+'X='+event.pageX+'Y='+event.pageY);
		}
		else if(event.type=='mouseover'){
			$(this).addClass('ButtonStyle');
		}
		else{
			$(this).removeClass('ButtonStyle');
		}
	});
	$('#btnEnableMouseOverEffect').click(function(){
		$('#btnClickMe').bind('mouseover',function(){
			$(this).addClass('ButtonStyle');
		});
	});
	$('#btnDisableMouseOverEffect').click(function(){
		$('#btnClickMe').unbind('mouseover');
	});
});