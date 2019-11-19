package Ejercicios;
import java.util.Scanner;

public class Ejercicio12Repetitivas01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*1.Leer un número detrás de otro mientras que el número leído sea distinto de cero. 
		 * Al final del proceso mostrar cuantos números válidos he leído, 
		 * y cuanto suman las cantidades de los números introducidos.
		 */
		Scanner sc = new Scanner(System.in);
		int numero = 0, contador = 0, acumulador = 0;
		System.out.println("introduce numero distinto de cero");
		numero = sc.nextInt();
		while (numero != 0) {
			contador++; /* es igual a contador+1*/
			acumulador += numero;
			System.out.println("introduce numero distinto de cero");
			//OJO!!!!!! y vuelvo a leer que se me bucla
			numero = sc.nextInt();
		}
			System.out.println("numeros leidos : " + contador);
			System.out.println("suman todos : " + acumulador);
		
		sc.close();
	}

}
