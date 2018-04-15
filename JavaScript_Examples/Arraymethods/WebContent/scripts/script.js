var fruits = ["Banana", "Orange", "Apple", "Mango"];

alert("displaying the fruits");
document.getElementById("demo").innerHTML =fruits.join("*");

alert("Removing the first element Banana from list");
document.getElementById("demo1").innerHTML =fruits.shift();  

fruits.unshift("Lemon");
alert("adding lemon to the array");
document.getElementById("demo2").innerHTML = fruits;

fruits[0] = "Kiwi"; 
alert("changing the first element to kiwi");
document.getElementById("demo3").innerHTML =fruits;


delete fruits[0]; 
alert("Changing the first element in fruits to undefined");
document.getElementById("demo4").innerHTML =fruits;


fruits[fruits.length] = "Kiwi"; 
alert("Appending Kiwi to fruit");
document.getElementById("demo5").innerHTML =fruits;


fruits.splice(2, 0, "Lemon", "Kiwi"); 
alert("splice() method used to add new items to an array");
document.getElementById("demo6").innerHTML =fruits;


fruits.splice(0, 1);
alert("Removing the first element of fruits");
document.getElementById("demo7").innerHTML =fruits;

var citrus = fruits.slice(3);  
alert("slices out a part of an array starting from array element 1");
document.getElementById("demo8").innerHTML =citrus;


var myGirls = ["Cecilie", "Lone"];
var myBoys = ["Emil", "Tobias", "Linus"];
var myChildren = myGirls.concat(myBoys); 
alert("Concatenates (joins) myGirls and myBoys"); 
document.getElementById("demo9").innerHTML =myChildren;


var arr1 = ["Cecilie", "Lone"];
var arr2 = ["Emil", "Tobias", "Linus"];
var arr3 = ["Robin", "Morgan"];
var myChildren = arr1.concat(arr2, arr3); 
alert("Concatenates arr1 with arr2 and arr3");
document.getElementById("demo10").innerHTML =myChildren;



