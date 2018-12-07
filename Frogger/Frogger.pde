int x = 200;
int y = 350;
Car car = new Car(50, 50, 25, 5);
Car car2 = new Car(350, 100, 25, 5);
void setup(){
size(400, 400);




}
void draw(){
background(255, 0, 0);
fill(0, 255, 0);
ellipse(x,y, 35, 35);
control();
car.display();
car2.display();
car.moveLeft();
car2.moveRight();
}
void keyPressed(){
if(keyCode == UP){
y-=50;
}
 if(keyCode == DOWN){
y+=50;
}
if(keyCode == RIGHT){
x+=50;
}
if(keyCode == LEFT){
x-=50;
}
 };
void control(){
if(x >= width){
x = width;
}
if(x<=0){
x = 0;
}
if(y>=height){
y = height;
}
}
class Car{
int carX;
int carY;
int carSize;
int carSpeed;
  public Car(int carX, int carY, int carSize, int carSpeed){
  this.carX = carX;
  this.carY = carY;
  this.carSize = carSize;
  this.carSpeed = carSpeed;
}
  void display() 
{
      fill(0,255,0);
      rect(carX , carY, carSize, 50);
}
public void moveLeft(){
  carX-=carSpeed;
  if(carX <= 0){
  carX = width;
}
}
public void moveRight(){
carX+=carSpeed;
if(carX>=400){
carX = 0;
}
}
}
