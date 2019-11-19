package Beans;

public class Empleado {

		private int idEmpleado;
		private String nombre, apellidos, sexo;
		private double salario;
		private int edad;
		private Departamento departamento;
				
	public Empleado() {
		super();
		
	}
		
		public Empleado(int idEmpleado, String nombre, String apellidos, String sexo,
				double salario, int edad) /* este es el metodo constructor*/ {
			super(); /* es una referencia al padre Object*/
			this.idEmpleado = idEmpleado;
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.sexo = sexo;
			this.salario = salario;
			this.edad = edad;
		}
		
		public Empleado(int idEmpleado, String nombre, String apellidos, double salario, int edad, Departamento departamento) {
			super();
			this.idEmpleado = idEmpleado;
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.salario = salario;
			this.edad = edad;
			this.departamento = departamento;
		}

      
			public Departamento getDepartamento() {
			return departamento;
		}

		public void setDepartamento(Departamento departamento) {
			this.departamento = departamento;
		}

		public int getIdEmpleado() {
			return idEmpleado;
		}

		public void setIdEmpleado(int idEmpleado) {
			this.idEmpleado = idEmpleado;
		}

		public String getNombre() {
			return nombre = nombre.toUpperCase();
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellidos() {
			return apellidos;
		}

		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}

		public String getSexo() {
			return sexo;
		}

		public void setSexo(String sexo) {
			this.sexo = sexo;
		}

		public double getSalario() {
			return salario;
		}

		public void setSalario(double salario) {
			this.salario = salario;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}


		
		@Override
		public String toString() {
			return "Empleado [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", apellidos=" + apellidos + ", sexo="
					+ sexo + ", salario=" + salario + ", edad=" + edad + ", departamento=" + departamento + "]";
		}



// METODOS RESPONSABILIDAD DE LA CLASE

public String nombreCompleto() {
	return apellidos +"," + nombre;
}
public double salarioMensual() {
		return salario / 14;
	}}
	

