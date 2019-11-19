import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class romanNumeralTest
{
   
   romanNumeral romanNumeral = new romanNumeral();
   
   @Test public void numeroDecenas() throws InvalidParameter
   {
   
     assertEquals("el numero es 14", 14, romanNumeral.convierte("XIV"));
   }
   
      
   @Test public void numeroNoRomano() throws InvalidParameter
   {
   
     assertEquals("No es numero romano", -1, romanNumeral.convierte("K"));
   }


}
