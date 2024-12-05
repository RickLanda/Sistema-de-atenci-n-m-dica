import Servicios.*;
import modelo.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("===== Sistema de Atencion Medica =====");
            System.out.println("1. Registrar paciente");
            System.out.println("2. Registrar medico");
            System.out.println("3. Agendar cita");
            System.out.println("4. Consultar pacientes");
            System.out.println("5. Consultar medicos");
            System.out.println("6. Consultar citas");
            System.out.println("7. Cancelar cita");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Consumir nueva linea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese nombre del paciente: ");
                    String nombreP = sc.nextLine();
                    System.out.print("Ingrese edad del paciente: ");
                    int edad = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Ingrese ID del paciente: ");
                    String idP = sc.nextLine();
                    sistema.registrarPaciente(nombreP, edad, idP);
                    break;
                case 2:
                    System.out.print("Ingrese nombre del medico: ");
                    String nombreM = sc.nextLine();
                    System.out.print("Ingrese especialidad del medico: ");
                    String especialidad = sc.nextLine();
                    System.out.print("Ingrese ID del medico: ");
                    String idM = sc.nextLine();
                    sistema.registrarMedico(nombreM, especialidad, idM);
                    break;
                case 3:
                    System.out.print("Ingrese ID de la cita: ");
                    String idC = sc.nextLine();
                    System.out.print("Ingrese ID del paciente: ");
                    String idPaciente = sc.nextLine();
                    System.out.print("Ingrese ID del medico: ");
                    String idMedico = sc.nextLine();
                    System.out.print("Ingrese fecha de la cita: ");
                    String fecha = sc.nextLine();
                    sistema.agendarCita(idC, idPaciente, idMedico, fecha);
                    break;
                case 4:
                    System.out.println("Pacientes registrados:");
                    for (Paciente p : sistema.obtenerPacientes()) {
                        System.out.println(p);
                    }
                    break;
                case 5:
                    System.out.println("Medicos registrados:");
                    for (Medico m : sistema.obtenerMedicos()) {
                        System.out.println(m);
                    }
                    break;
                case 6:
                    System.out.println("Citas registradas:");
                    for (Cita c : sistema.obtenerCitas()) {
                        System.out.println(c);
                    }
                    break;
                case 7:
                    System.out.print("Ingrese ID de la cita a cancelar: ");
                    String idCancel = sc.nextLine();
                    sistema.cancelarCita(idCancel);
                    break;
                case 8:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opcion invalida, intente nuevamente.");
            }
        } while (opcion != 8);

        sc.close();
    }
}
