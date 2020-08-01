package aulaTestesUnitarios;

import aulaDeTestesUnitarios.BodyMassIndex;

public class FakeBodyIndex extends BodyMassIndex {
	
	@Override
	public double calculate(double weight, double height) {
		return 25.0;
	}
	
	@Override
	 public String classify(double weight, double height) {
		return "";
	}

}
