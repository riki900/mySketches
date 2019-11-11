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

public class pattern01 extends PApplet {


// comment

public void setup() {
  
  colorMode(HSB, 360, 100, 100);
  background(10, 97, 75);
  noLoop();
}

public void draw() {

   for( int x = 0; x < width; x += 50) {
    for (int y = 0; y < height; y += 50) {
        pushMatrix();
        translate(x,y);
        drawBox();
        popMatrix();
        
    }
  }
}


public void drawBox() {

    fill(random(100,240), random(25,75), 90);
    rect(0,0,50,50);

    fill(random(10,101), random(25,75), random(70,100));
    arc(25, 50, 50, 50, PI, 2*PI);
    fill(random(241,360), random(25,75), random(70,100));
    //fill(random(10,101), random(25,75), 90);
    arc(25,0, 50, 50, 0, PI);

}
  public void settings() {  size(400,400); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "pattern01" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
