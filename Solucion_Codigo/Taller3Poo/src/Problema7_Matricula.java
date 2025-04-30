
public class Problema7_Matricula {

    public String cedula;
    public String marca;
    public int anioFabricacion;
    public int valorVehiculo;
    public double valorMatricula;

    public Problema7_Matricula() {
        cedula = "1105334364";
        marca = "Mclaren";
        anioFabricacion = 2008;
        valorVehiculo = 100000;
        valorMatricula = (valorVehiculo * 0.002);
    }

    public String toString() {
        return "Cedula: " + cedula
                + "\nMarca: " + marca
                + "\nAnio de Fabricacion: " + anioFabricacion
                + "\nValor del Vehiculo: " + valorVehiculo
                + "\nValor Matricula: " + valorMatricula;
    }
}
