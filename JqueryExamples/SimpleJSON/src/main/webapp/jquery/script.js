var pageCounter = 1;
var animalContainer = document.getElementById("animal-info");
var btn = document.getElementById("btn");

btn.addEventListener("click", function()
		{
	var ourRequest = new XMLHttpRequest();
	ourRequest.open('GET', '../jquery/animals-' + pageCounter +'.json');
	ourRequest.onload = function()
	{
		if(ourRequest.status >=200 && ourRequest.status < 400)
		{
			var ourData = JSON.parse(ourRequest.responseText);
			console.log(ourData);
			renderHTML(ourData);
		} 
		else 
		{
			console.log("We are trying to connect to the server...");
		}
	};
	
ourRequest.onerror = function(){
	console.log("Connection error");
};

ourRequest.send();
pageCounter++;
if(pageCounter > 1){
	btn.classList.add("hide-me");
}
});

function renderHTML(data)
{
var htmlString = "";
console.log(data);
for(i = 0; i < data.length; i++){
	htmlString += "<p>"+data[i].name + " is a "+data[i].species+" it likes  ";
	
	for(ii = 0; ii<data[i].foods.likes.length;ii++){
		if(ii ==0){
			htmlString+=data[i].foods.likes[ii];
		} else {
			htmlString+=" and "+data[i].foods.likes[ii];
		}
	}
	
	htmlString+=" and it dislikes  ";
	
	for(ii = 0; ii < data[i].foods.dislikes.length;ii++){
		console.log(data[i].foods.dislikes.length);
		if(ii ==0){
			htmlString+=data[i].foods.dislikes[ii];
		}else{
			htmlString+=" and "+data[i].foods.dislikes[ii];
		}
	}
	
	htmlString+="</p>";
}
animalContainer.insertAdjacentHTML('beforeend', htmlString);

}