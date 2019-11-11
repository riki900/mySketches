// draw random lines

void setup() {
  size(400,400);
  background(122,183,191);
}

void draw() {
    float startY = random(height);
    float endY = random(height);
    int mapColor = int(map(frameCount % 30,0,29,0,3));
    println(frameCount % 30);
    println("mapColor: "+mapColor);
    switch (mapColor) {
        case 0 :
            stroke(255,0,0);
            break;
        case 1:
            stroke(0,255,0);
            break;
        case 2:
            stroke(0,0,255);
            break;            
    }

    line(0,startY,width,endY);
}
