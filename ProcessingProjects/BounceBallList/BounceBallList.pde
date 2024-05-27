//Declaring the object Array List
ArrayList<Ball> ballGroup = new ArrayList<Ball>();

//Ball[] ballGroup = new Ball[10];
//int pos = 0;

void setup() {
    size(1400,700);
}

void draw() {
    background(70,30,50);
    for (int i = 0; i < ballGroup.size(); i++) {
        ballGroup.get(i).display();
        ballGroup.get(i).move();
        // Original Array Code
        // ballGroup[i].display();
        // ballGroup[i].move();
        }
    
}

void mousePressed() {
    // Creates a new object at the end of the ArrayList
    ballGroup.add(new Ball(mouseX, mouseY, 100, width, height));

    // //Creates a new object at this array position
    // if (pos < ballGroup.length) {
    //     ballGroup[pos] = new Ball(mouseX, mouseY, 100);
    //     pos++;
    // }
}