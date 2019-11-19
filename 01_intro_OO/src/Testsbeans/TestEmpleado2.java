package Testsbeans;
import Beans.Empleado;

public class TestEmpleado2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado emp3 = new Empleado(115, "Ricardo", "Asin", "H", 30000, 50);
		System.out.println("mi salario es " + emp3.salarioMensual());
	}

}
