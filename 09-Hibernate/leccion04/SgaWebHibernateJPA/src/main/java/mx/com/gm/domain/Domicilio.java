package mx.com.gm.domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;

@Entity
public class Domicilio implements Serializable{

    public static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_domicilio")
    private Integer idDomiciliio;
    
    private String calle;
    
    @Column(name = "no_calle")
    private String noCalle;
    
    private String pais;

    public Domicilio() {
    }

    public Domicilio(Integer idDomiciliio) {
        this.idDomiciliio = idDomiciliio;
    }

    public Integer getIdDomiciliio() {
        return idDomiciliio;
    }

    public void setIdDomiciliio(Integer idDomiciliio) {
        this.idDomiciliio = idDomiciliio;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNoCalle() {
        return noCalle;
    }

    public void setNoCalle(String noCalle) {
        this.noCalle = noCalle;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Domicilio{" + "idDomiciliio=" + idDomiciliio + ", calle=" + calle + ", noCalle=" + noCalle + ", pais=" + pais + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.idDomiciliio);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Domicilio other = (Domicilio) obj;
        return Objects.equals(this.idDomiciliio, other.idDomiciliio);
    }
    
    
    
}
