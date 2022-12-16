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

	
	}
}

