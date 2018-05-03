function appendText(){
	var txt1 = "<p>Appending...</p>";
	var txt2 = $("<p></p>").text("Text...");
	var txt3 = document.createElement("p");
	txt3.innerHTML = "using append...";
	$("#pid").append(txt1,txt2,txt3);
	
}



function prependText(){
	var txt1 = "<p>Prepending...</p>";
	var txt2 = $("<p></p>").text("Text...");
	var txt3 = document.createElement("p");
	txt3.innerHTML = "using prepend...";
	$("em").prepend(txt1,txt2,txt3);
	
}
