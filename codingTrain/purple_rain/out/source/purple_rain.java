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

public class purple_rain extends PApplet {

Drop[] drops = new Drop[300];

public void setup() {
  
  for ( int i = 0; i < drops.length; i++) {
    drops[i] = new Drop();
  }
}

public void draw() {
  background(230,230,250);
    for ( int i = 0; i < drops.length; i++) {
    drops[i].fall();
    drops[i].show();
  }
}
class Drop {
  
  float x = random(width);
  float y = random(-500,-50);
  float z = random(0,20);
  float yspeed = map(z, 0, 20, 1, 10);
  float len = map(z, 0, 20, 10, 30);
  float gravity = map(z, 0 , 20, 0.01f, 0.03f); 
  
  public void fall() {
    y += yspeed;
    yspeed += gravity;
    if ( y > height ) {
      y = random(-200,-100);
      yspeed = map(z, 0, 20, 1, 10);
    }
  }
  
  public void show() {
    float weight = map(z, 0, 20, 1,4);
    strokeWeight(weight);
    stroke(138,43,226);
    line(x,y,x,y+len);
  }
  
}
  public void settings() {  size(640,360); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "purple_rain" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
