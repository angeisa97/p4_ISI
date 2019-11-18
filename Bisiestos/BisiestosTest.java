import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class BisiestosTest
{
     //Bisiestos Bisiestos = new Bisiestos();
     //private int year;

   // no es divisible entre 4
   // prueba c1.by, c2.bx, c3.bx
   // se queda en la condicion c1.by
   @Test public void noBisiesto()
   {
      int year = 1997;
      assertEquals("No bisiesto", false , Bisiestos.esBisiesto(year));
   }

   //divisible entre 4 y entre 100
   // prueba c1.by, c2.by,c3.bx
   @Test public void noBisiesto2()
   {
      int year = 3000;
      assertEquals("No bisiesto 2 condicion", false , Bisiestos.esBisiesto(year));
   }

   //divisible entre 4, entre 100 pero no entre 400
   //prueba c1.bx, c2.by, c3.bx
   @Test public void noBisiesto3()
   {
      int year = 1900;
      assertEquals("No bisiesto tercera condicion", false , Bisiestos.esBisiesto(year));
   }

   //divisible entre 4, entre 100 y entre 400
   // pueba c1.bx, c2.by, c3.by
   @Test public void itis()
   {
      int year = 2012;
      assertEquals("Es bisiesto", true , Bisiestos.esBisiesto(year));
   }

   //divisible entre 4, entre 100 y entre 400
   // pueba c1.bx, c2.by, c3.by
   @Test public void SiBisiesto()
   {
      int year = 2000;
      assertEquals("Esbisiesto", true , Bisiestos.esBisiesto(year));
   }

   //si el formato no es valido
   @Test(expected = InvalidParameter.class)
   public void invalidyear()
   {
     int year = -1; // false
     Bisiestos.esBisiesto(year);
   }
}
