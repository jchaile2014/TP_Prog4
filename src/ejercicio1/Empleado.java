package ejercicio1;

import java.time.LocalDate;

public class Empleado extends Persona {
	
	private int legajo;
	private String puesto;
	
	public Empleado() {
	    super();
	}

	public Empleado(String dni, String nombre, String apellido,
	                LocalDate fechaNacimiento, String genero,
	                String direccion, String telefono, String email,
	                String puesto) {
	    super(dni, nombre, apellido, fechaNacimiento, genero, direccion, telefono, email);
	    this.puesto = puesto;
	}
	
	public int getLegajo() {
		return legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	@Override
	public String toString() {
        return super.toString() +
               " Legajo: " + legajo +
               " Puesto: " + puesto;
        }
	
	}
