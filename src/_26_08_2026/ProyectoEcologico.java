
package _26_08_2026;


public class ProyectoEcologico {
    private String nombreInstitucion;
    private int resmasConsumidas;
    private static final double GRAMOS_POR_HOJA = 2560.0;
    private static final int HOJAS_POR_RESMA = 500;
    private static final double KG_POR_ARBOL = 750.0;

    public ProyectoEcologico() {
        this.nombreInstitucion = "Sin nombre";
        this.resmasConsumidas = 0;
    }

    public ProyectoEcologico(String nombre, int resmas) {
        this.nombreInstitucion = nombre;
        setResmasConsumidas(resmas);
    }

    public String getNombreInstitucion() {
        return nombreInstitucion;
    }

    public void setNombreInstitucion(String nombreInstitucion) {
        this.nombreInstitucion = nombreInstitucion;
    }

    public int getResmasConsumidas() {
        return resmasConsumidas;
    }

    public void setResmasConsumidas(int resmasConsumidas) {
        if(resmasConsumidas >= 0) {
            this.resmasConsumidas = resmasConsumidas;
        }else {
            System.out.println("Error: Las resmas no pueden ser negativas. Se ajustó a 0.");
            this.resmasConsumidas = 0;
        }
    }
    
    public double calcularMaderaConsumidaKg() {
        double hojasTotales = this.resmasConsumidas * HOJAS_POR_RESMA;
        double gramosTotales = hojasTotales * GRAMOS_POR_HOJA;
        return gramosTotales / 1000.0;
    }
    
    public double calcularArbolesTalados() {
        double kilosMadera = calcularMaderaConsumidaKg();
        return kilosMadera / KG_POR_ARBOL;
    }
    
}
