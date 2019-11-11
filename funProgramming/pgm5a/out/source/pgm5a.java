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

public class pgm5a extends PApplet {

// comment

int center = 0;

public void setup() {
  
  center = width / 2;
}

public void draw() {

    float x = random(width);
    float y = random(height);
    stroke(0);
    if ( x < center ) {
        stroke(0,0,255);
    }
    if ( y < center ) {
        stroke(255,0,0);
    }
    if ( y < center && x > center) {
        stroke(0,255,0);
    }
    line(center,center, x, y);

}
  public void settings() {  size(400,400); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "pgm5a" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
