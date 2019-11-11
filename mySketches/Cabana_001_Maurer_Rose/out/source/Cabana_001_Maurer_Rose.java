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

public class Cabana_001_Maurer_Rose extends PApplet {

// Maurer Rose
// The Coding Train / Daniel Shiffman
// https://thecodingtrain.com/CodingInTheCabana/002-collatz-conjecture.html
// https://youtu.be/4uU9lZ-HSqA
// https://editor.p5js.org/codingtrain/sketches/qa7RiptE9


float n = 0;
float d = 0;
// let dSlider;

public void setup() {
  
}

public void draw() {
  background(0);
  translate(width/2,height/2);
  stroke(255);
  //d = dSlider.value();
  noFill();
  beginShape();
  strokeWeight(1);
  for (float i = 0; i < 361; i++) {
    float k = i * d;
    float r = 150 * sin(radians(n*k));
    float x = r * cos(radians(k));
    float y = r * sin(radians(k));
    vertex(x,y);
  }
  endShape();

  noFill();
  stroke(255,0,255, 255);
  strokeWeight(4);
  beginShape();
  for (float i = 0; i < 361; i++) {
    float k = i;
    float r = 150 * sin(radians(n*k));
    float x = r * cos(radians(k));
    float y = r * sin(radians(k));
    vertex(x,y);
  }
  endShape();

  n += 0.001f;
  d += 0.003f;



}
  public void settings() {  size(400, 400); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Cabana_001_Maurer_Rose" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
