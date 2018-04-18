"use strict";
var a=20;
var b="20";

//comparision operators
//checks whether their values are equal or not
if(a==b){
	document.write("they are equal");
}else{
	document.write("they are not equal");
}

document.write("<br>");

//it checks the values along with data types
if(a===b){
	document.write("they are equal");
}else{
	document.write("they are not equal");
}

document.write("<br>");

//oprator precedence
var c=10+10*20;
document.write(c);

document.write("<br>");

var d=(10+10)*20;
document.write(d);

document.write("<br>");

//logical operators
var a1=30,b1=40;
if(a<=a1 && a1<=b1){
	document.write("condition is true");
}else{
	document.write("condition is false");
}
document.write("<br>");

//ternary operator
var e=(a1>b1)?alert("true"):alert("false");