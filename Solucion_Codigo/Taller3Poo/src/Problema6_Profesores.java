
public class Problema6_Profesores {

    public String nombre;
    public String apellido;
    public int sueldoBasico;
    public double sueldoTotal;
    public int cedula;

    public Problema6_Profesores() {
        nombre = "Gonzalo";
        apellido = "Chavez";
        sueldoBasico = 450;
        sueldoTotal = (sueldoBasico * 0.2) + sueldoBasico;
        cedula = 1105591323;
    }

    public String toString() {
        return "Nombre: " + nombre
                + "\nApellido: " + apellido
                + "\nSueldo: " + sueldoTotal
                + "\ncedula: " + cedula;
    }
}
