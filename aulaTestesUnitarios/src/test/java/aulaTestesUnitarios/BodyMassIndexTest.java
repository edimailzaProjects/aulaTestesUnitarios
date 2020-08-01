package aulaTestesUnitarios;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import aulaDeTestesUnitarios.BodyMassIndex;
import aulaTestesUnitarios.utils.FakeBodyIndex;

public class BodyMassIndexTest {
	
	private BodyMassIndex body;
	
	@BeforeEach
	public void setup(){
		body = new BodyMassIndex();
	}

	@Test
    public void classify_bmiUnder16_severelyUnderweight() {
        String actual = body.classify(15.9f);
        Assertions.assertEquals("Severely Underweight", actual);
    }

    @Test
    public void classify_bmi16_underweight() {
        String actual = body.classify(16f);
        Assertions.assertEquals("Underweight", actual);
    }

    @Test
    public void classify_18Dot5_healthyWeight() {
        String actual = body.classify(18.5f);
        Assertions.assertEquals("Healthy Weight", actual);
    }

    @Test
    public void classify_bmi25_overweight() {
        Assertions.assertEquals("Overweight", body.classify(25));
    }

    @Test
    public void classify_bmi30_obese() {
        Assertions.assertEquals("Obese", body.classify(30));
    }
    
    @Test
    public void calculate_returnOk() {
    	Double actual= body.calculate(2.0, 1.0);
    	Assertions.assertEquals(actual, 2.0);
    }
    
    @Test
    public void classify_calculate_ok() {
    	FakeBodyIndex fbi = new FakeBodyIndex();
    	String actual = fbi.classify(2.0, 1.0);
    	Assertions.assertEquals(actual, "");
    	
    }
}
