// comment

int center = 0;

void setup() {
  size(400,400);
  center = width / 2;
}

void draw() {

    float x = random(width);
    float y = random(height);
    stroke(0);
    if ( x < center ) {
        stroke(0,0,255);
    }
    if ( y < center ) {
        stroke(255,0,0);
    }
    if ( y < center && x > center) {
        stroke(0,255,0);
    }
    line(center,center, x, y);

}
