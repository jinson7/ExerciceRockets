package controllers;

import java.util.ArrayList;
import java.util.List;

import domain.Rocket;

public class RocketController {
	
	private static RocketController rocketSingletonController = null;
	private List<Rocket> rockers;
	
	private RocketController() {
		rockers = new ArrayList<Rocket>();
	}

	public static RocketController getInstance() {
		if (rocketSingletonController == null)
			rocketSingletonController = new RocketController();
		return rocketSingletonController;
	}


	public void setRocket(String code, int propellers) {
		rockers.add(new Rocket(code, propellers));
	}
	
	public String getAll() {
		StringBuilder sb = new StringBuilder();
		sb.append("## ROCKETS ##\n");
		for (Rocket r : rockers)
			sb.append(r.toString() + '\n');
		return sb.toString();
	}
}
