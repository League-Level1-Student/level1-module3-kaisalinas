import javax.swing.*;

int x = 100;
int y = 200;
int yvelocity = 0;
int pipe = 800;
int speedypipe = -10;
int upperPipeHeight = (int) random(250, 600);
int gap = 175;
boolean gameOver = false;
int score = 0;
void setup() {
  size(800, 600);
  textSize(125);
}
void draw() {
  if (gameOver == false) {
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
          score++;
  }
    

    if (y>650) {
      gameOver = true;
        JOptionPane.showMessageDialog(null,score);
  }
    
    
    boolean bob = intersectsPipes();
    if(bob == true){
    gameOver = true;
    JOptionPane.showMessageDialog(null,score);
    } 
    
  } else {
    fill(255, 255, 0);
  text(" Game Over", 25, 300);
  }
}

void keyPressed() {
  yvelocity = -15;
}
boolean intersectsPipes() { 
  if (y< upperPipeHeight-gap && x > pipe && x < (pipe + 100 )) {
    return true;
  } else if (y>upperPipeHeight && x > pipe && x < (pipe + 100)) {
    return true;
  } else { 
    return false;
  }
}         
