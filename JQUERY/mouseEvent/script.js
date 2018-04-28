"use strict";
$(document).ready(function(){
	$('img[src="help.png"]').mouseover(function(){
		$('#'+getDivId(this)).fadeIn(400);
		$(this).css('cursor','pointer');
	}).mouseout(function(){
		$('#'+getDivId(this)).fadeOut(400);
	});
function getDivId(helpIcon){
	var helpIconId=$(helpIcon).attr('id');
	return helpIconId.replace('img','div');
	}
});