import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class DescuentoBlackFridayTest
{

     //es black friday aplicamos descuento
     //comprueba c1.bx
     //pasa por c2 y por el bloque c2.bx
   @Test public void esblack() throws InvalidParameter
   {
      DescuentoBlackFriday BlackFriday= new DescuentoBlackFriday();
      double precioOriginal = 20.0;
      double porcentaje = 15.0;
      Date fecha = new Date(2019,11,29);
      assertEquals("It is blackfriday", 17.0 , BlackFriday.PrecioFinal(precioOriginal, porcentaje,fecha), 1e-14);
   }

   //es 29 de noviembre pero de 2018
   //comprueba c1.bx
   //pasa por c2 y por el bloque c2.by
   @Test public void noesblack() throws InvalidParameter
   {
      DescuentoBlackFriday BlackFriday= new DescuentoBlackFriday();
      double precioOriginal = 20.0;
      double porcentaje = 15.0;
      Date fecha = new Date(2018,11,29);
      assertEquals("It is not blackfriday", 20.0 , BlackFriday.PrecioFinal(precioOriginal, porcentaje,fecha), 1e-14);
   }

   //si el formato no es valido
   //caracterizacion 1: c1.by
   @Test(expected = InvalidParameter.class)
   public void invalidprice() throws InvalidParameter
   {
        DescuentoBlackFriday BlackFriday= new DescuentoBlackFriday();
        double precioOriginal = 0;
        double porcentaje = 15.0;
        Date fecha = new Date(2019,11,29);
        BlackFriday.PrecioFinal(precioOriginal, porcentaje, fecha);
   }
}
