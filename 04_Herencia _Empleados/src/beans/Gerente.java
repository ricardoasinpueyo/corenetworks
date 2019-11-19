package beans;

public class Gerente extends Empleado {

	private int plazadegaraje;
	private String movil;
	private double variable;
	
	
	public Gerente() {
		super();
		// TODO Auto-generated constructor stub
	}
	
		
	
	
	
	
	
	
	public Gerente(int idEmpleado, String nombre, String apellidos, String sexo, double salario, int edad,
			double comision, Departamento departamento, int plazadegaraje, String movil, double variable) {
		super(idEmpleado, nombre, apellidos, sexo, salario, edad, comision, departamento);
		this.plazadegaraje = plazadegaraje;
		this.movil = movil;
		this.variable = variable;
	}








	public int getPlazadegaraje() {
		return plazadegaraje;
	}
	public void setPlazadegaraje(int plazadegaraje) {
		this.plazadegaraje = plazadegaraje;
	}
	public String getMovil() {
		return movil;
	}
	public void setMovil(String movil) {
		this.movil = movil;
	}
	public double getVariable() {
		return variable;
	}
	public void setVariable(double variable) {
		this.variable = variable;
	}

	@Override
	public String toString() {
		if(departamento == null)
		       return "Gerente [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", apellidos=" + apellidos + ", sexo="
				+ sexo + ", salario=" + salario + ", edad=" + edad + ", departamento=" + departamento
				+ ", plazadegaraje=" + plazadegaraje + ", movil=" + movil + ", variable=" + variable + "]";
		else
			return "Gerente [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", apellidos=" + apellidos + ", sexo="
			+ sexo + ", salario=" + salario + ", edad=" + edad + ", departamento=" + departamento.getIdDepartamento()
			+ ", plazadegaraje=" + plazadegaraje + ", movil=" + movil + ", variable=" + variable + "]";
}
	
	
	


}
