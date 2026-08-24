
/*
Calcular el área y perímetro de un rectángulo.
La fórmula para calcular el PERIMETRO = 2 * h + 2 * b.
La fórmula para calcular el AREA: A = b * h
*/

package _03_08_2026;

import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner xd = new Scanner(System.in);
        double base, altura;
        double perimetro, area;
        
        System.out.print("Base: ");
        base = xd.nextDouble();
        System.out.print("Altura: ");
        altura = xd.nextDouble();
        
        perimetro = 2 * altura + 2 * base;
        area = base * altura;
        
        for(int i = 1; i <= 10; i++){
            System.out.print("*");
        }
        System.out.println("");
        System.out.println("Valor del area: " + area + " m^2.");
        System.out.println("Valor del perimetro: " + perimetro + " m.");
        System.exit(0);
    }
}
