int x = 100;
int y = 500;
int yvelocity = 0;
int pipe = 500;
int speedypipe = -10;
int upperPipeHeight = (int) random(250, 600);
int gap = 200;
void setup() {
  size(800, 600);
}
void draw() {
  background(0, 0, 255);
  fill(0, 255, 0);
  ellipse(x, y, 50, 50);
  yvelocity++;
  y+=yvelocity;
  fill(255, 0, 255);
  rect(pipe, upperPipeHeight, 100, height-upperPipeHeight );
  rect(pipe, 0, 100, upperPipeHeight - gap );
  pipe+=speedypipe;
  if (pipe<-100) {
    pipe+=1000;
    upperPipeHeight = (int) random(250, 600);
    intersectsPipes();
  }
}

void keyPressed() {
  yvelocity = -15;
}
boolean intersectsPipes() { 
  if (y< upperPipeHeight && x > pipe && X < (pipe + 100 )) {
    return true;
  } else if (Y>upperPipeHeight && X > pipe && X < (pipe + 100)) {
    return true;
  } else { 
    return false;
  }
}