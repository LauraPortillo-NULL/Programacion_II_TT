/*
    Calcular el área de un tetraedro.
    Area = √3 * a2
    (a = arista)
 */
package _03_08_2026;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner xd = new Scanner(System.in);
        
        double area;
        double arista;
        
        System.out.print("Ingresa el valor de la arista en metros(m): ");
        arista = xd.nextDouble();
        
        area = Math.sqrt(3) * Math.pow(arista, 2);
        
        System.out.println("Area del tetraedro: " + area + "m^2.");
        
        System.exit(0);
    }
    
}
