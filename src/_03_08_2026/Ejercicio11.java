
package _03_08_2026;

/*

    Calcular el área de un trapecio.
    Area = (Base Mayor + Base Menor) * altura / 2
*/

import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner xd = new Scanner(System.in);
        double area;
        double baseMayor;
        double baseMenor;
        double altura;
        System.out.print("Ingresa el valor de la base mayor del trapecio: ");
        baseMayor = xd.nextDouble();
        System.out.print("Valor de la base menor: ");
        baseMenor = xd.nextDouble();
        System.out.print("Valor de la altura: ");
        altura = xd.nextDouble();
        
        area = (baseMayor + baseMenor) * altura / 2;
        
        System.out.println("El area del trapecio es: " + area + "m^2");
        
        System.out.println("MEGAMIERDON");
        System.exit(0);
    }
}
