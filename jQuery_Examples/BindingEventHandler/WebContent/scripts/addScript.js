$(document).ready(function(){
	//$('ul').on('click','li',function(){
		//$(this).fadeOut(500);
	//});
	$('ul').delegate('li','click',function(){
		$(this).fadeOut(500);
	});
	//$('li').live('click',function(){
		//$(this).fadeOut(500);
	//});
	$('#btnAdd').on('click',function(){
		$('ul').append('<li>New List Item</li>');
	});
	$('#btnUndelegate').on('click',function(){
		//$('ul').off('click','li');
		$('ul').undelegate('li','click');
		//$('li').die('click');
	});
	
});