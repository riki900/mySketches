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

public class solar_system_01 extends PApplet {

Planet sun;

public void setup() {
  
  
  sun = new Planet(50, 0, 0);
  sun.spawnMoons(5);
  
}

public void draw() {
  
  background(0);
  translate(width / 2, height / 2);
  sun.show();
  sun.orbit();
}
class Planet {
 
  float radius;
  float angle;
  float distance;
  float orbitspeed;
  Planet[] planets;
  
  Planet(float r, float d, float o) {
    radius = r;
    distance = d;
    orbitspeed = o;
    angle = random(TWO_PI);
  }
  
  public void orbit() {
    angle = angle + orbitspeed;
    if ( planets != null ) {
      for ( int i = 0; i < planets.length; i++ ) {
        planets[i].orbit();
      }
    }
  }
  
  public void spawnMoons(int total) {
    planets = new Planet[total];
    for ( int i = 0; i < planets.length; i++ ) {
      float r = random(5,radius * .4f );
      float d = radius * random(1.5f,4);
      float o = random(-0.1f, 0.1f);
      planets[i] = new Planet(r, d, o);
    }
    
  }
  public void show() {
    pushMatrix();
    rotate(angle);
    translate(distance, 0);
    ellipse(0, 0, radius * 2, radius * 2);
    if ( planets != null ) {
      for (int i = 0; i < planets.length; i ++ ) {
        planets[i].show();
      }
    }
    popMatrix();
  }
}
  public void settings() {  size(600,600); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "solar_system_01" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
