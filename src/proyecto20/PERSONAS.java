

package proyecto20;


public class PERSONAS {
  private int numeroId;
  private String nombre;
  private int numeroTel;
  private String correo;

    public PERSONAS() {
        this.numeroId = 0;
        this.nombre = "";
        this.numeroTel = 0;
        this.correo = "";
    }

    public int getNumeroId() {
        return numeroId;
    }

    public void setNumeroId(int numeroId) {
        this.numeroId = numeroId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroTel() {
        return numeroTel;
    }

    public void setNumeroTel(int numeroTel) {
        this.numeroTel = numeroTel;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
  
    
  
  
}
