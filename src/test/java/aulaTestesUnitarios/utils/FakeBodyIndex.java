package aulaTestesUnitarios.utils;

import aulaDeTestesUnitarios.BodyMassIndex;

public class FakeBodyIndex extends BodyMassIndex {
	
	//como eu fiz 
	
	@Override
	public double calculate(double weight, double height) {
		return 25.0;
	}
	
	@Override
	 public String classify(double weight, double height) {
		return "";
	}
	
	//como o prof. fez
//	
//    public double bmiValue;
//
//    @Override
//    public double calculate(double weight, double height) {
//        return 50;
//    }
//
//    @Override
//    public String classify(double bmi) {
//        bmiValue = bmi;
//        return "new";
//    }

}
