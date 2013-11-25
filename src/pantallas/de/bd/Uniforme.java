package pantallas.de.bd;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "uniforme", catalog = "proyectofinal", schema = "")
@NamedQueries({
    @NamedQuery(name = "Uniforme.findAll", query = "SELECT u FROM Uniforme u"),
    @NamedQuery(name = "Uniforme.findByNombreescuela", query = "SELECT u FROM Uniforme u WHERE u.uniformePK.nombreescuela = :nombreescuela"),
    @NamedQuery(name = "Uniforme.findByTipodeuniforme", query = "SELECT u FROM Uniforme u WHERE u.uniformePK.tipodeuniforme = :tipodeuniforme")})
public class Uniforme implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UniformePK uniformePK;

    public Uniforme() {
    }

    public Uniforme(UniformePK uniformePK) {
        this.uniformePK = uniformePK;
    }

    public Uniforme(String nombreescuela, String tipodeuniforme) {
        this.uniformePK = new UniformePK(nombreescuela, tipodeuniforme);
    }

    public UniformePK getUniformePK() {
        return uniformePK;
    }

    public void setUniformePK(UniformePK uniformePK) {
        this.uniformePK = uniformePK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (uniformePK != null ? uniformePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Uniforme)) {
            return false;
        }
        Uniforme other = (Uniforme) object;
        if ((this.uniformePK == null && other.uniformePK != null) || (this.uniformePK != null && !this.uniformePK.equals(other.uniformePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pantallas.de.bd.Uniforme[ uniformePK=" + uniformePK + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
