
public class Problema4_Celulares {

    public String sistemaOperativo;
    public int tamanioPantalla;
    public int costoInicial;
    public double iva;
    public double ivaCostoFinal;
    public double costoFinal;
    public String direccionMac;
    public String imei;

    public Problema4_Celulares() {
        sistemaOperativo = "Apple";
        tamanioPantalla = 15;
        costoInicial = 1000;
        iva = 0.15;
        ivaCostoFinal = iva * costoInicial;
        costoFinal = ivaCostoFinal + costoInicial;
        direccionMac = "q1d41b23fet4s2";
        imei = "1532436343465";
    }

    public String toString() {
        return "Sistema Operativo: " + sistemaOperativo
                + "\n Tamanio de pantalla: " + tamanioPantalla + " pulgadas"
                + "\n Costo: " + costoFinal 
                + "\n DireccionMAC: " + direccionMac
                + "\n Informacion IMEI: " + imei;
    }
}
