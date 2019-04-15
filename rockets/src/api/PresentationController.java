package api;

import controllers.RocketController;

public class PresentationController {
	
	private RocketController ctrlRockect;

	public PresentationController() {
		ctrlRockect = RocketController.getInstance();
	}
	
	public void run() {
		ctrlRockect.setRocket("32WESSDS", 10, 20, 80);
		ctrlRockect.setRocket("LDSFJA32", 30,40,50,50,30,10);
		System.out.println(ctrlRockect.getAll());
	}
}
