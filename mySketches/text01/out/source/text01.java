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

public class text01 extends PApplet {

// show examples of text

int cellSize = 900 / 3;
int tabSize = cellSize;
String loremIpsum= "Lorem ipsum dolor sit amet";

public void setup() {
  
  background(122,183,191);
}

public void draw() {

    // row 1

    translate(0,0);
    simpleText();
    translate(tabSize,0);
    constrainText();
    translate(tabSize,0);
    rect(0,0,cellSize,cellSize);
    // row 2
    translate(tabSize * -2,tabSize);
    rect(0,0,cellSize,cellSize);
    translate(tabSize,0);
    rect(0,0,cellSize,cellSize);
    translate(tabSize,0);
    rect(0,0,cellSize,cellSize);
   // row 3
    translate(tabSize * -2,tabSize);
    rect(0,0,cellSize,cellSize);
    translate(tabSize,0);
    rect(0,0,cellSize,cellSize);
    translate(tabSize,0);
    rect(0,0,cellSize,cellSize);    


}

public void simpleText() {

    fill(0);
    rect(0,0,cellSize,cellSize);
    fill(255);
    text(loremIpsum, 50, 100);

}

public void constrainText() {

    fill(25);
    rect(0,0,cellSize,cellSize);
    fill(255);
    text(loremIpsum, 50, 100, 20, 80);

}
  public void settings() {  size(900,900); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "text01" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
