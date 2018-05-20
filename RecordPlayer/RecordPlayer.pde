import ddf.minim.*;
Minim minim;
AudioPlayer song;
PImage pictureOfRecord;
int x = 0;
int imageAngle = 0;
void setup(){
  minim = new Minim(this);
  song = minim.loadFile("Africa.mp3");
pictureOfRecord = loadImage("record.png");
song.play();
size(700,684);
}
void draw() {
  if (x%2 == 0) {
    imageAngle += 1;
    song.play();
rotateImage (pictureOfRecord, imageAngle);
image(pictureOfRecord, 0, 0);

  } else {
    song.pause();
  }
}

void rotateImage(PImage image, int amountToRotate) {
     translate(width/2, height/2);
     rotate(amountToRotate*TWO_PI/360);
     translate(-image.width/2, -image.height/2);
}
void mousePressed() {

  
x+=1;
}