package beans;

public class Empleado {

		public final static int MESES_NOMINA = 14;
		public final static double VALOR_ACCION = 5;
		
	
		/* es la variable de clase porque es fija y compartida con todos los objetos de la clase y es 
		   estática y final entonces la puedo hacer pública*/
		 
		protected int idEmpleado;
		protected String nombre, apellidos, sexo;
		protected double salario;
		protected int edad;
		protected double comision;
		protected Departamento departamento;
				
		
	public Empleado() {
		super();
		
	}
		
				
		
      
			public Empleado(int idEmpleado, String nombre, String apellidos, String sexo, double salario, int edad,
				double comision, Departamento departamento) {
			super();
			this.idEmpleado = idEmpleado;
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.sexo = sexo;
			this.salario = salario;
			this.edad = edad;
			this.comision = comision;
			this.departamento = departamento;
		}

			
		
			public double getComision() {
				return comision;
			}


			public void setComision(double comision) {
				this.comision = comision;
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
		return salario / MESES_NOMINA;
	}
public double aumentarSalario(double aumento) {
	return salario *= (1 + (aumento/100));
}
public double totalSalario () {
	return salario + comision;  
}
}
	

