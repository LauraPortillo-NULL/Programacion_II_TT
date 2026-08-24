
package _10_08_2026;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Scanner scanner = new Scanner(System.in);
        
        int a;
        int b;
        
        System.out.println("CALCULADORA DE SINASTRÍA ELEMENTAL");
        
        for(int i = 0; i <= 33; i++)
        {
            System.out.print("=");
        }
      
        System.out.println("\nOpciones\n1. Fuego\n2. Tierra\n3. Aire\n4. Agua");
        
        do
        {
            System.out.print("Ingresa tu elemento (ejemplo: 4): ");
            a = scanner.nextInt();
            System.out.print("Ingresa su elemento (ejemplo: 1): ");
            b = scanner.nextInt();
        }while((a < 1 || a > 4) || (b < 1 || b > 4));
        
        if(a == b)
        {
            System.out.println("Compatibilidad Alta.");
        }else if(((a == 1 && b == 3) || (a == 3 && b == 1)) || ((a == 2 && b == 4) || (a == 4 && b == 2)))
        {
            System.out.println("Compatibilidad Buena.");
        }else
        {
            System.out.println("Compatibilidad a Trabajar.");
        }
        
        scanner.close();
        System.exit(0);
    }
    
}
