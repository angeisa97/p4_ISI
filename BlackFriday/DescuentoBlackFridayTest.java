import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class DescuentoBlackFridayTest
{

   @Test public void esblack() throws InvalidParameter
   {

      DescuentoBlackFriday BlackFriday= new DescuentoBlackFriday();
      double precioOriginal = 20.0;
      double porcentaje = 15.0;
      Date fecha = new Date(2019,11,29);
      assertEquals("It is blackfriday", 17.0 , BlackFriday.PrecioFinal(precioOriginal, porcentaje,fecha), 1e-14);
   }

   //si el formato no es valido
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
