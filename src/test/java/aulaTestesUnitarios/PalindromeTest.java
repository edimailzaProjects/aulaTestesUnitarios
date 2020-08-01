package aulaTestesUnitarios;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import aulaDeTestesUnitarios.Palindrome;

@ExtendWith(MockitoExtension.class)
public class PalindromeTest {
	
	@Spy
	 private Palindrome palindrome;

//	    @BeforeEach
//	    public void setupTest(){
//	        palindrome = new Palindrome();
//	    }

	    @Test
	    public void check_oneCharWord_true() {
	    	palindrome = new Palindrome();
	        boolean actual = palindrome.check("a");
	        Assertions.assertTrue(actual);
	    }

	    @Test
	    public void check_differentStartEndChar_false() {
	    	palindrome = new Palindrome();
	        boolean actual = palindrome.check("ab");
	        Assertions.assertFalse(actual);
	    }

	    @Test
	    public void check_equalStartEndChar_true() {
	        Assertions.assertTrue(palindrome.check("aa"));
	        Mockito.verify(palindrome, Mockito.times(2)).check(Mockito.anyString());
	    }

}
