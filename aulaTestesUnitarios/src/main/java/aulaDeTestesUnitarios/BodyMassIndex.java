package aulaDeTestesUnitarios;

public class BodyMassIndex {

	public static String calculate(Float number) {
		if (number < 16) {
			return "Severely Underweight: " + number.toString();
		}
		if (number >= 16.0 && number < 18.5) {
			return "Underweight: " + number.toString();
		}
		if (number >= 18.5 && number < 24.9) {
			return "HealthWeight: " + number.toString();
		}
		if (number >= 25.0 && number < 29.9) {
			return "OverWeight: " + number.toString();
		} else
			return "Obese: " + number.toString();
	}

}
