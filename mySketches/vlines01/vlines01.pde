// draw sets of vlines from right side with 
// variable spacing

void setup() {
  size(500,500);
  background(255);
  noLoop();
}

void draw() {

    int y = 0;
    int length = 100;
    int lines2Draw = 30;
    int x = width - 1;
    int spacing = 7;
    for (int lines = 0; lines <=lines2Draw; lines++) {
        line(x,y,x,y+length);
        x -= spacing;
    }
    spacing = 15;
    y += length;
    x = width - 1;
    for (int lines = 0; lines <=lines2Draw; lines++) {
        line(x,y,x,y+length);
        x -= spacing;
    }
    spacing = 10;
    y += length;
    x = width - 1;
    for (int lines = 0; lines <=lines2Draw; lines++) {
        line(x,y,x,y+length);
        x -= spacing;
    }    
    spacing = 5;
    y += length;
    x = width - 1;
    for (int lines = 0; lines <=lines2Draw; lines++) {
        line(x,y,x,y+length);
        x -= spacing;
    }        

    spacing = 8;
    y += length;
    x = width - 1;
    for (int lines = 0; lines <=lines2Draw; lines++) {
        line(x,y,x,y+length);
        x -= spacing;
    }

}
