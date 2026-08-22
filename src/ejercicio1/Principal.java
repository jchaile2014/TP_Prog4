package ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
	 
		Empleado emp1 = new Empleado();
		emp1.setDni("44444444");
		emp1.setNombre("Rosa");
		emp1.setApellido("Torres");
		emp1.setFechaNacimiento(LocalDate.of(1988, 7, 3));
		emp1.setGenero("Femenino");
		emp1.setDireccion("Belgrano 123");
		emp1.setTelefono("11445566");
		emp1.setEmail("rosa@mail.com");
		emp1.setPuesto("Recepcionista");

		Empleado emp2 = new Empleado("11111111", "Juan", "Perez", LocalDate.of(1990, 5, 20), "Masculino", "Calle Falsa 123", "11223344", "juan@mail.com", "Vendedor");
		Empleado emp3 = new Empleado("22222222", "Maria", "Gomez", LocalDate.of(1985, 10, 15), "Femenino", "Avenida Siempreviva 742", "55667788", "maria@mail.com", "Gerente");

		Empleado emp4 = new Empleado();
		emp4.setDni("55555555");
		emp4.setNombre("Luis");
		emp4.setApellido("Diaz");
		emp4.setFechaNacimiento(LocalDate.of(2000, 12, 25));
		emp4.setGenero("Masculino");
		emp4.setDireccion("Rivadavia 789");
		emp4.setTelefono("22334455");
		emp4.setEmail("luis@mail.com");
		emp4.setPuesto("Soporte");

		Empleado emp5 = new Empleado("33333333", "Carlos", "Lopez", LocalDate.of(1995, 2, 10), "Masculino", "San Martin 456", "99887766", "carlos@mail.com", "Administrativo");
		
		System.out.println("--- Empleados ---");
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
		System.out.println(emp3.toString());
		System.out.println(emp4.toString());
		System.out.println(emp5.toString());

		System.out.println("\nEl próximo legajo será el " + Empleado.devuelveProximoLegajo());	
		
		
		ArrayList<Empleado> listaEmpleados = new ArrayList<>();
		listaEmpleados.add(emp1);
		listaEmpleados.add(emp2);
		listaEmpleados.add(emp3);
		listaEmpleados.add(emp4);
		listaEmpleados.add(emp5);

		System.out.println("\n--- Búsqueda por DNI ---");
		Empleado encontrado = Empleado.buscarPorDni(listaEmpleados, "22222222");
		if (encontrado != null) {
			System.out.println(encontrado.toString());
		} else {
			System.out.println("No se encontró un empleado con ese DNI");
		}		
	}
}
