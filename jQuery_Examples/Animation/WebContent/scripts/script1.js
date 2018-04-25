"use strict";
$(document).ready(function(){
	$('#divId').on({
		mouseover:function(){
			$(this).css({'cursor':'hand' ,'border-color':'red'});
		},
		mouseout:function(){
			$(this).css({'cursor':'default','border-color':'grey'});
		},
		click:function(){
			var imageURL=$(this).attr('src');
			var effect=$('#selectImgEffect').val();
			var duration=$('#selectImgDuration').val()*1000;
			var mainImg=$('#mainImage');
			
			if(effect=='Fade'){
				mainImg.fadeOut(duration,function(){
					$(this).attr('src',imageURL);
				}).fadeIn(duration);
			}
			else
			{
				mainImg.slideUp(duration,function(){
					$(this).attr('src',imageURL);
				}).slideDown(duration);
			}
			
		}
	},'img');
	
	var mainImgELement=$('#mainImage');
	var height=parseInt(mainImgELement.attr('height'));
	var width=parseInt(mainImgELement.attr('width'));
	$('#btnEnlarge').click(function(){
		height+=100;
		width+=100;
		mainImgELement.animate({
			'height':height,
			'width':width
		});
	});
	$('#btnShrink').click(function(){
		height-=100;
		width-=100;
		mainImgELement.animate({
			'height':height,
			'width':width
		});
	});
});