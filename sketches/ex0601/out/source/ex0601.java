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

public class ex0601 extends PApplet {

// comment

public void setup() {
  
  background(122,183,191);
  noLoop();
}

public void draw() {

  for (int i = 20; i < 80; i += 5) {
    line(20,i,80,i+15);
  }

  strokeWeight(4);
  for (int i = 120; i < 180; i += 5) {
    line(20,i,180,i+15);
  }
}
  public void settings() {  size(400,400); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "ex0601" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
