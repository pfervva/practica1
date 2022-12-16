/*
 * TestMatematicas.java 
 * 
 * 
 */
import java.util.Scanner;

public class TestMatematicas{
	
	public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Dime el dato para comprobar si es par o impar");
	int dato = sc.nextInt();
	boolean par = Matematicas.esPar(dato);
	if (par == true){
		System.out.printf("El numero %d es par",dato);
	}else{
		System.out.printf("El numero %d es impar",dato);
	}
	System.out.println("Dime el dato para comprobar si es divisible de 3 \n");
	int dato2 = sc.nextInt();
	par = Matematicas.esDivisiblePorTres(dato2);
	if (par == true){
		System.out.printf("El numero %d es divisible de 3",dato2);
	}else{
		System.out.printf("El numero %d es divisible de 3",dato2);
	}
		System.out.println("Dime el dato para comprobar si es divisible de 5\n");
	int dato3 = sc.nextInt();
	par = Matematicas.esDivisiblePorCinco(dato3);
	if (par == true){
		System.out.printf("El numero %d es divisible de 5",dato3);
	}else{
		System.out.printf("El numero %d es divisible de 5",dato3);
	}
	
	}
}

