
package _26_08_2026;


public class Paciente {
    private String nombre;
    private double pesoKg;
    private double estaturaM;

    public Paciente() {
        this.nombre = "Sin registro";
        this.pesoKg = 0.0;
        this.estaturaM = 0.0;
    }

    public Paciente(String nombre, double pesoKg, double estaturaM) {
        this.nombre = nombre;
        setPesoKg(pesoKg);
        setEstaturaM(estaturaM);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        if (pesoKg > 0 && pesoKg <= 500) {
            this.pesoKg = pesoKg;
        }else {
            throw new IllegalArgumentException("El peso debe ser mayor a 0 y menor a 500 kg.");
        }
    }

    public double getEstaturaM() {
        return estaturaM;
    }

    public void setEstaturaM(double estaturaM) {
        if (estaturaM > 0.4 && estaturaM <= 2.5) {
            this.estaturaM = estaturaM;
        }else {
            throw new IllegalArgumentException("Estatura inválida. Debe estar entre 0.4m y 2.5m.");
        }
    }
    
    public double calcularIMC() {
        return this.pesoKg / (this.estaturaM * this.estaturaM);
    }
    
    public String obtenerDiagnosticoOMS() {
        double imc = calcularIMC();
        
        if(imc < 18.5) return "Bajo Peso.";
        else if(imc < 25.0) return "Peso Normal.";
        else if(imc < 30.0) return "Sobrepeso.";
        else return "Obesidad.";
    }
    
}
