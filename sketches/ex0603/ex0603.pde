// draw concentric circles

void setup() {
  size(200,200);
  background(122,183,191);
  noLoop();
}

void draw() {

  float center = width / 2;
  float radius = width + ( width * .2);
  float step = 20;

  for (float r = radius; r > 0; r -= step) {
    fill(random(0,255));
    ellipse(center, center, r, r);  
  }

  

}