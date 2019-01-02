PImage mustache;
  PImage friend;
void setup(){
  friend = loadImage("friend.jpg");
    size(600,600);
    friend.resize(600,600);
    mustache = loadImage("mustache.png");
    
}
void draw(){
 background(friend);
 if(mousePressed){
   image(mustache,mouseX,mouseY);
 }
 
 
}