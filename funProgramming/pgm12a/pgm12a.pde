// comment

int numCircles = 3;
int circles_x[] = new int[numCircles];
int circles_speed = 5;

void setup() {
  size(200,200);
  noStroke();

  for (int i = 0; i < numCircles; i += 1) {
      circles_x[i] = 25;
  }

}

void draw() {
 background(#1BB1F5);

 fill(#C1FF3E);
 ellipse(circles_x[0],25,50,50);

 fill(#FF4800);
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
