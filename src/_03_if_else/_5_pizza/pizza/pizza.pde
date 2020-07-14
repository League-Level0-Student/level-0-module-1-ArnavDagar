PImage pineapple;

void setup() {
size(800,800);    

fill(#BF8D3C);
ellipse(400,400,400,400);
fill(#FF0000);
ellipse(400,400,350,350);
fill(#FFA600);
ellipse(400,400,325,325);
pineapple = loadImage("pineapple.jpeg");
pineapple.resize(50,50);
image(pineapple, 350, 350);
}
void draw() {
   if (mousePressed) {
     image(pineapple, mouseX, mouseY);
}
}
