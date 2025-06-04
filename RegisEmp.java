import java.util.LinkedList;
import java.util.Scanner;
import java.util.Random;

public class RegisEmp {

    public static void main(String[] args) {
        LinkedList<Empleado> empleados = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String continuar;
        int idContador = 1; // Comienza en 1 y se incrementa por cada empleado

        do {
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();

            System.out.print("Departamento: ");
            String departamento = scanner.nextLine();

            System.out.print("Salario: ");
            double salario = Double.parseDouble(scanner.nextLine());

            String codigo = generarCodigoEmpleado(apellido, departamento, random);
            Empleado empleado = new Empleado(idContador, codigo, nombre, apellido, departamento, salario);
            empleados.add(empleado);
            idContador++; // Incrementar ID para el próximo empleado

            System.out.print("¿Desea ingresar otro empleado? (s/n): ");
            continuar = scanner.nextLine();

        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("\n--- Lista de Empleados Registrados ---");
        for (Empleado emp : empleados) {
            System.out.println("ID: " + emp.getId()
                    + " | Código: " + emp.getCodigo()
                    + " | Nombre: " + emp.getNombre()
                    + " | Apellido: " + emp.getApellido()
                    + " | Departamento: " + emp.getDepartamento()
                    + " | Salario: " + emp.getSalario());
        }

        scanner.close();
    }

    private static String generarCodigoEmpleado(String apellido, String departamento, Random random) {
        String parte1 = apellido.length() >= 2 ? apellido.substring(0, 2) : apellido;
        String parte2 = departamento.length() >= 3 ? departamento.substring(0, 3) : departamento;
        int numero = 100 + random.nextInt(900); // Número aleatorio de 3 dígitos
        return parte1.toUpperCase() + parte2.toUpperCase() + numero;
    }
}