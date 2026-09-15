
package _26_08_2026;


public class BancoMain {
    public static void main(String[] args) {
        System.out.println("--- SISTEMA BANCARIO ---");
        try
        {
            CuentaBancariaDivisas cuenta1 = new CuentaBancariaDivisas("Pablo Escobar, el patron del mal.", 150000.0);
            System.out.println("Titular: " + cuenta1.getTitular());
            System.out.println("Saldo en Guaranies: Gs. " + cuenta1.getSaldoGuaranies());
            System.out.printf("Equivalente en Dolares: USD %.2f\n", cuenta1.calcularEquivalenteDolares());
            
            CuentaBancariaDivisas cuenta2 = new CuentaBancariaDivisas("Juan Perez", -500000.0);
        }catch (IllegalArgumentException e)
        {
            System.out.println("Error de validacion: " + e.getMessage());
        }
    }
}
