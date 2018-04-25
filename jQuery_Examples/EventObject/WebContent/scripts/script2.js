$(document).ready(function(){
	$('#btn').mouseup(function(event){
		var whichButton='';
		switch(event.which){
		case 1:whichButton="Left Button Clicked";
				break;
		case 2:whichButton="Middle Button Clicked";
				break;
		case 3:whichButton="Right Button Clicked";
				break;
		default:whichButton="Invalid Button Clicked";
				break;
		}
		$('#divResult').html(whichButton);
	});
});