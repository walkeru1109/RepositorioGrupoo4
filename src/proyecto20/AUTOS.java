
package proyecto20;

public class AUTOS {
   private int numeroChasis;
   private String marca;
   private String estilo;
   private String modelo;
   private String Color;
   private double precio;

    public AUTOS() {
        this.numeroChasis = 0;
        this.marca = "";
        this.estilo = "";
        this.modelo = "";
        this.Color = "";
        this.precio = 0;
       
    }

    public int getNumeroChasis() {
        return numeroChasis;
    }

    public void setNumeroChasis(int numeroChasis) {
        this.numeroChasis = numeroChasis;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
   
   
   
}
