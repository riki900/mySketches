
// two circles move left to right

int slow_circle_x = 0;
int fast_circle_x = 0;
int slow_speed = 1;
int fast_speed = 5;

void setup() {
  size(400,400);
  noStroke();
}

void draw() {
    background(#1BB1F5);

    fill(#C1FF3E);
    ellipse(slow_circle_x, 50, 50, 50);
    slow_circle_x += slow_speed;

    fill(#FF4800);
    ellipse(fast_circle_x, 50, 50, 50);
    fast_circle_x += fast_speed;

    if(slow_circle_x > width) {
        slow_circle_x = 0;
    }
    if(fast_circle_x > width) {
        fast_circle_x = 0;
    }
}