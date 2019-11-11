int vline_current_x = 0;
int hline_current_y = 0;
int diagline_end_x_y = 0;
int diagline_current_x_y = 0;
boolean diagOnLeftSide = true;

void setup() {
  
  size(100,100);

}

void draw() {
  background(255);
  drawVline();
  drawHline();
  drawDiagline();
}

void drawVline()
{ 
  line(vline_current_x,0,vline_current_x,height);
  if ( vline_current_x++ > width)
  {
    vline_current_x = 0;
  }
}

void drawHline()
{
  line(0,hline_current_y,width,hline_current_y);
  if (hline_current_y++ > height)
  {
     hline_current_y = 0;
  }
}

void drawDiagline()
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

