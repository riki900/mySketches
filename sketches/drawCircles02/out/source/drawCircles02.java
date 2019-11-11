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

public class drawCircles02 extends PApplet {

// draw concentric circles

public void setup() {
  
  background(122,183,191);
  noLoop();
}

public void draw() {

  for (float x = 0; x < 10; x += 1) {
    float radius = random(10,width / 2);
    stroke(1);
    fill(random(0,255),random(0,255),random(0,255),220);
    ellipse(random(0,width), random(0,height), radius, radius);  
    stroke(1);
    fill(random(0,255),random(0,255),random(0,255),120);
    rect(random(0,width), random(0,height),random(0,width), random(0,height));
  }

  

}
  public void settings() {  size(400,200); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "drawCircles02" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
