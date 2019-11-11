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

public class pgm12 extends PApplet {


// two circles move left to right

int slow_circle_x = 0;
int fast_circle_x = 0;
int slow_speed = 1;
int fast_speed = 5;

public void setup() {
  
  noStroke();
}

public void draw() {
    background(0xff1BB1F5);

    fill(0xffC1FF3E);
    ellipse(slow_circle_x, 50, 50, 50);
    slow_circle_x += slow_speed;

    fill(0xffFF4800);
    ellipse(fast_circle_x, 50, 50, 50);
    fast_circle_x += fast_speed;

    if(slow_circle_x > width) {
        slow_circle_x = 0;
    }
    if(fast_circle_x > width) {
        fast_circle_x = 0;
    }
}
  public void settings() {  size(400,400); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "pgm12" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
