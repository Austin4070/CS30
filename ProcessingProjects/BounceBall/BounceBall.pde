Ball[] ballGroup;
int pos = 0;

void setup() {
    size(1400,700);
    ballGroup = new Ball[10];


}
void draw() {
    background(70,30,50);


    for (int 1 = 0; i < pos; i++) {
        ballgroup[i].display();
    }
}

void mousePressed() {
    BallGroup[pos] = new Ball(mouseX, mouseY, 100);

    if (pos < ballGroup.length) {

    }
}