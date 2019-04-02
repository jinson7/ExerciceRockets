package api;

import controllers.CtrlRocket;

public class CtrlPresentation {
	
	private CtrlRocket ctrlRockect;

	public CtrlPresentation() {
		ctrlRockect = CtrlRocket.getInstance();
	}
	
	public void run() {
		ctrlRockect.setRocket("32WESSDS", 3);
		ctrlRockect.setRocket("LDSFJA32", 6);
		System.out.println(ctrlRockect.getAll());
	}
}
