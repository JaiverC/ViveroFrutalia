package cl_modelos_pojos;
// Generated 7/04/2017 03:07:58 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * EmpleadosServiciosId generated by hbm2java
 */
@Embeddable
public class EmpleadosServiciosId  implements java.io.Serializable {


     private int empleadoCedula;
     private int peticionServiciosId;

    public EmpleadosServiciosId() {
    }

    public EmpleadosServiciosId(int empleadoCedula, int peticionServiciosId) {
       this.empleadoCedula = empleadoCedula;
       this.peticionServiciosId = peticionServiciosId;
    }
   


    @Column(name="empleado_cedula", nullable=false)
    public int getEmpleadoCedula() {
        return this.empleadoCedula;
    }
    
    public void setEmpleadoCedula(int empleadoCedula) {
        this.empleadoCedula = empleadoCedula;
    }


    @Column(name="peticionServicios_id", nullable=false)
    public int getPeticionServiciosId() {
        return this.peticionServiciosId;
    }
    
    public void setPeticionServiciosId(int peticionServiciosId) {
        this.peticionServiciosId = peticionServiciosId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof EmpleadosServiciosId) ) return false;
		 EmpleadosServiciosId castOther = ( EmpleadosServiciosId ) other; 
         
		 return (this.getEmpleadoCedula()==castOther.getEmpleadoCedula())
 && (this.getPeticionServiciosId()==castOther.getPeticionServiciosId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getEmpleadoCedula();
         result = 37 * result + this.getPeticionServiciosId();
         return result;
   }   


}


