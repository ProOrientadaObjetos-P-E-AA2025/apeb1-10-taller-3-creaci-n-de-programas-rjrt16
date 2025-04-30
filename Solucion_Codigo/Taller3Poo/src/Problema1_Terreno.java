
public class Problema1_Terreno {

    public double costoTerreno;
    public double ancho;
    public double largo;
    public double area;
    public double valorMetroCubico;

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAncho() {
        return ancho;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getLargo() {
        return largo;
    }

    public void setArea(double area) {
        this.area = (largo * ancho);
    }

    public double getArea() {
        return area;
    }

    public void setValorMetroCubico(double valorMetroCubico) {
        this.valorMetroCubico = valorMetroCubico;
    }

    public double getValorMetroCubico() {
        return valorMetroCubico;
    }

    public void setCosto_Terreno(double costoTerreno) {
        this.costoTerreno = area*valorMetroCubico;
    }

    public double getCosto_Terreno() {
        return costoTerreno;
    }
}
