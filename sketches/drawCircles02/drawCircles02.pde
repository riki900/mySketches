// draw concentric circles

void setup() {
  size(400,200);
  background(122,183,191);
  noLoop();
}

void draw() {

  for (float x = 0; x < 10; x += 1) {
    float radius = random(10,width / 2);
    stroke(1);
    fill(random(0,255),random(0,255),random(0,255),220);
    ellipse(random(0,width), random(0,height), radius, radius);  
    stroke(1);
    fill(random(0,255),random(0,255),random(0,255),120);
    rect(random(0,width), random(0,height),random(0,width), random(0,height));
  }

}