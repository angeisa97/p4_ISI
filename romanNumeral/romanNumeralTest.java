import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class romanNumeralTest
{
   
   romanNumeral romanNumeral = new romanNumeral();
   
   //pasa por c1.bx, c1.bi, c1.bv y c2.br
   @Test public void romanNumeral1() throws InvalidParameter
   {
   
     assertEquals("el numero es 14", 14, romanNumeral.convierte("XIV"));
   }
   
   //pasa por c1.bx, c1.bl y c2.br
   @Test public void romanNumeral2() throws InvalidParameter
   {
   
     assertEquals("el numero es 40", 40, romanNumeral.convierte("XL"));
   }
   
   //pasa por c1.bx, c1.bl y c2.bs
   @Test public void romanNumeral3() throws InvalidParameter
   {
   
     assertEquals("el numero es 60", 60, romanNumeral.convierte("LX"));
   }
   
   //pasa por c1.bm, c1.bm, c2.bs, c1.bc, c1.bd, c2.br
   @Test public void romanNumeral4() throws InvalidParameter
   {
   
     assertEquals("el numero es 2400", 2400, romanNumeral.convierte("MMCD"));
   }
   
   //caracterizacion c1.bz
	@Test(expected = InvalidParameter.class) 
	 public void romanNumeral() throws InvalidParameter
	{
	 romanNumeral.convierte("K");
	}    
   
}
