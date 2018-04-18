"use strict";
var myImage=document.getElementById("image");
var arrayImage=["images/smiley.jpg","images/chicken.jpg","images/kitten.jpg","images/mickey.jpg","images/sky.jpeg"];
var imageIndex=0;

function changeImage(){
	myImage.setAttribute("src",arrayImage[imageIndex]);
	imageIndex++;
	if(imageIndex>=arrayImage.length){
		imageIndex=0;
	}
} 
setInterval(changeImage,3000);