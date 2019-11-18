import java.util.*;

public class DescuentoBlackFriday {

     // Parametros: precioOriginal es el precio de un producto marcado
     //             en la etiqueta
     //             porcentajeDescuento es el descuento a aplicar expresado como un porcentaje
     // Devuelve: el precio final teniendo en cuenta que si es black friday (29 de noviembre) se aplica
     //             un descuento de porcentajeDescuento
     // Eleva la excepcion InvalidParameter si precioOriginal es negativo


     public double PrecioFinal(double precioOriginal, double porcentajeDescuento, Date fecha) throws InvalidParameter
     {

          Date black = new Date(2019,11,29);

          if (precioOriginal <= 0){
               throw new InvalidParameter("Precio original negativo");
          }

          if (black.compareTo(fecha) == 0){
               //Si la fecha introducida es blackfriday
               double preciofinal = precioOriginal*(1.0-(porcentajeDescuento/100));
               return preciofinal;
          }else{
               double preciofinal = precioOriginal;
               return preciofinal;
          }


     }
}
