package domain;


public class Rocket {
	
	private static final Integer SPEED = 10;
	
	private String code;
	private Integer[] powerMaximOfPropellers;
	private Integer[] powerCurrentOfPropellers;

	public Rocket(String code, Integer... powerMaximOfPropellers) {
		this.code = code;
		this.powerMaximOfPropellers = powerMaximOfPropellers;
		this.powerCurrentOfPropellers = new Integer[powerMaximOfPropellers.length];
		initializePowerCurrentPropellers();
	}
	
	private void initializePowerCurrentPropellers() {
		for (int i=0; i<this.powerMaximOfPropellers.length; ++i)
			this.powerCurrentOfPropellers[i] = 0;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setPowerMaximOfPropellers(Integer[] powerMaximOfPropellers) {
		this.powerMaximOfPropellers = powerMaximOfPropellers;
	}

	public void setPowerCurrentOfPropellers(Integer[] powerCurrentOfPropellers) {
		this.powerCurrentOfPropellers = powerCurrentOfPropellers;
	}
	
	public void accelerate(int propeller) throws Exception {
		if (powerCurrentOfPropellers[propeller]+SPEED <= powerMaximOfPropellers[propeller])
			powerCurrentOfPropellers[propeller] += SPEED;
		else 
			throw new Exception("Maximum Power.!");
	}
	
	public void decelerate(int propeller) throws Exception {
		if (powerCurrentOfPropellers[propeller]-SPEED >= 0)
			powerCurrentOfPropellers[propeller] -= SPEED;
		else 
			throw new Exception("Minimum Power.!");
	}
	
	public void brake(int propeller) throws Exception {
		powerCurrentOfPropellers[propeller] = 0;
	}
	
	public String getData() {
		StringBuilder sb = new StringBuilder();
		sb.append("#### PROPELLERS OF " + code + " ####\n");
		sb.append("Nº | Current Power | Maximum Power\n");
		for (int i = 0 ; i < powerCurrentOfPropellers.length; ++i) {
			sb.append((i+1) + "\t " + powerCurrentOfPropellers[i] + "\t\t " + powerMaximOfPropellers[i]);
			sb.append('\n');
		}
		return sb.toString();
	}
	

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(code + ":\n");
		sb.append(" Current Power: " + (powerCurrentOfPropellers.length != 0 ? powerCurrentOfPropellers[0] : "-"));
		for (int i = 1 ; i < powerCurrentOfPropellers.length; ++i) sb.append(", " + powerCurrentOfPropellers[i]);
		sb.append('\n');
		sb.append(" Maximum Power: " + (powerMaximOfPropellers.length != 0 ? powerMaximOfPropellers[0] : "-"));
		for (int i = 1 ; i < powerMaximOfPropellers.length; ++i) sb.append(", " + powerMaximOfPropellers[i]);
		return sb.toString();
	}
}
