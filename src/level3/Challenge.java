package level3;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level3.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}

	public void initialize() {
		driveDirect(480, 500);
		sleep(2000);
		driveDirect(0, 0);
		driveDirect(300,500 ); //4
		sleep(1000);
		driveDirect(0, 0);
		driveDirect(500, 500);
		sleep(2000);
		driveDirect(0, 0);
		driveDirect(500, 300);
		sleep(2000);
		driveDirect(0, 0);
		driveDirect(200,500 ); //4
		sleep(3000);
		driveDirect(0, 0);
		
			}

	

	public void loop() {
	
	}
}
