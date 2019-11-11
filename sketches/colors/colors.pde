int cellSize = 900 / 45;
int x = 0;
int y = 0;

void setup() {
  size(900,900);
}

void draw() {
  for ( x = 0; x < width; x += cellSize ) {
    for ( y = 0; y < height; y += cellSize) {
      float c1 = map(x, 0, width, 0, 255);
      float c2 = map(y, 0, width, 0, 255);
      fill(0, c2,0);
      rect(x,y,x+cellSize,y+cellSize);
    }
  }
}
