package ejercicio2;

public class Polideportivo extends Edificio implements InstalacionDeportiva {

	private String nombre;
	
	public Polideportivo(String nombre, double superficieEdificio) {
		super(superficieEdificio);
		this.nombre = nombre;
	}

	@Override
	//1 = Polideportivo
	public int getTipoDeInstalacion() {		
		return 1;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
