import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class embotelladoraTest
{
   
   embotelladora embotelladora = new embotelladora();
   
   //pasa por c1.by y c2.by
   @Test public void embotelladora() throws NoSolution
   {
      int peq = 5;
      int big = 3;
      int total = 20;
      assertEquals("Numero suficiente de botellas pequenas", 5, embotelladora.calculaBotellasPequenas(peq, big, total));
   }
   
   //pasa por c1.by
    @Test public void embotelladora2() throws NoSolution
   {
      int peq = 5;
      int big = 4;
      int total = 20;
      assertEquals("Todo cabe en las grandes", 0, embotelladora.calculaBotellasPequenas(peq, big, total));
   }
   
   //pasa por c1.by y c2.bx
     @Test(expected = NoSolution.class) 
     public void embotelladora3() throws NoSolution
   {
      int peq = 1;
      int big = 3;
      int total = 20;
	  embotelladora.calculaBotellasPequenas(peq, big, total);
   }
   
   //pasa por c1.by y c2.by
     @Test public void embotelladora4() throws NoSolution
   {
      int peq = 4;
      int big = 1;
      int total = 4;
      assertEquals("Sobran litro con la botella grande", 4, embotelladora.calculaBotellasPequenas(peq, big, total));
   }
   
 
}


