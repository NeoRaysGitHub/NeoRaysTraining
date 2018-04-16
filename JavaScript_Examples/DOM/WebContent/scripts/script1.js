"use strict"
var p1=document.getElementById("p1");
var navigation=document.getElementsByTagName("li");
var test=document.getElementsByTagName("p");


console.log("What is the type of  this Element:",p1.nodeType);
console.log("This is the inner HTML:",p1.innerHTML);
console.log("Does it have any child node:",p1.childNodes);	

var listItem=document.getElementsByTagName("li");
console.log("we have:",listItem.length,"items");

p1.innerHTML="I Change the text by using javascript";

var createPTag=document.createElement("p");
createPTag.innerHTML="I just created a new P tag with javascript";
document.getElementById("maincontainer").appendChild(createPTag);

var createTextElement=document.createTextNode("This is another text node");
document.getElementById("maincontainer").appendChild(createTextElement);

document.getElementById("p1").innerHTML=document.getElementById("p2").nodeName;