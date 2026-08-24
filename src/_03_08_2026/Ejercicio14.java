/*
Calcular el área de un ortoedro.
Area = 2 * (a*b + a*c + b*c)
 */
package _03_08_2026;

import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner xd = new Scanner(System.in);
        
        double cara1;
        double cara2;
        double cara3;
        double area;
        
        System.out.println("Ingresa los valores correspondientes en metros (m).");
        System.out.print("Primera cara: ");
        cara1 = xd.nextDouble();
        System.out.print("Segunda cara: ");
        cara2 = xd.nextDouble();
        System.out.print("Tercera cara: ");
        cara3 = xd.nextDouble();
        
        area = 2 * (cara1 * cara2 + cara1 * cara3 + cara2 * cara3);
        
        System.out.println("Area del ortoedro: " + area + " m^2.");
        
        System.exit(0);
    }
}
