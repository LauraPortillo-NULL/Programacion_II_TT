/*
    Pedir altura y diametro de un cilindro en metros y calcular su volumen
mediante la fórmula V = pi * radio ^ 2 * altura
    Creamos la entidad Cilindro que conocerá sus propias demensiones y 
será responsable de calcular su propio volumen
*/
package _26_08_2026;

public class Cilindro {
    private double alturaMetros;
    private double diametroMetros;
    
    public Cilindro(){
        this.alturaMetros = 1.0;
        this.diametroMetros = 1.0;
    }
    
    public Cilindro(double altura, double diametro){
        setAlturaMetros(altura);
        setDiametroMetros(diametro);
    }

    public double getAlturaMetros() {
        return alturaMetros;
    }

    public void setAlturaMetros(double alturaMetros) {
        if (alturaMetros > 0)
        {
            this.alturaMetros = alturaMetros;
        }else{
            throw new IllegalArgumentException("La altura debe ser mayor a 0.");
        }
    }

    public double getDiametroMetros() {
        return diametroMetros;
    }

    public void setDiametroMetros(double diametroMetros) {
        if (diametroMetros > 0)
        {
            this.diametroMetros = diametroMetros;
        }else{
            throw new IllegalArgumentException("El diámetro debe ser mayor a 0.");
        }
    }
    
    public double calcularRadio() {
        return this.diametroMetros / 2.0;
    }
    
    public double calcularVolumen() { 
        double radio = calcularRadio();
        return Math.PI * Math.pow(radio, 2) * this.alturaMetros;
    }
    
    
}
