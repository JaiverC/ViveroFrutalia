package cl_modelos_pojos;
// Generated 6/04/2017 10:15:51 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ComprasPlanta generated by hbm2java
 */
@Entity
@Table(name="compras_planta"
    ,schema="public"
)
public class ComprasPlanta  implements java.io.Serializable {


     private int id;
     private Proveedores proveedores;
     private int nroFactura;
     private Date fecha;
     private Set<PlantasCompra> plantasCompras = new HashSet<PlantasCompra>(0);

    public ComprasPlanta() {
    }

	
    public ComprasPlanta(int id, Proveedores proveedores, int nroFactura, Date fecha) {
        this.id = id;
        this.proveedores = proveedores;
        this.nroFactura = nroFactura;
        this.fecha = fecha;
    }
    public ComprasPlanta(int id, Proveedores proveedores, int nroFactura, Date fecha, Set<PlantasCompra> plantasCompras) {
       this.id = id;
       this.proveedores = proveedores;
       this.nroFactura = nroFactura;
       this.fecha = fecha;
       this.plantasCompras = plantasCompras;
    }
   
     @Id 

    
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="proveedores_cedula", nullable=false)
    public Proveedores getProveedores() {
        return this.proveedores;
    }
    
    public void setProveedores(Proveedores proveedores) {
        this.proveedores = proveedores;
    }

    
    @Column(name="nro_factura", nullable=false)
    public int getNroFactura() {
        return this.nroFactura;
    }
    
    public void setNroFactura(int nroFactura) {
        this.nroFactura = nroFactura;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="fecha", nullable=false, length=13)
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="comprasPlanta")
    public Set<PlantasCompra> getPlantasCompras() {
        return this.plantasCompras;
    }
    
    public void setPlantasCompras(Set<PlantasCompra> plantasCompras) {
        this.plantasCompras = plantasCompras;
    }




}


