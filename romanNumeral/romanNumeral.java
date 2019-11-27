


public class romanNumeral {
	
    public int convierte(String s) throws InvalidParameter{
        int decimal = 0;
        int lastNumber = 0;
        String romanNumeral = s.toUpperCase();
        for (int x = romanNumeral.length() - 1; x >= 0 ; x--) {
            char convertToDecimal = romanNumeral.charAt(x);

           if(convertToDecimal == 'M'){
                
                    decimal = processDecimal(1000, lastNumber, decimal);
                    lastNumber = 1000;
                  

			}else if (convertToDecimal == 'D'){
                    decimal = processDecimal(500, lastNumber, decimal);
                    lastNumber = 500;
                

            }else if (convertToDecimal == 'C'){
                    decimal = processDecimal(100, lastNumber, decimal);
                    lastNumber = 100;
                   

			}else if (convertToDecimal == 'L'){
                    decimal = processDecimal(50, lastNumber, decimal);
                    lastNumber = 50;
                  
			}else if (convertToDecimal == 'X'){
                    decimal = processDecimal(10, lastNumber, decimal);
                    lastNumber = 10;
                  

            }else if (convertToDecimal == 'V'){
                    decimal = processDecimal(5, lastNumber, decimal);
                    lastNumber = 5;
                   

            }else if (convertToDecimal == 'I'){
                    decimal = processDecimal(1, lastNumber, decimal);
                    lastNumber = 1;
            }else{
				throw new InvalidParameter("parametro invalido");
            }
        }
        return decimal;
    }

    public static int processDecimal(int decimal, int lastNumber, int lastDecimal) {
        if (lastNumber > decimal) {
            return lastDecimal - decimal;
        } else {
            return lastDecimal + decimal;
        }
    }
}
