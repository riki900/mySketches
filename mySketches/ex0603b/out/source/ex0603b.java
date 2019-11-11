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

public class ex0603b extends PApplet {

// comment

public void setup() {
  
  background(122,183,191);
  noLoop();
}

public void draw() {

  int lines = 5;
  int step = 20;

  // draw v lines
  translate(20,20);
  for (float x = 0; x <= lines; x += 1) {
    line(x*step,0,x*step,step*lines);
  }

  // draw h lines
  translate(150,0);  // move right one "frame"
  for (int x = 0; x <= lines; x += 1) {
       line(0,x*step,step*lines,x*step);
     }

  // combine to draw a grid
  translate(150, 0); // move right one more "frame"
  for (int x = 0; x <= lines; x += 1) {
       line(0,x*step,step*lines,x*step);
     }
  for (float x = 0; x <= lines; x += 1) {
    line(x*step,0,x*step,step*lines);
  }  

  // draw v lines with increasing spacing
  translate(-300,150);   // move to left margin and down one "frame"
  for (float x = 10; x <= 100; x *= 1.2f) {
    line(x-10,0,x-10,100);
  }

  // draw h lines with increasing spacing
  translate(150, 0); // move right one more "frame"
  for (float x = 10; x <= 100; x *= 1.2f) {
    line(0,x-10,100,x-10);
  }

  // draw to sets of v lines
  translate(150,0);  // move right one "frame"
  for (int x = 20; x < 95; x += 10) {
    if (x < 60) {
      line(x,20,x,60);
    }
    else {
      line(x,40,x,80);
    }
  }

  // draw to sets of v lines
  translate(-300,150);   // move to left margin and down one "frame"
  for (int x = 20; x <= 80; x += 5) {
    if (x % 10 == 0) {
      line(20,x,50,x);
    }
    else {
      line(50,x,80,x);
    }
  }  
}
  public void settings() {  size(500,500); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "ex0603b" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
