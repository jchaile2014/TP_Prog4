package ejercicio1;

import java.time.LocalDate;

public class MainEjercicio1_a {

    // verifica si el DNI tiene 8 caracteres que sean numeros
    public static void verificarDNI(String dni) throws ExVerificarDNI {
        if (dni == null || !dni.matches("\\d{8}")) {
            throw new ExVerificarDNI();
        }
    }

    public static void main(String[] args) {

        // persona 1: DNI invalido
        Empleado persona1 = new Empleado("AA202020", "Juan", "Pérez",
                LocalDate.of(1990, 5, 15), "M",
                "Calle Falsa 123", "1122334455", "juan@mail.com", "Analista");

        try {
            verificarDNI(persona1.getDni());
            System.out.println("Persona agregada correctamente");
        } catch (ExVerificarDNI e) {
            System.out.println("Persona no agregada por no verificar el DNI");
        }

        // persona 2: DNI valido
        Empleado persona2 = new Empleado("20202020", "María", "García",
                LocalDate.of(1995, 8, 20), "F",
                "Av. Siempre Viva 742", "1198765432", "maria@mail.com", "Desarrolladora");

        try {
            verificarDNI(persona2.getDni());
            System.out.println("Persona agregada correctamente");
        } catch (ExVerificarDNI e) {
            System.out.println("Persona no agregada por no verificar el DNI");
        }
    }
}