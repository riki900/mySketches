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

public class ex02p28 extends PApplet {

// comment

int bkg = 102;
int bkgStep = 0; 
int boxSize = 150;
int boxX = 0;
int boxY = 0;

public void setup() {
  
  background(255);
  noLoop();
}

public void draw() {


    initExample("point(75,75)");    
    point(75,75);

    translate(150, 0);
    initExample("line(45,45,105,105)");    
    line(45,45,105,105);

    translate(150, 0);
    initExample("triangle(75, 45, 45, 105, 105,105)");    
    triangle(75, 45, 45, 105, 105,105);

    translate(150, 0);
    initExample("quad(45, 45, 30, 105, 105, 105, 120, 45 )");    
    quad(45, 45, 30, 105, 105, 105, 120, 45 );

    translate(150, 0);
    initExample("ellipse(75, 75, 50, 100)");    
    ellipse(75, 75, 50, 100);

    translate(150, 0);
    initExample("bezier(45, 45, 105, 30, 105, 105, 45, 105)");    
    bezier(45, 45, 105, 30, 105, 105, 45, 105);  

    translate(-750, 150);
    initExample("Z order - Box first");    
    fill(255,0,0);
    rect(20,20,70,70); 
    fill(0,255,0);
    ellipse(75,75, 80, 80);

    translate(150, 0);
    initExample("Z order - circle first");    
    fill(0,255,0);
    ellipse(75,75, 80, 80);
    fill(255,0,0);
    rect(20,20,70,70); 

    translate(150, 0);
    initExample("transparency");    
    fill(255,220);
    rect(45,45,50,50);
    rect(65,65,50,50);

    translate(150, 0);
    initExample("strokeCap(ROUND) - default");    
    smooth();
    strokeWeight(10);
    line(35,75,130,75);

    translate(150, 0);
    initExample("strokeCap(SQUARE)");    
    smooth();
    strokeWeight(10);
    strokeCap(SQUARE);
    line(35,75,130,75);

    translate(150, 0);
    initExample("strokeCap(PROJECT)");    
    smooth();
    strokeWeight(10);
    strokeCap(PROJECT);
    line(35,75,130,75);

    translate(-750, 150);
    initExample("strokeJoin(MITER) - default");    
    smooth();
    strokeJoin(MITER);
    strokeWeight(15);
    rect(45,47,75,75);

    translate(150, 0);
    initExample("strokeJoin(BEVEL)");    
    smooth();
    strokeWeight(15);
    strokeJoin(BEVEL);
    rect(45,47,75,75);

    translate(150, 0);
    initExample("strokeJoin(ROUND)");    
    smooth();
    strokeWeight(15);
    strokeJoin(ROUND);
    rect(45,47,75,75);   
}


public void initExample(String cmd) {

    fill(bkg += bkgStep);
    stroke(255);
    strokeCap(ROUND);
    strokeWeight(1);
    rect(0,0,boxSize,boxSize);
    fill(255);
    text(cmd,5,2,140,80);
    strokeWeight(2);
    stroke(0);

}
  public void settings() {  size(900,900); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "ex02p28" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
