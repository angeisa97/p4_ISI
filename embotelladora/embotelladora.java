



public class embotelladora{

	public int calculaBotellasPequenas(int pequenas, int grandes, int total){ //throws NoSolution{
		
		int total_grandes;
		int total_litros;
		int total_peq;
		int botellas_pequenas;
		
	
		total_grandes = total / 5;
		if(total_grandes > grandes){
			total_litros = total - (grandes*5);
			
		}else{
			total_litros = total - (total_grandes*5);
		}
		
		
		
		total_peq = total_litros/1;
		if(total_peq > pequenas){
			//throw new NoSolution("no solucion");
			return -1;
		}else{
			botellas_pequenas = total_peq;
			return botellas_pequenas;
			
		}
		
		
		
	}

}
