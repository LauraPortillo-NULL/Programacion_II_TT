/*
Calcular el área de una corona circular.
Area = PI * (Radio Mayor2 - Radio Menor2)
 */
package _03_08_2026;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner xd = new Scanner(System.in);
        
        double area;
        double radioMayor;
        double radioMenor;
        
        System.out.println("Recolección de datos - Corona Circular");
        System.out.print("Radio Mayor: ");
        radioMayor = xd.nextDouble();
        
        System.out.print("Radio Menor: ");
        radioMenor = xd.nextDouble();
        
        area = Math.PI * (Math.pow(radioMayor, 2) - Math.pow(radioMenor, 2));
        
        System.out.println("Area de la corona circular: " + area + " m^2.");
        
        System.out.println("Megamierdon");
        System.exit(0);
    }
}
