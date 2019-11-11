// show examples of text

int cellSize = 900 / 3;
int tabSize = cellSize;
String loremIpsum= "Lorem ipsum dolor sit amet";

void setup() {
  size(900,900);
  background(122,183,191);
}

void draw() {

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

void simpleText() {

    fill(0);
    rect(0,0,cellSize,cellSize);
    fill(255);
    text(loremIpsum, 50, 100);

}

void constrainText() {

    fill(25);
    rect(0,0,cellSize,cellSize);
    fill(255);
    text(loremIpsum, 50, 100, 20, 80);

}