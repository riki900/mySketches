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

public class spinner extends PApplet {

float r = 0;

public void setup() {
  
  background(255);
  noStroke();
  fill(0);
  rectMode(CENTER);
}
public void draw() {
  background(255);

  translate(100, 100);
  fill(120);
  rotate(r*-1.0f);
  arc(0, 0, 80, 80, PI, TWO_PI,PIE);
  resetMatrix();
  translate(100, 100);
  rotate(r);
  strokeWeight(4);
  stroke(0);
  fill(80);
  arc(0, 0, 80, 80, PI, TWO_PI,PIE);
  resetMatrix();


  translate(300, 100);
  rotate(r);
  rect(0, 0, 80, 80);
  resetMatrix();

  translate(100, 300);
  rotate(r);
  rect(0, 0, 80, 80);
  resetMatrix();

  translate(300, 300);
  rotate(r);
  rect(0, 0, 80, 80);
  resetMatrix();

  r = r + 0.02f;
}




  public void settings() {  size(400, 400); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "spinner" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
