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

public class gray_circles extends PApplet {

float px;
float py;
float step = 12;

public void setup() {
  
  
  background(random(0,255), random(0,255), random(0,255));
  px = width / 2;
  py = height / 2;
}

public void draw() {
  
  float r = random(20,200);
  fill(random(0,255), random(0,255), random(0,255), 120);
  noStroke();
  drawCircle( px + ( frameCount * step ), py, r);
  drawCircle( px - ( frameCount * step ), py, r);
  drawCircle( px, py + ( frameCount * step ), r);
  drawCircle( px, py - ( frameCount * step ), r);
  
}

public void drawCircle(float x, float y, float r) {
  
   ellipse(x, y, r, r);
}
  public void settings() {  size(600,600); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "gray_circles" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
