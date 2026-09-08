
package _26_08_2026;

//  Bibliotecas
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class sistemaEscolar {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Scanner scanner = new Scanner(System.in);
        
        //  INSTANCIACIÓN: Creamos el primer objeto Alumno
        Alumno estudiante1 = new Alumno();
        
        //  Asignación de valores a sus atributos (El "Ser")
        estudiante1.nombre = "Ana Chávez";
        estudiante1.matricula = 1000;
        estudiante1.promedio = 85.5;
        
        //  INSTANCIACIÓN: Crear un segundo objeto Alumno
        Alumno estudiante2 = new Alumno();
        
        //  Recolección de datos por medio del teclado
        System.out.print("Ingrese el nombre del nuevo alumno: ");
        estudiante2.nombre = scanner.nextLine();
        
        System.out.print("Ingrese el promedio de " + estudiante2.nombre + ": ");
        estudiante2.promedio = scanner.nextDouble();
        estudiante2.matricula = 1001;
        
        System.out.print("\nEjecutando comportamientos del sistema...\n\n");
        
        //  INVOCAMOS LOS MÉTODOS (El "Hacer")
        estudiante1.mostrarDatos();
        estudiante1.verificarEstadoAcademico();
        System.out.println();
        estudiante2.mostrarDatos();
        estudiante2.verificarEstadoAcademico();
        
        scanner.close();
    }
}
