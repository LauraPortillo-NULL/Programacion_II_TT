
package _10_08_2026;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Scanner scanner = new Scanner(System.in);
        
        double peso;
        double estatura;
        
        System.out.println("UMM NO SÉ QUÉ TITULO PONERLE A ESTO");
        for (int i = 1; i <= 35; i++)
        {
            System.out.print("*");
        }
        System.out.println();
    
        System.out.print("Ingresa tu peso (en kilogramos): ");
        peso = scanner.nextDouble();
        if(peso < 0)
        {
            System.out.println("No puedes pesar igual o menos que 0kg.");
            return;
        }
        
        System.out.print("Ingresa tu estatura (en metros): ");
        estatura = scanner.nextDouble();
        if(estatura < 0)
        {
            System.out.println("No puedes medir menos o igual que 0m, wtf.");
            return;
        }
        
        double imc = peso / Math.pow(estatura, 2);
        
        System.out.println("Sus resultados");
        for (int i = 1; i <= 35; i++)
        {
            System.out.print("*");
        }
        System.out.println();
        System.out.println("Su IMC es: " + imc + " kg.");
    }
    
}
