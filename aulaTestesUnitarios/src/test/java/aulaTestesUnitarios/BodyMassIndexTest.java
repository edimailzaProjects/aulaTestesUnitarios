package aulaTestesUnitarios;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import aulaDeTestesUnitarios.BodyMassIndex;

public class BodyMassIndexTest {

	@Test
	public void calculate_bmi_severelyUnderWeight() {
		String actual = BodyMassIndex.calculate(15.9f);
		String expected = "Severely Underweight: 15.9";
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void calculate_bmi_UnderWeight() {
		String actual = BodyMassIndex.calculate(16f);
		String expected = "Underweight: 16.0";
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void calculate_bmi_HealthWeight() {
		String actual = BodyMassIndex.calculate(18.5f);
		String expected = "HealthWeight: 18.5";
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void calculate_bmi_OverWeight() {
		String actual = BodyMassIndex.calculate(25f);
		String expected = "OverWeight: 25.0";
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void calculate_bmi_Obese() {
		String actual = BodyMassIndex.calculate(30f);
		String expected = "Obese: 30.0";
		Assertions.assertEquals(expected, actual);
	}

}
