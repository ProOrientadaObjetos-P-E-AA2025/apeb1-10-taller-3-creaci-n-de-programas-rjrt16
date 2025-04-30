
public class Problema2_Hora {

    private double horas;
    private double minutos;
    private double segundos;
    private double dias;

    public Problema2_Hora(double hora) {
        horas = hora;
        minutos = hora * 60;
        segundos = hora * 3600;
        dias = hora / 24;
    }

    public String toString() {
        return "horas: " + horas
                + "\nminutos: " + minutos
                + "\nsegunndos: " + segundos
                + "\ndias: " + dias;
    }
}