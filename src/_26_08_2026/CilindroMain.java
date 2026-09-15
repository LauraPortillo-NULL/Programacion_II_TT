
package _26_08_2026;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class CilindroMain {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- CALCULADORA DE CILINDROS ---");
        try{
            System.out.print("Ingrese la altura del cilindro en metros: ");
            double altura = scanner.nextDouble();
            System.out.print("Ingrese el diámetro del cilindro en metros: ");
            double diametro = scanner.nextDouble();
            
            Cilindro miCilindro = new Cilindro(altura, diametro);
            
            System.out.printf("El volumen del cilindro es: %.2f metros cúbicos.\n", miCilindro.calcularVolumen());
        }catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }catch (Exception e) {
            System.out.println("Error: Ingrese un valor numérico válido.");
        }finally {
            scanner.close();
        }
    }
    
}
