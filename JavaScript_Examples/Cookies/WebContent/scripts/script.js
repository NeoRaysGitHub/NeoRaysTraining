"use strict"
window.onload=function(){
	if(document.cookie.length!=0){
		var nameValueArray=document.cookie.split("=");
		document.bgColor=nameValueArray[1];
		document.getElementById("bgTheme").value=nameValueArray[1];
	}
}

function setColorCookie(){
	var selectedColor=document.getElementById("bgTheme").value;
	if(selectedColor!="selectcolor"){
		document.bgColor=selectedColor;
		document.cookie="color="+selectedColor+";expires=Fri,17 aug 2018 01:00:00 UTC;";
	
	}
}
