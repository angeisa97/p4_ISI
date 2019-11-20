import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class BisiestosTest
{
     private Bisiestos Bisiestos;
     @Before
     public void setUp()
     {
          Bisiestos = new Bisiestos();
     }
   // no es divisible entre 4
   //pasa por c1.by
   // prueba c2.by, c3.bx, c4.bx
   // se queda en la condicion c1.by
   @Test public void noBisiesto() throws InvalidParameter
   {
      int year = 1997;
      assertEquals("No bisiesto", false , Bisiestos.esBisiesto(year));
   }

   //divisible entre 4 y entre 100
    //pasa por c1.by
   // prueba c2.by, c3.by,c4.bx
   @Test public void noBisiesto2() throws InvalidParameter
   {
      int year = 3000;
      assertEquals("No bisiesto 2 condicion", false , Bisiestos.esBisiesto(year));
   }

   //divisible entre 4, entre 100 pero no entre 400
    //pasa por c1.by
   //prueba c2.bx, c3.by, c4.bx
   @Test public void noBisiesto3() throws InvalidParameter
   {
      int year = 1900;
      assertEquals("No bisiesto tercera condicion", false , Bisiestos.esBisiesto(year));
   }

   //divisible entre 4, entre 100 y entre 400
    //pasa por c1.by
   // pueba c2.bx, c3.by, c4.by
   @Test public void itis() throws InvalidParameter
   {
      int year = 2012;
      assertEquals("Es bisiesto", true , Bisiestos.esBisiesto(year));
   }

   //divisible entre 4, entre 100 y entre 400
    //pasa por c1.by
   // pueba c2.bx, c3.by, c4.by
   @Test public void SiBisiesto() throws InvalidParameter
   {
      int year = 2000;
      assertEquals("Esbisiesto", true , Bisiestos.esBisiesto(year));
   }

   //si el formato no es valido
   //caracteriza condición 1 bloque bx
   @Test(expected = InvalidParameter.class)
   public void invalidyear() throws InvalidParameter
   {
     int year = -1; // false
     Bisiestos.esBisiesto(year);
   }
}
