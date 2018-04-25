$(document).ready(function(){
	$('#btn').click(function(event){
		getEventDetails(event);
	}).mouseover(function(event){
		getEventDetails(event);
	}).mouseout(function(event){
		getEventDetails(event);
	});
	function getEventDetails(event){
		var eventDetails='Event='+event.type+'<br/>'+
		'X='+event.pageX+'<br/>'+
		'Y='+event.pageY+'<br/>'+
		'Target Element='+event.target.type+'<br/>'+
		'Target Element Tag Name='+event.target.tagName;
		$('#divResult').html(eventDetails);
	}
});