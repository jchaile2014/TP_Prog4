package ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
	 
		Empleado emp1 = new Empleado(); 
		Empleado emp2 = new Empleado("11111111", "Juan", "Perez", LocalDate.of(1990, 5, 20), "Masculino", "Calle Falsa 123", "11223344", "juan@mail.com", "Vendedor");
		Empleado emp3 = new Empleado("22222222", "Maria", "Gomez", LocalDate.of(1985, 10, 15), "Femenino", "Avenida Siempreviva 742", "55667788", "maria@mail.com", "Gerente");
		Empleado emp4 = new Empleado(); 
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
