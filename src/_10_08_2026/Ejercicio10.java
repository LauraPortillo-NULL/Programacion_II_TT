
package _10_08_2026;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Scanner scanner = new Scanner(System.in);
        
        int anoDeNacimiento;
        
        do
        {
            System.out.print("Ingresa tu año de nacimiento: ");
            anoDeNacimiento = scanner.nextInt();
        }while(anoDeNacimiento <= 0);
        
        int ultimoDigito = anoDeNacimiento = anoDeNacimiento % 10;
        
        switch(ultimoDigito)
        {
            case 0:
            case 1:
                System.out.println("Tu elemento es METAL");
            break;
            case 2:
            case 3:
                System.out.println("Tu elemento es AGUA");
            break;
            case 4:
            case 5:
                System.out.println("Tu elemento es MADERA");
            break;
            case 6:
            case 7:
                System.out.println("Tu elemento es FUEGO");
            break;
            case 8:
            case 9:
                System.out.println("Tu elemento es TIERRA");
        }
    scanner.close();
    System.exit(0);
    }
    
}
