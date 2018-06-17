import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	public static void main(String[] args) {
Random gen = new Random();
	
Robot robot = new Robot();
robot.setX(25);
robot.setY(500);
for(int i = 0; i < 23; i++) {
	int height = gen.nextInt(500-100)+100;
robot.penDown();
robot.setRandomPenColor();;
robot.setSpeed(40);


robot.setWindowColor(Color.black);
if(height <= 300) {
	robot.move(height);
	robot.turn(60);
	robot.move(25);
	robot.turn(60);
	robot.move(25);
	robot.turn(60);
	robot.move(height);
	robot.turn(-90);
	
	
} else {
	
	robot.move(height);
	robot.turn(90);
	robot.move(50);
	robot.turn(90);
	robot.move(height);
	robot.turn(-90);
	

} 
robot.setPenColor(Color.green);
robot.move(30);
robot.turn(-90);
	
}
}
}