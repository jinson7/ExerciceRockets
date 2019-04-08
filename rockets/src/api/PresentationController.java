package api;

import controllers.RocketController;

public class PresentationController {
	
	private RocketController ctrlRockect;

	public PresentationController() {
		ctrlRockect = RocketController.getInstance();
	}
	
	public void run() {
		ctrlRockect.setRocket("32WESSDS", 3);
		ctrlRockect.setRocket("LDSFJA32", 6);
		System.out.println(ctrlRockect.getAll());
	}
}
