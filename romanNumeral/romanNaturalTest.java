import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class romanNaturalTest
{
   
   romanNumeral romanNumeral = new romanNumeral();
   
   @Test public void botellasPeq() 
   {
   
     assertEquals("Numero suficiente de botellas pequenas", 14, romanNatural.convierte("XIV"));
   }

}
