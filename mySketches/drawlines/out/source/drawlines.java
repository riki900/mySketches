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

public class drawlines extends PApplet {

int vline_current_x = 0;
int hline_current_y = 0;
int diagline_end_x_y = 0;
int diagline_current_x_y = 0;
boolean diagOnLeftSide = true;

public void setup() {
  
  

}

public void draw() {
  background(255);
  drawVline();
  drawHline();
  drawDiagline();
}

public void drawVline()
{ 
  line(vline_current_x,0,vline_current_x,height);
  if ( vline_current_x++ > width)
  {
    vline_current_x = 0;
  }
}

public void drawHline()
{
  line(0,hline_current_y,width,hline_current_y);
  if (hline_current_y++ > height)
  {
     hline_current_y = 0;
  }
}

public void drawDiagline()
{
 
  if ( diagOnLeftSide && diagline_current_x_y <= height )
  {
    diagline_end_x_y = 0;
    line(diagline_end_x_y,diagline_current_x_y,diagline_current_x_y,diagline_end_x_y);
    diagline_current_x_y++;
  } 
  else 
  {
    diagOnLeftSide = false;
    line(height,diagline_current_x_y - height,diagline_current_x_y - width,width);
    if (diagline_current_x_y++ > width * 2 )
    {
      diagOnLeftSide = true;
      diagline_current_x_y = 0;
    }
  }
}

public void setup() {

    size(300,300);
    background(102);
    
}

public void draw() {
    
}
  public void settings() {  size(100,100); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "drawlines" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
