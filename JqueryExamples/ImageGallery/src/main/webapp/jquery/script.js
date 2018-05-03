var $overlay = $("<div id='overlay'></div>");

$("body").append($overlay);

var $image = $("<img>");

$overlay.append($image);

var $close = $("<img id = 'closeimage'>");

$overlay.append($close);

$("#imagegallery a").click(function (event){
	event.preventDefault();
	
	 var imagesource = $(this).attr("href");
	 
	 $image.attr("src",imagesource);
	 
	 $close.attr("src","../images/close.png");
	 
	 $overlay.show();
	 
});

$close.click(function (){
	$($overlay).hide();
})


