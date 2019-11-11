import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class vlines01 extends PApplet {

// draw sets of vlines from right side with 
// variable spacing

public void setup() {
  
  background(255);
  noLoop();
}

public void draw() {

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
  public void settings() {  size(500,500); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "vlines01" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
