/*

Utilizar una estructura if-else if encadenada para clasificar el resultado en las
siguientes categorías: Menor a 18.5 (Bajo peso); De 18.5 a 24.9 (Peso normal); De 25.0 a 29.9
(Sobrepeso); De 30.0 en adelante (Obesidad).

Salida Esperada: La categoría clínica en formato de texto. (Ejemplo: IMC calculado de 27.5 ->
Salida: Diagnóstico médico: Sobrepeso).

*/

package _10_08_2026;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Scanner scanner = new Scanner(System.in);
        
        double imc;
        
        System.out.print("Ingresa tu IMC (en kilogramos): ");
        imc = scanner.nextDouble();
        if(imc < 0)
        {
            System.out.println("Su IMC estrictamente debería ser mayor a 0 kg.");
            return;
        }
        
        if(imc < 18.5)
        {
            System.out.println("Diagnóstico médico: Bajo Peso.");
        }else if(imc > 18.5 && imc <= 24.9)
        {
            System.out.println("Diagnóstico médico: Peso Normal.");
        }else if(imc >= 25.0 && imc <= 29.9)
        {
            System.out.println("Diagnóstico médico: Sobrepeso.");
        }else if(imc >= 30)
        {
            System.out.println("Diagnóstico médico: Obesidad.");
        }
        
        scanner.close();
        System.exit(0);
    }
    
}
