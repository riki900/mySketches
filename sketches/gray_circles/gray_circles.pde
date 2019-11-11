float px;
float py;
float step = 12;

void setup() {
  
  size(600,600);
  background(random(0,255), random(0,255), random(0,255));
  px = width / 2;
  py = height / 2;
}

void draw() {
  
  float r = random(20,200);
  fill(random(0,255), random(0,255), random(0,255), 120);
  noStroke();
  drawCircle( px + ( frameCount * step ), py, r);
  drawCircle( px - ( frameCount * step ), py, r);
  drawCircle( px, py + ( frameCount * step ), r);
  drawCircle( px, py - ( frameCount * step ), r);
  
}

void drawCircle(float x, float y, float r) {
  
   ellipse(x, y, r, r);
}
