class Walker {
  int x, y; //Position
  int size;
  int speed;
  
  // Constructor
  Walker(int tempx, int tempy) {
    x = tempx;
    y = tempy;
    size = 25;
    speed = 5;
  }
  
  void display() {
    fill(0);
    rect(x,y,size,size);
  }
  
  void move(int dir) {
    // Dir is a state variable representing direction/movement from keyPressed
    if (dir == 1) {
      y = y + speed;
    }
  }
  
}
