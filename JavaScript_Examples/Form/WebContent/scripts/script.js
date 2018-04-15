function validateForm(){
	var x=document.forms["myForm"]["fname"].value;
	var y=document.forms["myForm"]["lname"].value;
	if(x==""||x==null){
		alert("fill your first name");
		return false;
	}
	else if(y==""||y==null){
		alert("Enter your last name also");
		return false;
	}
}
