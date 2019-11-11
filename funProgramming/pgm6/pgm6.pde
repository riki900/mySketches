// draw random horizontal lines

void setup() {
  size(400,400);
  background(122,183,191);
}

void draw() {

    line(0,random(height),width,random(width));
}
