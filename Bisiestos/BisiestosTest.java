import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class BisiestosTest
{
   // no es divisible entre 4
   @Test public void noBisiesto()
   {
      int year = 1997;
      assertEquals("No bisiesto", false , Bisiestos.esBisiesto(year));
   }

   //divisible entre 4 y entre 100
   @Test public void noBisiesto2()
   {
      int year = 3000;
      assertEquals("No bisiesto 2 condicion", false , Bisiestos.esBisiesto(year));
   }

   //divisible entre 4, entre 100 pero no entre 400
   @Test public void noBisiesto3()
   {
      int year = 1900;
      assertEquals("No bisiesto tercera condicion", false , Bisiestos.esBisiesto(year));
   }

   @Test public void itis()
   {
      int year = 2012;
      assertEquals("No bisiesto", true , Bisiestos.esBisiesto(year));
   }

   @Test public void SiBisiesto()
   {
      int year = 2000;
      assertEquals("No bisiesto", true , Bisiestos.esBisiesto(year));
   }


   @Test(expected = InvalidParameter.class)
   public void añoinvalido()
   {
     int year = -1; // false
     Bisiestos.esBisiesto(year);
   }
}
