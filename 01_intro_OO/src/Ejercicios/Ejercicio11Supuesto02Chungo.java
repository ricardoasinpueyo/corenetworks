package Ejercicios;
import java.util.Scanner;

public class Ejercicio11Supuesto02Chungo {
	static double comision, salario, aumento, subida;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		salario = 30000;
		aumento = 0;
		comision = 0;
								
				if (comision == 0) {
				    verSalario();
				    }
				else {
					verComision();
					}
				System.out.print("el salario era : " + salario);
				System.out.print("\tla subida es : " + subida + "%");
				System.out.print("\tel aumento es : " + aumento);
				System.out.println("\tte queda el salario : " + (salario+aumento));
				/*\t se pone el tabulador*/
	}		
	private static void verSalario() {
				if(salario < 15000) {
					subida = 10;
					aumento = salario * subida/100;
				} else {
					if(salario >=15001 && salario <= 30000) {
						subida = 8;
						aumento = salario * subida/100;
					}else {
						if (salario >= 30001 && salario < 45000) {
							subida = 4;
							aumento = salario * subida/100;
						}else {
							subida=0;
							aumento=0;
						}
					}
				}
	}
						
	private static void verComision() {
			if (comision <2000) {
				System.out.println("aumento del 12%");
			}else {if (comision >=2000 && comision < 10000) {
				System.out.println("aumento del 6%");
			}else {
				System.out.println("te jorobas no aumento");
			}
			}
	}
}
