
package _10_08_2026;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Scanner scanner = new Scanner(System.in);
        
        int anoDeNacimiento;
        final int anoLimitejsjsj = 1924;
        
        do
        {
            System.out.print("Ingresa pues tu año de nacimiento: ");
            anoDeNacimiento = scanner.nextInt();    
            
  
        }while(anoDeNacimiento <= 0 || anoDeNacimiento < anoLimitejsjsj);
        
        int resultado = anoDeNacimiento - anoLimitejsjsj;
        int residuo = resultado % 12;
        
        switch(residuo)
        {
            case 0:
                System.out.println("Eres del año del miki maus");
            break;
            case 1:
                System.out.println("Eres del año del Buey");
            break;
            case 2:
                System.out.println("Eres del año del Tigre");
            break;
            case 3:
                System.out.println("Eres del año del Conejo");
            break;
            case 4:
                System.out.println("Eres del año del Dragón");
            break;
            case 5:
                System.out.println("Eres del año de la Serpiente");
            break;
            case 6:
                System.out.println("Eres del año del Caballo");
            break;
            case 7:
                System.out.println("Eres del año de la Cabra xd");
            break;
            case 8:
                System.out.println("Eres del año del Mono");
            break;
            case 9:
                System.out.println("Eres del año del Gallo");
            break;
            case 10:
                System.out.println("Eres del año del Perro");
            break;
            case 11:
                System.out.println("Eres del año del Cerdo");
            break;
        }
        scanner.close();
        System.exit(0);
    }
}
