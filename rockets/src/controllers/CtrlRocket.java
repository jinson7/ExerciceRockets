package controllers;

import java.util.ArrayList;
import java.util.List;

import domain.Rocket;

public class CtrlRocket {
	
	private static CtrlRocket ctrlRocketSingleton = null;
	private List<Rocket> rockers;
	
	private CtrlRocket() {
		rockers = new ArrayList<Rocket>();
	}

	public static CtrlRocket getInstance() {
		if (ctrlRocketSingleton == null)
			ctrlRocketSingleton = new CtrlRocket();
		return ctrlRocketSingleton;
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
