package cl_modelos_pojos;
// Generated 12/03/2017 03:42:57 PM by Hibernate Tools 4.3.1



/**
 * Plantas generated by hbm2java
 */
public class Plantas  implements java.io.Serializable {


     private Integer id;
     private Tipoplanta tipoplanta;
     private String nombre;
     private String descripcion;
     private String imagen;

    public Plantas() {
    }

    public Plantas(Tipoplanta tipoplanta, String nombre, String descripcion, String imagen) {
       this.tipoplanta = tipoplanta;
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.imagen = imagen;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Tipoplanta getTipoplanta() {
        return this.tipoplanta;
    }
    
    public void setTipoplanta(Tipoplanta tipoplanta) {
        this.tipoplanta = tipoplanta;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getImagen() {
        return this.imagen;
    }
    
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }




}

