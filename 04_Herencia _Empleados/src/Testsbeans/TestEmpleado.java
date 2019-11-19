package Testsbeans;
import beans.Empleado;

public class TestEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado emp1, emp2, emp3, emp4;
		String nombre = "cucu";
		
		emp1 = new Empleado();
		emp2 = new Empleado(114, "eva", "perez", "H", 45000, 43, 2000, null);
		emp3 = new Empleado(115, "Ricardo", "Asin", "H", 30000, 50, 3000, null);
		emp4 = new Empleado(121, "ppp", "pp", "H", 12000, 0, 12000, null);
		
		
		emp1.setIdEmpleado(114);
		emp1.setNombre("Rafael");
		emp1.setApellidos("Delgado");
		emp1.setEdad(56);
		emp1.setSalario(34500);
		emp1.setSexo("H");
	/*	
		emp1.idEmpleado = 100;
		emp1.nombre = "tomas";
		emp1.apellidos = "escu delgado";
		emp1.edad = 58;
		emp1.salario = 25000;
		emp1.sexo = "h";
		
		emp2.idEmpleado = 100;
		emp2.nombre = "ricardo";
		emp2.apellidos = "asin";
		emp2.edad = 50;
		emp2.salario = 30000;
		emp2.sexo = "h";
		
		emp3.idEmpleado = 100;
		emp3.nombre = "Alvaro";
		emp3.apellidos = "escu delgado";
		emp3.edad = 40;
		emp3.salario = 45000;
		emp3.sexo = "h"; 
		*/
		
		/*emp2 = emp3; /* con esto comprobamos que la dirección de memoria es la misma*/
		
		System.out.println(nombre);
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		
		
		System.out.println(emp2.getSalario());
		System.out.println(emp1.getNombre());
		System.out.println(emp3.getNombre());
		System.out.println(emp4.getSalario());
		


	}

}
