void setup(){
  size(800,800);
}
void draw(){
  if(mousePressed){
    fill(#1711D8);
  }else{
    fill((int)random(255),(int)random(255),(int)random(255));
  }
  ellipse(400,400,200,200);
}
