
package _26_08_2026;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
public class EstadisticasMain {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        
        for (int i = 1; i <= 25; i++)
        {
            System.out.print("==");
        }
        System.out.println();
        System.out.println("--- ESTADÍSTICA DE CONSUMO INVOLUNTARIO ---");
        for (int i = 1; i <= 25; i++)
        {
            System.out.print("==");
        }
        System.out.println();
        
        try {
            Persona sujeto = new Persona("Carlos", 25);
            System.out.println("Sujeto de estudio " + sujeto.getNombre());
            System.out.println("Edad " + sujeto.getEdad() + " años.\n");
            
            System.out.println("Desglose de consumo acumulado:");
            System.out.printf("- Arañas: %.5f Kg\n", sujeto.calcularKgAranias());
            System.out.printf("- Mosquitos: %.5f Kg\n", sujeto.calcularKgMosquitos());
            System.out.printf("- Zancudos: %.5f Kg\n", sujeto.calcularKgZancudos());
            
            for (int i = 0; i <= 25; i++)
            {
                System.out.print("--");
            }
            System.out.println();
            
            System.out.printf("TOTAL CONSUMIDO: %.5f Kg\n", sujeto.calcularKgTotales());
        }catch (IllegalArgumentException e) {
            System.out.println("Error al procesar datos: " + e.getMessage());
        }
    }
    
}
