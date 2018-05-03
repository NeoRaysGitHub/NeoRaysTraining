$(document).ready(function (){
	var title = $("em").attr("title");
	$("#pid").text(title);
	
});

$(document).ready(function (){
	 $("em").attr("title" ,"executing Attributes");//setting attr
		var title = $("em").attr("title");//getting attr
	$("#pid1").text(title);
	
});