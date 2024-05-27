class Ball {
    int x, y, d; //Declare position and radius variables
    int cr, cg, cb; //RGB values
    int dx, dy; //Velocity or Speed Values
    int width, height; //variables for the screen dimensions

    // Constructor Method
    Ball(int ballx, int bally, int balld, int windoww, int windowh) {
        x = ballx; //set the x cord
        y = bally; //set the y cord
        d = balld; //set the radius

        //Randomize colour values
        cr = int( random(0,255) );
        cg = int( random(0,255) );
        cb = int( random(0,255) );

        //Set Velocity
        dx = int( random(-10,10));
        dy = int( random(-10,10));

        // Passing over the width and height data of the screen
        width = windoww; 
        height = windowh;
    }

    void display() {
        fill(cr, cg, cb);
        circle(x,y,d);
    }

    void move() {
        //apply the rate of change (velocity)
        x = x + dx;
        y = y + dy;

        if (x <= 0 + d/2 || x >= width - d/2) {
            // Reverses direction
            dx = dx * -1;
        }

        if (y <= 0 + d/2 || y >= height - d/2) {
            //Reverse direction
            dy = dy * -1;
        }

    }

    void checkCollision(Ball otherBall) {
        int distanceApart = dist(x, y,otherBall.x, otherBall.y)


        if (distanceApart < d) {
            dy = dy * -1;
            dx = dx * -1;
            otherBall.dy = otherBall.dy * -1;
            otherBall.dx = otherBall.dx * -1;
        }

    }


}