$("form span").hide();

$("#password").keyup(errorMessageEvent).keyup(enablebutton);
$("#confirm_password").keyup(matchError).keyup(enablebutton);

function isPasswordValid()
{
	return $("#password").val().length >6;
	
}

function isPassMatching(){
	
	return $("#confirm_password").val() === $("#password").val();
}

function isbuttonenabled(){
	
	return isPasswordValid() && isPassMatching();
}

function errorMessageEvent()
{
	if(isPasswordValid())
		{
		$(this).next().hide();
		}
	else
		{
		$(this).next().show();
		}
}

function matchError()
{
	if(isPassMatching())
		{
		$(this).next().hide();
		}
	else
		{
		$(this).next().show();
		}
}

function enablebutton()
{
	$("#submit").prop("disabled",!isbuttonenabled());
	
	if(!isbuttonenabled())
		{
		$("#submit").css({backgroundColor:"grey" , color:"black"});
		}
	else
		{
		$("#submit").css({backgroundColor:"#1167a6" , color:"white"});
		}
}