
package _10_08_2026;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Scanner scanner = new Scanner(System.in);
        
        int anio_nac1, anio_nac2;
        
        System.out.print("Ingresa tu año de nacimiento: ");
        anio_nac1 = scanner.nextInt();
        if(anio_nac1 < 1924 )
        {
            System.out.println("Entrada de datos incorrecta :(");
            return;
        }
        
        int resto1 = (anio_nac1 - 1924) % 12;
        
        System.out.print("Ingresa su año de nacimiento: ");
        anio_nac2 = scanner.nextInt();
        if(anio_nac2 < 1924)
        {
            System.out.println("Entrada de datos incorrecta :(");
            return;
        }
        
        int resto2 = (anio_nac2 - 1924) % 12;
        
        if(Math.abs(resto1 - resto2) == 6)
        {
            System.out.println("Atención: Son signos opuestos.");
        }else{
            System.out.println("Atención: No son signos opuestos.");
        }
        
        scanner.close();
        System.exit(0);
    }
    
}
