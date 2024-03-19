// Project Title
// Your Name
// Date
//
// Extra for Experts:
// - describe what you did to take this project "above and beyond"

// State variable for the button
let buttonPressed = false;

// Button object to store all of the button variable together
let myButton = {x: 0, y: 0, w: 0, h: 0, color: ""}

function setup() {
  createCanvas(windowWidth, windowHeight);
  
  //Set the initial properties of myButton
  //subtract 1/2 the w and h from x and y to get true center
  myButton.w = 120;
  myButton.h = 40;
  myButton.x = width/2 - myButton.w/2;
  myButton.y = height/2 - myButton.h/2;
  myButton.color = "lightblue";
}


function draw() {
  background(220);

  if (buttonPressed===false) {
    //Calls the myButton function in the draw loop
    drawButton();
  }
  else{
  createBall();
  }
}


//build in p5js funciton for mouse reactions
function mousePressed() {

  //Checks if the mouse is within the x coordinates of the button
  if (mouseX > myButton.x && mouseX < (myButton.x + myButton.w)) {

    //Switch "true" out for a similar condition that checks y coordinates
    if(mouseY > myButton.y && mouseY < (myButton.y + myButton.h)) {
      buttonPressed = true;
    }
    
  }
}


//custom function that draws the button when called
function drawButton() {
  fill(myButton.color);
  rect(myButton.x, myButton.y, myButton.w, myButton.h);
}
function createBall() {
  
  //create a temp ball object
  
  let newball = {
  
  x: random(width),
  
  y: random(height),
  
  diameter: random(25, 100),
  
  dx: random(-5, 5),
  
  dy: random(-5, 5),
  
  };
circle(newball.x , newball.y , newball.diameter)

}
