import processing.core.PApplet;

public class Sketch extends PApplet {

  	float randCoordX = random(0, 600);
  	float randCoordY = random(0, 400);
  
	public void settings() {
	   size(600, 600);
	}
	  
	public void setup() {
	   background(125, 235, 250);
	   strokeWeight(5);
	}

	public void draw() {
		
	   // BASE OF THE HOUSE
	   fill(138, 132, 127);
	   rect(randCoordX, randCoordY, 200, 150);
	   // DOOR
	   fill(118, 156, 145);
	   rect(randCoordX + 70, randCoordY + 100, 30, 50);
		
	   // ROOF
	   fill(44, 245, 188);
	   triangle(randCoordX - 50, randCoordY, randCoordX + 100, randCoordY - 90, randCoordX + 250, randCoordY);
		
	   // WINDOWS
	   fill(255);
	   ellipse(randCoordX + 50, randCoordY + 50, 30, 30);
	   ellipse(randCoordX + 150, randCoordY + 50, 30, 30);
	   
	   // GROUND
	   fill(94, 219, 98);
	   rect(0, 550, 600, 100);
	   
	   fill(242, 255, 59);
	   ellipse(0, 0, 100, 100);
	}
}