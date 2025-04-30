
import java.util.Random;


public class Problema8_Cheques {
    public String nombreCliente;
    public String nombreBanco;
    public int valorCheque;
    public double comisionBanco;
    
    public Problema8_Cheques(){
        Random random = new Random();
        String [] cliente= {"Alison","Jorge","Pedro","Ricardo"};
        String [] bancos= {"Banco Loja","Banco Pichincha","Banco Machala"};
        nombreCliente = cliente[random.nextInt(cliente.length)];
        nombreBanco = bancos[random.nextInt(bancos.length)];
        valorCheque = 450 + random.nextInt() * 1000;
        comisionBanco = valorCheque * 0.003;
        
    }
    public String toString (){
        return "Nombre Cliente: " + nombreCliente
                + "\nNombre Banco: " + nombreBanco
                + "\nValor del Cheque: " + valorCheque
                + "\nValor comision: " + comisionBanco;
    }
    
}
