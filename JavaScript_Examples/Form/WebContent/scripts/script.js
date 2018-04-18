"use strict";
function validateForm(){
	var x=document.forms["myForm"]["fname"].value;
	var y=document.forms["myForm"]["lname"].value;
	var mail=document.forms["myForm"]["mailid"].value;
	var phn=document.forms["myForm"]["phone"].value;
	var age=document.forms["myForm"]["age"].value;
	var password=document.forms["myForm"]["password"].value;
	var pwd=document.forms["myForm"]["pwd"].value;
	if(x=="" || x==null){
		alert("fill your first name");
		return false;
	}else if( x.length<=2){
		alert("enter name more than 2 characters");
		return false;
	}else if(isNaN==false){
		alert("enter only characters");
		return false;
	}
	else if(y=="" || y==null){
		alert("Enter your last name also");
		return false;
	}else if (y.length<=2){
		alert("enter more than 2 characters");
		return false;
	}else if(isNaN==false){
		alert("enter only characters");
		return false;
	}
	else if(mail=="" || mail==null){
		alert("correct mail id is neccessary");
		return false;
	}
	else if(phn==null || phn==""){
		alert("enter phone number");
		return false;
	}else if(phn.length<10 || phn.length>12){
		alert("enter correct digits for phn number");
		return false;
	}
	else if(age==null || age==""){
		alert("enter the age");
		return false;
	}else if(age<18){
		alert("enter age above 18");
		return false;
	}
	else if(password=="" || password==null){
		alert("password is required");
		return false;
	}else if(password.length<6){
		alert("password should not be less than 6 characters");
		return false;
	}
	else if(pwd!=password){
		alert("reenter the correct password");
		return false;
	}
}
