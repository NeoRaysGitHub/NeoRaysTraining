"use strict";
$(document).ready(function(){
	$('#btnClickMe').on('click',{
		firstName:'Pruthvi',
		lastName:'TS'
	},sayHello);
	$('#btnClickMe').on('click',{
		firstName:'Swathi'
	},sayHello);
	$('#btnClickMe').on('click',sayHello);
	
	function sayHello(event){
		if(event.data==null){
			alert('No name provided');
		}
		else{
			alert('Hello'+event.data.firstName+
					(event.data.lastName!=null?''+event.data.lastName:''));
		}
	}
});