package aulaDeTestesUnitarios;

public class LeapYear {

	public static boolean calculate(int year) {

		boolean leap=false;
		
		if (year % 4 == 0) {
			System.out.println("Caiu la�o 1");
			if (year % 100==0) {
				System.out.println("Caiu la�o 2");
				if (year % 400==0) {
					System.out.println("Caiu la�o 3");
					return leap = true;
				}else
					System.out.println("Caiu la�o 4");
					return leap = false;
			}
		}
		return leap;
	}
	
	///c�digo do professor
	
	  public static boolean isLeapYear(int year) {
	        if (year % 400 == 0) {
	            return true;
	        }
	        if (year % 100 == 0) {
	            return false;
	        }
	        return year % 4 == 0;
	    }

}
