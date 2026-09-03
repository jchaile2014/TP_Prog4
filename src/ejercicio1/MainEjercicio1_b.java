package ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ListIterator;

public class MainEjercicio1_b {

	public static void main(String[] args) {
		
		Empleado emp1 = new Empleado("42419466", "Agustin", "Zuloaga",
                LocalDate.of(2000, 1, 26), "M",
                "Tucuman 1174", "1139432767", "agustinleonelzuloaga@gmail.com", "Data Analyst");
		
		Empleado emp2 = new Empleado("44340604", "Bruno", "Zuloaga",
                LocalDate.of(2002, 7, 22), "M",
                "Tucuman 1174", "1127839943", "brunothomaszuloaga@gmail.com", "Traductor de Inglés");
		
		Empleado emp3 = new Empleado("38345233", "Adrian", "Smith",
                LocalDate.of(1970, 5, 12), "M",
                "Siempre Viva 23", "1189432843", "asmith@gmail.com", "Ingeniero Eléctrico");
		
		Empleado emp4 = new Empleado("17311553", "Mariela", "Alfonso",
                LocalDate.of(1966, 4, 11), "F",
                "Avellaneda 700", "1161801553", "malfonso@gmail.com", "Gerente de RRHH");
		
		Empleado emp5 = new Empleado("40541029", "Ivanna", "Sosa",
                LocalDate.of(1997, 8, 27), "M",
                "Irupe 1881", "1138542366", "isosa@gmail.com", "Administrativa");
		
		ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>(5);
		
		listaEmpleados.add(emp1);
		listaEmpleados.add(emp2);
		listaEmpleados.add(emp3);
		listaEmpleados.add(emp4);
		listaEmpleados.add(emp5);
		
		ListIterator<Empleado> iterador = listaEmpleados.listIterator();
		
		while(iterador.hasNext()) {
			Empleado empleados = iterador.next();
			System.out.println(empleados.toString());
		}
		
	}	
}
 	