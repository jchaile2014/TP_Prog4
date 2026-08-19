package ejercicio1;

import java.time.LocalDate;

public class Empleado extends Persona {
	
	//declaración de variables
	
	private final int legajo;
	private String puesto;
	private static int contador = 999;
	
	public Empleado() {
	    super();
	    contador++;
	    this.legajo = contador;
	}
	
	//constructores

	public Empleado(String dni, String nombre, String apellido,
	                LocalDate fechaNacimiento, String genero,
	                String direccion, String telefono, String email,
	                String puesto) {	
	    super(dni, nombre, apellido, fechaNacimiento, genero, direccion, telefono, email);
	    contador++;
	    this.legajo = contador;
	    this.puesto = puesto;    
	}
	
	//getters and setters
	
	public int getLegajo() {
		return legajo;
	}
	
	public String getPuesto() {
		return puesto;
	}
	
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	
	////métodos
	//método toString
	
	@Override
	public String toString() {
        return super.toString() +
               " Legajo: " + legajo +
               " Puesto: " + puesto;
        }
	
	
	}
