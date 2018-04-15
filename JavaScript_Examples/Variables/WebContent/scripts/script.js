var a=10;
var b=20;

var result1=a+b;
alert(result1);

//if else statement
if(a<b){
	var result2=a+b;
	document.write("the result of a and b is:",result2);
}else{
	document.write("data is not valid...")
}


document.write("<br>");
document.write("<br>");

//switch statement
var fruit='apple';
switch(fruit){
case 'orange':
	document.write("orange is 2$");
	break;

case 'banana':
	document.write("banana is 3$");
	break;
	
case 'apple':
	document.write("apple is 5$");
	break;
	
default:
	document.write("fruit is not available");
}