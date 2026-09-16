
package _26_08_2026;


public class CuentaBancariaCajero {
    private String titular;
    private int pinSeguridad;
    private double saldo;
    private boolean bloqueada;

    public CuentaBancariaCajero(String titular, int pinSeguridad, double saldo) {
        this.titular = titular;
        this.pinSeguridad = pinSeguridad;
        this.saldo = saldo > 0 ? saldo : 0;
        this.bloqueada = false;
    }

    public String getTitular() {
        return titular;
    }
    
    public boolean isBloqueada() {
        return bloqueada;
    }
    
    public void bloquearCuenta() {
        this.bloqueada = true;
    }
    
    public boolean validarPin(int ingreso) {
        return !bloqueada && this.pinSeguridad == ingreso;
    }
    
    public double consultarSaldo() {
        return this.saldo;
    }
    
    public boolean retirar(double monto) {
        if(!bloqueada && monto > 0 && monto <= saldo) {
            this.saldo -= monto;
            return true;
        }
        return false;
    }
}
