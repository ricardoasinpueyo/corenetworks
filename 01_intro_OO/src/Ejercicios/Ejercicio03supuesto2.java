package Ejercicios;

public class Ejercicio03supuesto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 - declarar variables
		int lado1=0, lado2=0;
		int perimetro=0;
		int area=0;
		double hipotenusa=0;
		// 2 - Obtener los datos de entrada
		lado1=7; lado2=4;
		// 3 - Procesar los datos de entrada, generando o no la salida parcial/total.
		perimetro=(lado1+lado2)*2;
		System.out.println("resultado perimetro esperado 22 " + perimetro);
		area=lado1*lado2;
				System.out.println("resultado area 28 " + area);
		hipotenusa= Math.sqrt(lado1*lado1 + lado2*lado2);
		System.out.println("resultado hipotenusa esperado 8.algo " + hipotenusa);
		// 4 - Escribir estadísticas

		String prueba = String.valueOf(false);
		System.out.println(prueba);
		
	}

}
