
import java.util.Random;

public class Problema5_Estudiante {

    public String nombre;
    public double m1Calificaion;
    public double m2Calificaion;
    public double m3Calificaion;
    public double promedio;
    public String estado;

    public Problema5_Estudiante() {
        Random random = new Random();
        nombre = "Alison";
        m1Calificaion = 1 + random.nextDouble() * 9;
        m3Calificaion = 1 + random.nextDouble() * 9;
        m2Calificaion = 1 + random.nextDouble() * 9;
        promedio = (m1Calificaion + m2Calificaion + m3Calificaion) / 3;
        if (promedio > 6.5) {
            estado = "Aprobado";
        } else {
            estado = "Reprobado";
        }

    }
public String toString() {
    return String.format(
        "Estudiante: %s\nNota 1: %.2f\nNota 2: %.2f\nNota 3: %.2f\nPromedio: %.2f\nEstado: %s",
        nombre, m1Calificaion, m2Calificaion, m3Calificaion, promedio, estado
    );
}


}
