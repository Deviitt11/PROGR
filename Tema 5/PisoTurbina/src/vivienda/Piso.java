package vivienda;

import java.util.Date;

/**
 *
 * @author carmen
 */
public class Piso extends Vivienda {
    
    //Atributos
    int numeroPlanta;
    char puerta;
    boolean ascensor = false;

    //Constructores
    public Piso(int numeroPlanta, char puerta, boolean ascensor, double precio, Date antiguedad, String direccion, int superficie) {
        super(precio, antiguedad, direccion, superficie);
        this.numeroPlanta = numeroPlanta;
        this.puerta = puerta;
        this.ascensor = ascensor;
    }

    public Piso(int numeroPlanta, char puerta, double precio, String direccion, int superficie) {
        super(precio, direccion, superficie);
        this.numeroPlanta = numeroPlanta;
        this.puerta = puerta;
    }

    //getter and setter
    public int getNumeroPlanta() {
        return numeroPlanta;
    }

    public void setNumeroPlanta(int numeroPlanta) {
        this.numeroPlanta = numeroPlanta;
    }

    public char getPuerta() {
        return puerta;
    }

    public void setPuerta(char puerta) {
        this.puerta = puerta;
    }

    public boolean isAscensor() {
        return ascensor;
    }

    public void setAscensor(boolean ascensor) {
        this.ascensor = ascensor;
    }

    //metodo toString
    @Override
    public String toString() {
        return super.toString()
                + ". \nPiso:"
                + "\nnumeroPlanta=" + numeroPlanta
                + "\npuerta=" + puerta
                + "\nascensor=" + ascensor;
    }

}
