"use strict";
var elNumber=document.getElementById("number");

function setupClickHandlers() {
	var elTracks=document.getElementsByClassName("track");
	
	function generateClickHandler(trackNumber){
		return function clickHandler(){
			elNumber.innerHTML=trackNumber;
		}
	}
	for(var i=0,l=elTracks.length;i<l;i++){
			elTracks[i].addEventListener("click",generateClickHandler(i));
			
	}
}
setupClickHandlers();