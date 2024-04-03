package vivienda;

import java.util.Date;

/**
 *
 * @author carmen
 */
public class Vivienda {

//atributos
    double precio;
    Date antiguedad = null;
    String direccion;
    int superficie;

//getter and setter
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Date getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(Date antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

//constructor
    public Vivienda(double precio, Date antiguedad, String direccion, int superficie) {
        this.precio = precio;
        this.antiguedad = antiguedad;
        this.direccion = direccion;
        this.superficie = superficie;
    }

//constructor sin antiguedad
    public Vivienda(double precio, String direccion, int superficie) {
        this.precio = precio;
        this.direccion = direccion;
        this.superficie = superficie;
    }

//constructor de copia    
    public Vivienda(Vivienda v) {
        this.precio = v.getPrecio();
        this.antiguedad = v.getAntiguedad();
        this.direccion = v.getDireccion();
        this.superficie = v.getSuperficie();
    }

//método mostrar vivienda
    @Override
    public String toString() {
        return "Vivienda{\n"
                + "precio=" + precio
                + "\nantiguedad=" + antiguedad
                + "\ndireccion=" + direccion
                + "\nsuperficie=" + superficie + '}';
    }

    public void mostrarVivienda() {
        System.out.println("El precio es de : " + this.precio);
        System.out.println("La vivienda tiene una antiguedad de>: " + this.antiguedad);
        System.out.println("La vivienda esta ubicada en la calle: " + this.direccion);
        System.out.println("La vivienda tiene una superficie de: " + this.superficie);

    }

}
