// draw concentric circles

void setup() {
  size(200,200);
  background(255);
  noLoop();
}

void draw() {

  for (int i = 0; i < 200; i += 10) {
    stroke(255-i);
    strokeWeight(10);
    line(i,0,i,200);
  }

}