package Ejercicios;
import java.util.Scanner;

public class Ejercicio06AlrededorSexo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leer = new Scanner(System.in); /* scan control barra y me aparece el import inicicial y el System.in me genera un flujo de la memoria*/

char sexo= 'M';
if (sexo == 'H')
System.out.println("Hombre");
else
System.out.println("Mujer");

String sexoS = "M";
if (sexoS.equals ("H"))
System.out.println("Hombre String");
else
System.out.println("Mujer String");

char sexoLeer;	
sexoLeer = leer.next().charAt(0);
if (sexoLeer == 'H')
System.out.println("Hombre con caracter");
else
System.out.println("Mujer con caracter");

String sexoLeerString = null;
sexoLeerString = leer.next();
if (sexoLeerString.equals ("H"))
System.out.println("Hombre Leer String");
else
System.out.println("Mujer Leer String");

System.out.println("pepe".compareTo("Pepe")); /*sale + porque p es mayor que la P en el Codigo ASCII y nos sale un entero +*/
leer.close(); /* para cerrar el flujo de datos que va a la memoria*/

	}

}
