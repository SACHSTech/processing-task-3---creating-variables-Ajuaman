import processing.core.PApplet;

public class Sketch extends PApplet {
	
  public void settings() {
    size(400, 400);
  }

  public void setup() {
    background(210, 255, 173);
  }

  public void draw() {
	  
    stroke(128);
    line(150, 25, 270, 350);  

    stroke(255);
    line(50, 125, 70, 50);  
  }
  
}