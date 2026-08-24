
package _10_08_2026;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Scanner scanner = new Scanner(System.in);
        
        double estatura;
        double peso;
        
        while(true)
        {
            System.out.println();
            System.out.print("Ingresar Peso (kilogramos): ");
            peso = scanner.nextDouble();
            if((peso != 0) && (peso < 20 || peso > 300))
            {
                System.out.println("Datos fuera del rango.");
                continue;
            }
            
            System.out.print("Ingresar Estatura (metros): ");
            estatura = scanner.nextDouble();
            if((estatura != 0) && (estatura < 0.5 || estatura > 2.5))
            {
                System.out.println("Datos fuera del rango.");
                continue;
            }
            
            if(peso == 0 || estatura == 0)
            {
                System.out.println("Programa finalizado correctamente.");
                break;
            }
            double imc = peso / Math.pow(estatura, 2);
            
            System.out.println("Su IMC es: " + imc );
            
            if(imc < 18.5)
            {
                System.out.println("Diagnóstico Clínico: BAJO PESO.");
            }else if(imc > 18.5 && imc <= 24.9)
            {
                System.out.println("Diagnóstico Clínico: PESO NORMAL.");
            }else if(imc >= 25.0 && imc <= 29.9)
            {
                System.out.println("Diagnóstico Clínico: SOBREPESO.");
            }else if(imc > 30.0)
            {
                System.out.println("Diagnóstico Clínico: OBESIDAD.");
            }
        }
        
        
        System.exit(0);
    }
}
