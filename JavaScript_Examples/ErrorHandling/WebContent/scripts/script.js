"use strict";
function divide(){
	var numerator=Number(prompt("Enter numerator"));
	var denominator=Number(prompt("Enter denominator"));
	try{
		if(denominator == 0){
			throw{
				error: "Divide by zero error",
				message: "Denominator can not be zero"
			};
		}
		else{
			alert("Result = "+(numerator/denominator));
		}
	}
	catch(e){
		document.write(e.error+"<br/>");
		document.write(e.message+"<br/>");
	}
	
}