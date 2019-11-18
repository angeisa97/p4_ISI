import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class embotelladoraTest
{
   
   embotelladora embotelladora = new embotelladora();
   
   @Test public void botellasPeq() 
   {
      int peq = 5;
      int big = 3;
      int total = 20;
      assertEquals("Numero suficiente de botellas pequenas", 5, embotelladora.calculaBotellasPequenas(peq, big, total));
   }
   
    @Test public void botellasSoloGrandes() 
   {
      int peq = 5;
      int big = 4;
      int total = 20;
      assertEquals("Todo cabe en las grandes", 0, embotelladora.calculaBotellasPequenas(peq, big, total));
   }
   
     @Test public void noSuficientesPequenas() 
   {
      int peq = 1;
      int big = 3;
      int total = 20;
      assertEquals("No hay botellas pequenas suficientes", -1, embotelladora.calculaBotellasPequenas(peq, big, total));
   }
   
     @Test public void sobraGrande() 
   {
      int peq = 4;
      int big = 1;
      int total = 4;
      assertEquals("Sobran litro con la botella grande", 4, embotelladora.calculaBotellasPequenas(peq, big, total));
   }
   
    @Test public void botellasPeq2() 
   {
      int peq = 2;
      int big = 3;
      int total = 12;
      assertEquals("Numero suficiente de botellas pequenas", 2, embotelladora.calculaBotellasPequenas(peq, big, total));
   }
   
   @Test public void botellasPeq3() 
   {
      int peq = 3;
      int big = 10;
      int total = 43;
      assertEquals("Numero suficiente de botellas pequenas", 3, embotelladora.calculaBotellasPequenas(peq, big, total));
   }
}


