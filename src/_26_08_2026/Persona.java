
package _26_08_2026;


public class Persona {
    private String nombre;
    private int edad;
    
    private static final int ARANIAS_POR_ANIO = 4;
    private static final int MOSQUITOS_POR_ANIO = 8;
    private static final int ZANCUDOS_POR_ANIO = 6;
    private static final double GRAMOS_ARANIA = 0.1;
    private static final double GRAMOS_MOSQUITO = 0.05;
    private static final double GRAMOS_ZANCUDO = 0.095;

    public Persona() {
        this.nombre = "Anónimo.";
        this.edad = 0;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
       setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0 && edad <= 120) {
            this.edad = edad;
        } else {
            throw new IllegalArgumentException("La edad debe estar entre 0 y 120 años.");
        }
    }
    
    public double calcularKgAranias() {
        double gramosTotales = (ARANIAS_POR_ANIO * GRAMOS_ARANIA) * this.edad;
        return gramosTotales / 1000.0;
    }
    
    public double calcularKgMosquitos() {
        double gramosTotales = (MOSQUITOS_POR_ANIO * GRAMOS_MOSQUITO) * this.edad;
        return gramosTotales / 1000.0;
    }
    
    public double calcularKgZancudos() {
        double gramosTotales = (ZANCUDOS_POR_ANIO * GRAMOS_ZANCUDO) * this.edad;
        return gramosTotales / 1000.0;
    }
    
    public double calcularKgTotales() {
        return calcularKgAranias() + calcularKgMosquitos() + calcularKgZancudos();
    }
    
}
