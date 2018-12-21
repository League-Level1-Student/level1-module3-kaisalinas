int x = 200;
int y = 350;
Car car = new Car(50, 50, 25, 5);
Car car2 = new Car(350, 125, 25, 5);
Car car3 = new Car(50, 200, 25, 5);
Car car4 = new Car(350, 275, 25, 5);
boolean intersects(Car car) {
      if ((y > car.getY() && y < car.getY()+50) && (x > car.getX() && x < car.getX()+car.getSize()))
      {
             return true;
      }
      else 
      {
             return false;
      }

}
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
car3.display();
car4.display();

if(intersects(car) || intersects(car2) || intersects(car3) ||  intersects(car4)){
x = 200;
y = 350;
}

car.moveLeft();
car2.moveRight();
car3.moveLeft();
car4.moveRight();

}
void keyPressed(){
if(keyCode == UP){
y-=20;
}
 if(keyCode == DOWN){
y+=20;
}
if(keyCode == RIGHT){
x+=20;
}
if(keyCode == LEFT){
x-=20;
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
display();
}
public void moveRight(){
carX+=carSpeed;
if(carX>=400){
carX = 0;
}
display();
}
int getX(){
return carX;
}
int getY(){
return carY;
}
int getSize(){
return carSize;
}

}
