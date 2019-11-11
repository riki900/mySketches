class Drop {
  
  float x = random(width);
  float y = random(-500,-50);
  float z = random(0,20);
  float yspeed = map(z, 0, 20, 1, 10);
  float len = map(z, 0, 20, 10, 30);
  float gravity = map(z, 0 , 20, 0.01, 0.03); 
  
  void fall() {
    y += yspeed;
    yspeed += gravity;
    if ( y > height ) {
      y = random(-200,-100);
      yspeed = map(z, 0, 20, 1, 10);
    }
  }
  
  void show() {
    float weight = map(z, 0, 20, 1,4);
    strokeWeight(weight);
    stroke(138,43,226);
    line(x,y,x,y+len);
  }
  
}
