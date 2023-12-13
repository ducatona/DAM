/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author apena
 */
@Entity
@Table(name = "pegui")
@NamedQueries({
    @NamedQuery(name = "Pegui.findAll", query = "SELECT p FROM Pegui p"),
    @NamedQuery(name = "Pegui.findByIdPegui", query = "SELECT p FROM Pegui p WHERE p.idPegui = :idPegui"),
    @NamedQuery(name = "Pegui.findByTipoPegui", query = "SELECT p FROM Pegui p WHERE p.tipoPegui = :tipoPegui")})
public class Pegui implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_pegui")
    private Integer idPegui;
    @Column(name = "tipo_pegui")
    private String tipoPegui;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPegui")
    private Collection<Juegos> juegosCollection;

    public Pegui() {
    }

    public Pegui(Integer idPegui) {
        this.idPegui = idPegui;
    }

    public Integer getIdPegui() {
        return idPegui;
    }

    public void setIdPegui(Integer idPegui) {
        this.idPegui = idPegui;
    }

    public String getTipoPegui() {
        return tipoPegui;
    }

    public void setTipoPegui(String tipoPegui) {
        this.tipoPegui = tipoPegui;
    }

    public Collection<Juegos> getJuegosCollection() {
        return juegosCollection;
    }

    public void setJuegosCollection(Collection<Juegos> juegosCollection) {
        this.juegosCollection = juegosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPegui != null ? idPegui.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pegui)) {
            return false;
        }
        Pegui other = (Pegui) object;
        if ((this.idPegui == null && other.idPegui != null) || (this.idPegui != null && !this.idPegui.equals(other.idPegui))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelos.Pegui[ idPegui=" + idPegui + " ]";
    }
    
}
