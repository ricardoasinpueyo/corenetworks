package beans;

public class Director extends Empleado {

	public static String getAcciones;
	private int acciones;
	private String tablet;
	
	
	
	public Director() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Director(int idEmpleado, String nombre, String apellidos, String sexo, double salario, int edad,
			double comision, Departamento departamento, int acciones, String tablet) {
		super(idEmpleado, nombre, apellidos, sexo, salario, edad, comision, departamento);
		this.acciones = acciones;
		this.tablet = tablet;
	}







	public int getAcciones() {
		return acciones;
	}
	public void setAcciones(int acciones) {
		this.acciones = acciones;
	}
	public String getTablet() {
		return tablet;
	}
	public void setTablet(String tablet) {
		this.tablet = tablet;
	}
	
	
		
	@Override
	public String toString() {
		return "Director [acciones=" + acciones + ", tablet=" + tablet + "]";
	}

	@Override
	public double salarioMensual() {
		// TODO Auto-generated method stub
		return super.salarioMensual();
	}
	@Override
	public double totalSalario() {
		// TODO Auto-generated method stub
		return super.totalSalario() + acciones * VALOR_ACCION;
	}
	
	
	
	
	
	
	
	
	
	
}
