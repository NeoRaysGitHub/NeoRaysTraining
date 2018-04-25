$(document).ready(function(){
	var imageURLs = new Array();
	var intervalId;
	var btnStart = $('#btnstart');
	var btnStop = $('#btnstop');
	$('#divId img').each(function(){
		imageURLs.push($(this).attr('src'));
	});
	function setImage(){
		var mainImageElement=$('#mainImage');
		var currentImageURL=mainImageElement.attr('src');
		var currentImageIndex=$.inArray(currentImageURL,imageURLs);
		if(currentImageIndex==(imageURLs.length-1)){
			currentImageIndex=-1;
		}
		mainImageElement.attr('src',imageURLs[currentImageIndex+1]);
	}
	btnStart.click(function(){
		intervalId=setInterval(setImage,500);
		$(this).attr('disabled','disabled');
		btnStop.removeAttr('disabled');
	});
	btnStop.click(function(){
		clearInterval(intervalId);
		$(this).attr('disabled','disabled');
		btnStart.removeAttr('disabled');
	}).attr('disabled','disabled');	
});
