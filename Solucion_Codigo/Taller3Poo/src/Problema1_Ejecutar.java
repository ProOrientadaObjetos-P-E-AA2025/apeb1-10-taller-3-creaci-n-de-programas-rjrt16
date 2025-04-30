
public class Problema1_Ejecutar {
    public static void main(String[] args) {
        double largo = 12;
        double ancho = 10;
        double area = 0;
        double valorMC = 6;
        double costoTerreno = 0;
        
        Problema1_Terreno terreno = new Problema1_Terreno();
        
        terreno.setAncho(ancho);
        terreno.setLargo(largo);
        terreno.setArea(area);
        terreno.setValorMetroCubico(valorMC);
        terreno.setCosto_Terreno(costoTerreno);
        
        System.out.println("El area del terreno: " + terreno.getArea()+" con el valor de metro cuadradro en: "+terreno.getValorMetroCubico()+" costando un total de: "+terreno.getCosto_Terreno());
        
    }
}
