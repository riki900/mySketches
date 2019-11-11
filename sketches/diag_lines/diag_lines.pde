
void setup() {
  
  size(600,600);
  noLoop();
  
}

void draw() {
  
  strokeWeight(2);
  drawDiagLine();
  
  
}


void drawDiagLine() {
  
  // slang right
  line(100,45,85,60);
  // slant right 5px to right
  line(105,45,90,60);
}
  
