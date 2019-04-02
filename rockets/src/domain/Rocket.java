package domain;

public class Rocket {
	
	private String code;
	private int numberPropeller;
	
	public Rocket(String code, int numberPropeller) {
		this.code = code;
		this.numberPropeller = numberPropeller;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getNumberPropeller() {
		return numberPropeller;
	}

	public void setNumberPropeller(int numberPropeller) {
		this.numberPropeller = numberPropeller;
	}

	@Override
	public String toString() {
		return "Code: " + code + ", Number of ropeller: " + numberPropeller;
	}
}
