import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class DescuentoBlackFridayTest
{

   @Test public void esblack()
   {
      double precioOriginal = 20.0;
      double porcentaje = 15.0;
      Date fecha = new Date(2019,11,29);
      assertEquals("It is blackfriday", 17.0 , DescuentoBlackFriday.PrecioFinal(precioOriginal, porcentaje,fecha));
   }

   //si el formato no es valido
   //@Test(expected = InvalidParameter.class)
   //public void invalidprice()
   /*{
        double precioOriginal = 0;
        double porcentaje = 15.0;
        Date fecha = new Date(2019,11,29);
        DescuentoBlackFriday.PrecioFinal(precioOriginal, porcentaje, fecha);
   }*/
}
