public class Bisiestos {

  // Devuelve true si año es bisiesto, false en caso contrario
  // Eleva la excepcion InvalidParameter si año no es un parametro valido

  public static boolean esBisiesto(int year) throws InvalidParameter {

    if (year <= 0){
      throw new InvalidParameter("Año inválido");
    }

    if ((year %4 == 0 && year %100 != 0) || (year %4 == 0 && year%100 == 0 && year%400 == 0)){
      return true;
    }else{
      return false;
    }
  }
}
