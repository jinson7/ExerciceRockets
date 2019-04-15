package domain;

public class Rocket {
	
	private String code;
	private Integer[] powerMaximOfPropellers;
	
	
	public Rocket(String code, Integer... powerMaximOfPropellers) {
		this.code = code;
		this.powerMaximOfPropellers = powerMaximOfPropellers;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer[] getpowerMaximOfPropellers() {
		return powerMaximOfPropellers;
	}

	public void setpowerMaximOfPropellers(Integer... powerMaximOfPropellers) {
		this.powerMaximOfPropellers = powerMaximOfPropellers;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(code + ": " + (powerMaximOfPropellers.length != 0 ? powerMaximOfPropellers[0] : "-"));
		for (int i = 1 ; i < powerMaximOfPropellers.length; ++i) sb.append(", " + powerMaximOfPropellers[i]);
		return sb.toString();
	}
}
