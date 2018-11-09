int x = 200;
int y = 350;


void setup(){
size(400, 400);




}
void draw(){
background(255, 0, 0);
fill(0, 255, 0);
ellipse(x,y, 35, 35);
control();



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