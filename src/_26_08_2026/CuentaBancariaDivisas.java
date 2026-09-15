
package _26_08_2026;

//  EJERCICIO : Conversión de divisas

public class CuentaBancariaDivisas {
    private String titular;
    private double saldoGuaranies;
    private static final double TASA_CAMBIO_DOLAR = 6000.0;
    
    //  Constructor por defecto
    public CuentaBancariaDivisas()
    {
        this.titular = "Sin Nombre :(";
        this.saldoGuaranies = 0.0;
    }
    
    public CuentaBancariaDivisas(String titular, double saldo)
    {
        this.titular = titular;
        setSaldoGuaranies(saldo);
    }
    
    public String getTitular()
    {
        return titular;
    }
    
    public void setTitular(String titular)
    {
        this.titular = titular;
    }
    
    public double getSaldoGuaranies()
    {
        return saldoGuaranies;
    }
    
    public void setSaldoGuaranies(double saldoGuaranies)
    {
        if (saldoGuaranies >= 0)
        {
            this.saldoGuaranies = saldoGuaranies;
        }else{
            throw new IllegalArgumentException("El saldo cannot ser negativo bro.");
        }
    }
    public double calcularEquivalenteDolares()
    {
        return this.saldoGuaranies / TASA_CAMBIO_DOLAR;
        
    }
    

}
