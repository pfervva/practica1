/*
 * Matematicas.java
 *
 */


public class Matematicas {
	
	public static boolean esPar(int numero){
	boolean x;
	if (numero % 2 == 0){
	x = true;
}
	else{
	x = false;
	}
		
	return x;
	}
	public static boolean esDivisiblePorTres(int numero){
	boolean x;
	if (numero % 3 == 0){
	x = true;
}
	else{
	x = false;
	}
		
	return x;
	}
	public static boolean esDivisiblePorCinco(int numero){
	boolean x;
	if (numero % 5 == 0){
	x = true;
}
	else{
	x = false;
	}
		
	return x;
	}
	
}

