package aulaTestesUnitarios;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import aulaDeTestesUnitarios.LeapYear;

public class LeapYearTest {

	//////Meus testes
	@Test
	public void leapYear_isNotLeapYearYet_4() {
		boolean actual = LeapYear.calculate(4);
		Assertions.assertFalse(actual);
	}
	
	@Test
	public void leapYear_isLeapYear_400() {
		boolean actual = LeapYear.calculate(400);
		Assertions.assertTrue(actual);
	}
	
	@Test
	public void leapYear_isNotLeapYearYet_100() {
		boolean actual = LeapYear.calculate(100);
		Assertions.assertFalse(actual);
	}

	@Test
	public void leapYear_isNotLeapYear() {
		boolean actual = LeapYear.calculate(1);
		Assertions.assertFalse(actual);
	}
	
	////Testes do professor
	
	/*
	 *     @Test
    public void isLeapYear_yearNonDivisibleBy4_false() {
        boolean actual = LeapYear.isLeapYear(1);
        Assertions.assertFalse(actual);
    }

    @Test
    public void isLeapYear_yearDivisibleBy4_true() {
        boolean actual = LeapYear.isLeapYear(4);
        Assertions.assertTrue(actual);
    }

    @Test
    public void isLeapYear_yearDivisibleBy100_false() {
        boolean actual = LeapYear.isLeapYear(100);
        Assertions.assertFalse(actual);
    }

    @Test
    public void isLeapYear_yearDivisibleBy400_true() {
        boolean actual = LeapYear.isLeapYear(400);
        Assertions.assertTrue(actual);
    }*/
}
