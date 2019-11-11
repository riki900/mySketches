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

public class ex0608 extends PApplet {

// draw concentric circles

public void setup() {
  
  background(255 * .75f);
  noLoop();
}

public void draw() {

  fill(0,76);
  noStroke();
  smooth();
  for (int y = -10; y <= 200; y += 10) {
    for (int x = -10; x <= 200; x += 10) {
      ellipse(x+y/8.0f,y+x/8.0f,15 + x/2, 10);
    }
  }

  
}
  public void settings() {  size(200,200); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "ex0608" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
