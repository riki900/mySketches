
// comment

void setup() {
  size(400,400);
  colorMode(HSB, 360, 100, 100);
  background(10, 97, 75);
  noLoop();
}

void draw() {

   for( int x = 0; x < width; x += 50) {
    for (int y = 0; y < height; y += 50) {
        pushMatrix();
        translate(x,y);
        drawBox();
        popMatrix();
        
    }
  }
}


void drawBox() {

    fill(random(100,240), random(25,75), 90);
    rect(0,0,50,50);

    fill(random(10,101), random(25,75), random(70,100));
    arc(25, 50, 50, 50, PI, 2*PI);
    fill(random(241,360), random(25,75), random(70,100));
    //fill(random(10,101), random(25,75), 90);
    arc(25,0, 50, 50, 0, PI);

}