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

public class pgm6a extends PApplet {

// draw random lines

public void setup() {
  
  background(122,183,191);
}

public void draw() {
    float startY = random(height);
    float endY = random(height);
    int mapColor = PApplet.parseInt(map(frameCount % 30,0,29,0,3));
    println(frameCount % 30);
    println("mapColor: "+mapColor);
    switch (mapColor) {
        case 0 :
            stroke(255,0,0);
            break;
        case 1:
            stroke(0,255,0);
            break;
        case 2:
            stroke(0,0,255);
            break;            
    }

    line(0,startY,width,endY);
}
  public void settings() {  size(400,400); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "pgm6a" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
