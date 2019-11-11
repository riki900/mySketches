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

public class pgm9 extends PApplet {

// comment

float colorLow = 50;
float colorHigh = 150;
public void setup() {
  
  noLoop();
}

public void draw() {

    int lineWidth = 10;
    strokeWeight(lineWidth);
    for (int x = 1; x <= width; x += lineWidth) {
        stroke(random(colorLow,colorHigh),random(colorLow,colorHigh),random(colorLow,colorHigh));
        line(x,0,x,height);
    }

}
  public void settings() {  size(400,400); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "pgm9" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
