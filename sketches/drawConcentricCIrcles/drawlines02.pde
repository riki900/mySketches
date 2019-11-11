// comment

void setup() {
  size(400,400);
  background(122,183,191);
  noLoop();
}

void draw() {
    int top = 20;
    int left = 20;
    int size = 150;
    int lines = 10;
    diags01(left,top,size,lines);
    diags02(left + size,top,size,lines);
    diags02(left,top + size,size,lines);
    diags01(left + size,top + size,size,lines);

}   

void diags01(int x, int y, int size,int lines) {
   pushMatrix();
   fill(255);
   translate(x, y);
   noStroke();
   rect(0, 0, size, size);
   stroke(0);
   int step = size / lines;
   // write / diags across the box
   for (int origin = step; origin <= size; origin += step) { // first half: go down, left
       line(0, origin, origin, 0);
       line(origin, size, size, origin);
   }
   popMatrix();
}

void diags02(int x, int y, int size,int lines) {
   pushMatrix();
   fill(255);
   translate(x, y);
   noStroke();
   rect(0, 0, size, size);
   stroke(0);
   int step = size / lines;
   // write / diags across the box
   for (int origin = 0; origin <= size; origin += step) {
        line(origin,0,size,size - origin);
        line(0, origin, size - origin, size);
   }
   
   popMatrix();
}