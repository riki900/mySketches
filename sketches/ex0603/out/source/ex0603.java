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

public class ex0603 extends PApplet {

// draw concentric circles

public void setup() {
  
  background(122,183,191);
  noLoop();
}

public void draw() {

  float center = width / 2;
  float radius = width + ( width * .2f);
  float step = 20;

  for (float r = radius; r > 0; r -= step) {
    fill(random(0,255));
    ellipse(center, center, r, r);  
  }

  

}
  public void settings() {  size(200,200); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "ex0603" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
