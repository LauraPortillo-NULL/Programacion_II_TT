
package _10_08_2026;

/**
El Vidente Aleatorio (Predicciones) Crear un programa que genere y muestre una
predicción diaria aleatoria al usuario, utilizando estructuras de decisión en lugar de listas de
almacenamiento.
 */
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Random;
public class Ejercicio7 {
    public static void main(String[] args) {
        
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        
        Random aleatorio = new Random();
        
        int indicado = aleatorio.nextInt(7) + 1;
        
        if(indicado == 1)
        {
            System.out.println("La paciencia es un algoritmo con complejidad alta, pero con resultados excelentes.");
        }else if(indicado == 2)
        {
            System.out.println("Un pingüino acaba de aprobar tu último algoritmo.");
        }else if(indicado == 3)
        {
            System.out.println("El compilador observó tus esfuerzos y decidió ser misericordioso.");
        }else if(indicado == 4)
        {
            System.out.println("El compilador observó tus esfuerzos y decidió ser misericordioso.");
        }else if(indicado == 5)
        {
            System.out.println("En algún lugar del universo, una tostadora acaba de ejecutar Java.");
        }else if(indicado == 6)
        {
            System.out.println("La probabilidad de encontrar un bug aumenta un 300% cuando dices: 'Ya terminé'.");
        }else
        {
            System.out.println("La computadora hace exactamente lo que le dices, no lo que quieres.");
        }
         System.exit(0);
    }
}
