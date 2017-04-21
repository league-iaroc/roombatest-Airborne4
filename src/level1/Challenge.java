package level1;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level1.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}
	/**
	 * Without touching the wall reach the endZone
	 * use sleep an driveDirect 
	 */
	public void initialize() {
		//write code here!
		
		driveDirect(70, 90);
sleep(18000);
driveDirect(0, 0);
driveDirect(10000, 10000); //4
sleep(4000);
driveDirect(0, 0);
driveDirect(30, 90);
	}

	public void loop() {
	
	}
}
