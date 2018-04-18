window.onload=function()
{
	if(document.cookie.length!=0)
		{
		var nameArray=document.cookie.split("=");
		document.body.background=nameArray[1];
		document.getElementById("cook").value=nameArray[1];
		  //document.getElementById("shelf").value = nameArray[3];
		
		}
	
}
function setBackground()
{
var birds = document.getElementById("cook").value;
if(birds!="Select Background")
	{
	document.body.background=birds;
	document.cookie="birds="+birds+";expires=sat,15 april 2018";
	}
}