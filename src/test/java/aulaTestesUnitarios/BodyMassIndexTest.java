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
    
    //como eu fiz
    @Test
    public void classify_calculate_ok_me() {
    	FakeBodyIndex fbi = new FakeBodyIndex();
    	String actual = fbi.classify(2.0, 1.0);
    	Assertions.assertEquals(actual, "");
    }
    
    //como o prof fez
    @Test
    public void classify_calculate_ok_prof() {
    	body = new BodyMassIndex() {
    		
    		@Override
    		public double calculate(double weight, double height) {
    			return -1;
    		}
    		
    		@Override
    		public String classify(double bmi) {
    			return "none";
    		}
    	};
    	Assertions.assertEquals("none", body.classify(-2,-3));
    }
    
    
    @Test
    public void classify_spyMethodParam_prof() {
    	final double[] actualWheight = new double[1] ;
    	final double[] actualHeight= new double[1];
    	
    	body = new BodyMassIndex() {
    		@Override
    		public double calculate(double weight, double height) {
    			actualWheight[0] = weight;
    			actualHeight[0]= height;
    			return 20;
    		}
    		
    		@Override
    		public String classify(double bmi) {
    			return super.classify(bmi);
    		}
    	};
    	
    	body.classify(10,20);
    	Assertions.assertEquals(10, actualWheight[0]);
    	Assertions.assertEquals(20, actualHeight[0]);
    }
    
    @Test
    public void classify_spyClassifyMethodParams_prof() {
    	final double[] bmiValue = new double[1];
    	
    	body = new BodyMassIndex() {
    		@Override
    		public double calculate(double weight, double height) {
    			return 50;
    		}
    		
    		@Override
    		public String classify(double bmi) {
    			bmiValue[0] = bmi;
    			return "new";
    		}
    	};
    	
    	body.classify(10,2);
    	Assertions.assertEquals(50, bmiValue[0]);
    }
}
