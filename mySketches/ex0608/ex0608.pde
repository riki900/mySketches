// draw concentric circles

void setup() {
  size(200,200);
  background(255 * .75);
  noLoop();
}

void draw() {

  fill(0,76);
  noStroke();
  smooth();
  for (int y = -10; y <= 200; y += 10) {
    for (int x = -10; x <= 200; x += 10) {
      ellipse(x+y/8.0,y+x/8.0,15 + x/2, 10);
    }
  }

  
}