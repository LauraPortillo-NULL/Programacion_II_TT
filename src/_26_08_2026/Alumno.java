
package _26_08_2026;


public class Alumno {
    
    //  ATRIBUTOS (CARACTERISTICAS)
    String nombre;
    int matricula;
    double promedio;
    
    //  MÉTODOS (COMPORTAMIENTOS)
    //  Método que no devuelve nada, solo imprime datos
    public void mostrarDatos() 
    {
        for (int i = 0; i <= 25; i++)
        {
            System.out.print("=");
        }
        System.out.println();
        System.out.println("--- DATOS DEL ALUMNO ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Matricula: " + matricula);
        System.out.println("Promedio: " + promedio);
    }
    
    //  MÉTODO QUE UTILIZA LÓGICA CONDICIONAL PARA DELIMITAR IF
    //  APRUEBA OR NOT :(
    public void verificarEstadoAcademico()
    {
        if (promedio >= 60.0)
        {
            System.out.println(nombre + " ha APROBADO la materia *3*.");
        }else
        {
            System.out.println(nombre + " ha REPROBADO la materia *^*.");
        }
    }
}
