package section2;

import org.jointheleague.graphical.robot.Robot;

public class DrawSquare {
	public static void main(String[] args) {

		Robot r2d2 = new Robot();
		r2d2.setSpeed(30);
		r2d2.move(50);
		r2d2.turn(180);
		r2d2.penDown();

		for (int i = 0; i < 4; i++) {
			r2d2.move(50);
			r2d2.turn(90);
		}
		r2d2.move(50);
		for (int i = 0; i < 4; i++) {
			r2d2.move(50);
			r2d2.turn(90);
		}
		r2d2.move(50);
		for (int i = 0; i < 4; i++) {
			r2d2.move(50);
			r2d2.turn(90);
		}
		r2d2.move(50);
		for (int i = 0; i < 4; i++) {
			r2d2.move(50);
			r2d2.turn(90);
		}

	}

}
