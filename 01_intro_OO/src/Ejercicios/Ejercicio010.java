package Ejercicios;
import java.util.Scanner;

public class Ejercicio010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String usuario=null, pwd = null;
Scanner leer = new Scanner(System.in);
System.out.print("usuario");
usuario = leer.next();
System.out.print("contraseña");
pwd = leer.next();
leer.close(); // este leer.close es para que se vaya el amarillo de Scanner leer

if (usuario.equals("sara")) {
	if (pwd.equals("sarita"))
		System.out.println("usuario y contraseña correctas, bienvenido a la aplicación");
	else
		System.out.println("contraseña incorrecta");
}else
		System.out.println("usuario incorrecto");



if (usuario.equals("sara")&& pwd.contentEquals("sarita"))
	System.out.println("usuario y contraseña correctas, bienvenido a la aplicación");
else
	System.out.println("usuario o contraseña incorrectos, sorry");
}



	}


