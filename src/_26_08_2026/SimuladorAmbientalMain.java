
package _26_08_2026;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
public class SimuladorAmbientalMain {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        
        ProyectoEcologico informeUniNorte = new ProyectoEcologico("UniNorte - Laboratorio", 15);
        
        System.out.println("--- INFORME DE IMPACTO AMBIENTAL ---");
        for (int i = 0; i < 11; i++){System.out.print("♣.♣");}
        System.out.println();
        System.out.println("Institución: " + informeUniNorte.getNombreInstitucion());
        System.out.println("Resmas utilizadas: " + informeUniNorte.getResmasConsumidas());
        
        System.out.printf("Madera consumida: %.2f Kg\n", informeUniNorte.calcularMaderaConsumidaKg());
        System.out.printf("Árboles requeridos: %.2f árboles\n", informeUniNorte.calcularArbolesTalados());

        System.out.println("\nActualizando inventario a 50 resmas");
        for(int i = 0; i < 3; i++) {
            try {
                Thread.sleep(1600);
                System.out.print(".");
            }catch(InterruptedException e) {
                System.out.println("Error en el tiempo de espera");
            }
        }
        System.out.println();
        
        informeUniNorte.setResmasConsumidas(50);
        System.out.printf("Nuevos árboles requeridos: %.2f árboles\n", informeUniNorte.calcularArbolesTalados());
        System.out.println("Megamierdón");
    }
    
}
