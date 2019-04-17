package controllers;

import java.util.ArrayList;
import java.util.List;

import domain.Rocket;

public class RocketController {
	
	private static RocketController rocketSingletonController = null;
	private List<Rocket> rockets;
	
	private RocketController() {
		rockets = new ArrayList<Rocket>();
	}

	public static RocketController getInstance() {
		if (rocketSingletonController == null)
			rocketSingletonController = new RocketController();
		return rocketSingletonController;
	}
	
	public void set(String code, Integer... powerMaximOfPropellers) {
		rockets.add(new Rocket(code, powerMaximOfPropellers));
	}
	
	public void accelerate(int indexRocket, int nPropeller) throws Exception {
		Rocket rocket = rockets.get(indexRocket-1);
		rocket.accelerate(nPropeller-1);
	}
	
	public void decelerate(int indexRocket, int nPropeller) throws Exception {
		Rocket rocket = rockets.get(indexRocket-1);
		rocket.decelerate(nPropeller-1);
	}
	
	public void brake(int indexRocket, int nPropeller) throws Exception {
		Rocket rocket = rockets.get(indexRocket-1);
		rocket.brake(nPropeller-1);
	}
	
	public String getData(int indexRocket) {
		return rockets.get(indexRocket-1).getData();
	}
	
	public String get(int indexRocket) {
		return rockets.get(indexRocket).toString();
	}
	
	public String getAll() {
		StringBuilder sb = new StringBuilder();
		int i = 1;
		for (Rocket r : rockets) {
			sb.append(i + ") " + r.getCode() + '\n');
			++i;
		}
		return sb.toString();
	}
}
