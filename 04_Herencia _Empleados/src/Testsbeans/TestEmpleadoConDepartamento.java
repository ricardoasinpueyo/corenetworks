package Testsbeans;

import beans.Departamento;
import beans.Empleado;

public class TestEmpleadoConDepartamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado emp1 = new Empleado(200, "eva", "perez",null, 20000, 34, 0, null);
		
		Departamento dep40 = new Departamento(40, "Formacion");
		Empleado emp2 = new Empleado(210, "sara", "ruiz", null, 18000, 45, 0, dep40);
		
		System.out.println(emp1);
		System.out.println(emp2);
		
		/*mostar por consola:
		 *  el nombre del departamento del emp2
		 *  el nombre del emp2, su salario y el nombre del departamento al que pertenece*/

		System.out.println("nombre empleado 2 - sara : " + emp2.getNombre());
		System.out.println("salario empleado 2 - 18000 : " + emp2.getSalario());
		System.out.println("nombre dep del empleado 2 - Formacion :" + emp2.getDepartamento().getNombre());
	}

}
