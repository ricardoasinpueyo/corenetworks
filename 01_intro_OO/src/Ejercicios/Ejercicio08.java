package Ejercicios;
import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double op1 = 0, op2 = 0;
		String palabra = null;	
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Dame un numero : ");
		op1 = leer.nextDouble();
		System.out.println("Dame otro numero : ");
		op2 = leer.nextDouble();
		System.out.println("Dame una palabra, Sumar, Restar, Multiplicar, Dividir, Resto");
		palabra = leer.next();
						
		switch(palabra) {
		case "Sumar":
		   System.out.println("La suma es " + (op1 + op2));
	//	   break;
		case "Restar":
		   System.out.println("La resta es " + (op1 - op2));
	//	   break;
		case "Multiplicar":
		   System.out.println("La Multiplicacion es " + (op1 * op2));
	//	   break;
		case "Dividir" :
		   System.out.println("La Division es " + (op1 / op2));
	//	   break;
		case "Resto" :
		   System.out.println("El resto es " + (op1 % op2));
	//	   break;
default:
	System.out.println();
		
		
	}

	}}
