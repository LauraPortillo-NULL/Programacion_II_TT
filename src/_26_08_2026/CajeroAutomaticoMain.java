
package _26_08_2026;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
public class CajeroAutomaticoMain {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Scanner scanner = new Scanner(System.in);
        
        CuentaBancariaCajero miCuenta = new CuentaBancariaCajero("Carlos Benítez", 2026, 5000000.0);
        
        int intentos = 0;
        boolean accesoConcedido = false;
        System.out.println("Bienvenido, " + miCuenta.getTitular());
        
        while(intentos < 3 && !miCuenta.isBloqueada()) {
            System.out.print("Ingrese su PIN: ");
            int pin = scanner.nextInt();
            
            if(miCuenta.validarPin(pin)) {
                accesoConcedido = true;
                break;
            }else {
                intentos++;
                System.out.println("PIN incorrecto.Intentos restantes: " + (3 - intentos));
                if(intentos == 3) {
                    miCuenta.bloquearCuenta();
                    System.out.println("Su cuenta ha sido BLOQUEADA por seguridad unu.");
                }
            }
        }
        
        if(accesoConcedido) {
            System.out.println("Acceso concedido. Saldo actual G. " + miCuenta.consultarSaldo());
            System.out.print("Ingrese el monto a retirar: ");
            double retiro = scanner.nextDouble();
            
            for(int i = 0; i < 3; i++) {
                try {
                    Thread.sleep(1600);
                    System.out.print(".");
                }catch(InterruptedException e) {
                    System.out.println("Error durante la espera.");
                }
            }
            System.out.println();
            
            if(miCuenta.retirar(retiro)) {
                System.out.println("Transacción exitosa. Nuevo saldo: G. " + miCuenta.consultarSaldo());
            }else {
                System.out.println("Error: Fondos insuficientes o monto inválido.");
            }
        }
        
        scanner.close();
    }
}
