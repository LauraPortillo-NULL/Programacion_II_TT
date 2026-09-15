
package _26_08_2026;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class ClinicaMain {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        
        for (int i = 1; i <= 25; i++) {
            System.out.print("○○"); // Esto funciona gracias a UTF_8
        }
        System.out.println();
        System.out.println("--- SISTEMA CLÍNICO ORIENTADO A OBJETOS ---");
        for (int i = 1; i <= 25; i++) {
            System.out.print("○○"); // Esto funciona gracias a UTF_8
        }
        System.out.println();
        
        try {
            Paciente paciente1 = new Paciente("Ana Chávez", 68.5, 1.65);
            System.out.println("Paciente: " + paciente1.getNombre());
            System.out.printf("IMC: %.2f\n", paciente1.calcularIMC());
            System.out.println("Diagnóstico: " + paciente1.obtenerDiagnosticoOMS());
            
            System.out.println("\nRegistrando paciente 2");
            
            //  OII ESTO ES SOLO PARA SIMULAR UN SISTEMA REAL Y ESTÉTICO, NO ERA PARTE DEL EJERCICIO ^^
            try {
                for (int i = 0; i < 3; i++) {
                    Thread.sleep(1600);
                    System.out.print(".");
                }
            }catch(InterruptedException e) {
                System.out.println("Error durante la espera.");
            }
            System.out.println();
            
            Paciente paciente2 = new Paciente("Carlos", -15.0, 1.80);
        }catch(IllegalArgumentException e) {
            System.out.println("ERROR DEL SISTEMA: " + e.getMessage());
        }
        
    }
    
}
