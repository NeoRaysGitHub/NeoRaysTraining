"use strict";
$(document).ready(function(){
	$('#btnClickMe').on({
		click:function(event){
			$('#divResult').html('Button clicked at'+'X='+event.pageX+'Y='+event.pageY);
		},
		mouseover:function(){
			$(this).addClass('ButttonStyle');
		},
		mouseout:function(){
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