package Ejercicios;
import java.util.Scanner;

public class Ejercicio04supuesto3 {

	public static void main(String[] args) {
		int radio = 0;
		double circunferencia = 0, areaCirculo = 0;
		Scanner leer = new Scanner(System.in);
		System.out.print("teclea un numero porfa : ");
		/*a.	La circunferencia(2*PI*r)
		 * b.	El área del circulo (PI * r2)
		 */	
		
		radio = leer.nextInt();
		circunferencia = 2* Math.PI * radio;
		System.out.println("circunferencia : " + circunferencia);
		areaCirculo = Math.PI * Math.pow(radio, 2);
		System.out.println("area circulo : " + areaCirculo);
	
System.out.println();

leer.close();
	}

}
