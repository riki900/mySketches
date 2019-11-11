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

public class pgm12a extends PApplet {

// comment

int numCircles = 3;
int circles_x[] = new int[numCircles];
int circles_speed = 5;

public void setup() {
  
  noStroke();

  for (int i = 0; i < numCircles; i += 1) {
      circles_x[i] = 25;
  }

}

public void draw() {
 background(0xff1BB1F5);

 fill(0xffC1FF3E);
 ellipse(circles_x[0],25,50,50);

 fill(0xffFF4800);
 ellipse(circles_x[1],75,50,50);

 circles_x[0] += circles_speed;
 if ( circles_x[0] > width + 25) {
     circles_x[0] = 0;
     circles_x[1] += circles_speed; 
 }
 if ( circles_x[1] > width - 25 ) {
     circles_x[1] = 0;
     circles_x[2] += circles_speed; 
 }

}




// void draw() {
    

//     fill(#C1FF3E);
//     ellipse(slow_circle_x, 50, 50, 50);
//     slow_circle_x += slow_speed;

//     fill(#FF4800);
//     ellipse(fast_circle_x, 50, 50, 50);
//     fast_circle_x += fast_speed;

//     if(slow_circle_x > width) {
//         slow_circle_x = 0;
//     }
//     if(fast_circle_x > width) {
//         fast_circle_x = 0;
//     }
// }
  public void settings() {  size(200,200); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "pgm12a" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
