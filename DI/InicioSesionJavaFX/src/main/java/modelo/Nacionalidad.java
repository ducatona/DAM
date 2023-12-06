/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.util.Collection;

/**
 *
 * @author apena
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "nacionalidad")
@javax.persistence.NamedQueries({
    @javax.persistence.NamedQuery(name = "Nacionalidad.findAll", query = "SELECT n FROM Nacionalidad n"),
    @javax.persistence.NamedQuery(name = "Nacionalidad.findAllNacionalidad", query = "SELECT nacionalidad FROM Nacionalidad n"),
    @javax.persistence.NamedQuery(name = "Nacionalidad.findByIdNacionalidad", query = "SELECT n FROM Nacionalidad n WHERE n.idNacionalidad = :idNacionalidad"),
    @javax.persistence.NamedQuery(name = "Nacionalidad.findByNacionalidad", query = "SELECT n FROM Nacionalidad n WHERE n.nacionalidad = :nacionalidad")})

public class Nacionalidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @javax.persistence.Id
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "id_nacionalidad")
    private Integer idNacionalidad;
    @javax.persistence.Column(name = "nacionalidad")
    private String nacionalidad;
    @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL, mappedBy = "idNacionalidad")
    private Collection<Usuarios> usuariosCollection;

    public Nacionalidad() {
    }

    public Nacionalidad(Integer idNacionalidad) {
        this.idNacionalidad = idNacionalidad;
    }

    public Integer getIdNacionalidad() {
        return idNacionalidad;
    }

    public void setIdNacionalidad(Integer idNacionalidad) {
        this.idNacionalidad = idNacionalidad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Collection<Usuarios> getUsuariosCollection() {
        return usuariosCollection;
    }

    public void setUsuariosCollection(Collection<Usuarios> usuariosCollection) {
        this.usuariosCollection = usuariosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNacionalidad != null ? idNacionalidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nacionalidad)) {
            return false;
        }
        Nacionalidad other = (Nacionalidad) object;
        if ((this.idNacionalidad == null && other.idNacionalidad != null) || (this.idNacionalidad != null && !this.idNacionalidad.equals(other.idNacionalidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "metodos.Nacionalidad[ idNacionalidad=" + idNacionalidad + " ]";
    }

}
