"use strict"
var numbers = [10, 20, 30];
// Print the array elements.
document.write("Array elements are: " + numbers + "<br> ");

// Get length of array.
var length = numbers.length;
document.write("Length of the array is: " + length);

document.write("<br>");
document.write("<br>");

//Create an empty array.
var numbers = [];
document.write("creating the new array using push:"+"<br>");
// Add two elements to the array with push calls.
numbers.push(0);
numbers.push(10);
numbers.push("pruthvi");
numbers.push(true);
document.write("array elements are:" + numbers);

document.write("<br>");
document.write("<br>");

var colors = ["red", "blue", "green"];
document.write("retrieving the array elements using pop:"+"<br>");
//Remove last element from the array.
var removed = colors.pop();
document.write(colors + "; removed: " + removed);

document.write("<br>");
document.write("<br>");



