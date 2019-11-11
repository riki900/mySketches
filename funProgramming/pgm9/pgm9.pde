// comment

float colorLow = 50;
float colorHigh = 150;
void setup() {
  size(400,400);
  noLoop();
}

void draw() {

    int lineWidth = 10;
    strokeWeight(lineWidth);
    for (int x = 1; x <= width; x += lineWidth) {
        stroke(random(colorLow,colorHigh),random(colorLow,colorHigh),random(colorLow,colorHigh));
        line(x,0,x,height);
    }

}
