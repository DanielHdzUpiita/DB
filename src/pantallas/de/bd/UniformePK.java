package pantallas.de.bd;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class UniformePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "Nombre_escuela")
    private String nombreescuela;
    @Basic(optional = false)
    @Column(name = "Tipo_de_uniforme")
    private String tipodeuniforme;

    public UniformePK() {
    }

    public UniformePK(String nombreescuela, String tipodeuniforme) {
        this.nombreescuela = nombreescuela;
        this.tipodeuniforme = tipodeuniforme;
    }

    public String getNombreescuela() {
        return nombreescuela;
    }

    public void setNombreescuela(String nombreescuela) {
        this.nombreescuela = nombreescuela;
    }

    public String getTipodeuniforme() {
        return tipodeuniforme;
    }

    public void setTipodeuniforme(String tipodeuniforme) {
        this.tipodeuniforme = tipodeuniforme;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nombreescuela != null ? nombreescuela.hashCode() : 0);
        hash += (tipodeuniforme != null ? tipodeuniforme.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UniformePK)) {
            return false;
        }
        UniformePK other = (UniformePK) object;
        if ((this.nombreescuela == null && other.nombreescuela != null) || (this.nombreescuela != null && !this.nombreescuela.equals(other.nombreescuela))) {
            return false;
        }
        if ((this.tipodeuniforme == null && other.tipodeuniforme != null) || (this.tipodeuniforme != null && !this.tipodeuniforme.equals(other.tipodeuniforme))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pantallas.de.bd.UniformePK[ nombreescuela=" + nombreescuela + ", tipodeuniforme=" + tipodeuniforme + " ]";
    }
    
}
