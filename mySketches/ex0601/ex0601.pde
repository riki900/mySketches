// comment

void setup() {
  size(400,400);
  background(122,183,191);
  noLoop();
}

void draw() {

  for (int i = 20; i < 80; i += 5) {
    line(20,i,80,i+15);
  }

  strokeWeight(4);
  for (int i = 120; i < 180; i += 5) {
    line(20,i,180,i+15);
  }
}