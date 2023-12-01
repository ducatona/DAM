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
@javax.persistence.Table(name = "generos")
@javax.persistence.NamedQueries({
    @javax.persistence.NamedQuery(name = "Generos.findAll", query = "SELECT g FROM Generos g"),
    @javax.persistence.NamedQuery(name = "Generos.findByIdGenero", query = "SELECT g FROM Generos g WHERE g.idGenero = :idGenero"),
    @javax.persistence.NamedQuery(name = "Generos.findByNombreGenero", query = "SELECT g FROM Generos g WHERE g.nombreGenero = :nombreGenero"),
    @javax.persistence.NamedQuery(name = "Generos.findByDescripcionGenero", query = "SELECT g FROM Generos g WHERE g.descripcionGenero = :descripcionGenero")})
public class Generos implements Serializable {

    private static final long serialVersionUID = 1L;
    @javax.persistence.Id
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "id_genero")
    private Integer idGenero;
    @javax.persistence.Column(name = "nombre_genero")
    private String nombreGenero;
    @javax.persistence.Column(name = "descripcion_genero")
    private String descripcionGenero;
    @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL, mappedBy = "idGenero")
    private Collection<Juegos> juegosCollection;

    public Generos() {
    }

    public Generos(Integer idGenero) {
        this.idGenero = idGenero;
    }

    public Integer getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(Integer idGenero) {
        this.idGenero = idGenero;
    }

    public String getNombreGenero() {
        return nombreGenero;
    }

    public void setNombreGenero(String nombreGenero) {
        this.nombreGenero = nombreGenero;
    }

    public String getDescripcionGenero() {
        return descripcionGenero;
    }

    public void setDescripcionGenero(String descripcionGenero) {
        this.descripcionGenero = descripcionGenero;
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
        hash += (idGenero != null ? idGenero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Generos)) {
            return false;
        }
        Generos other = (Generos) object;
        if ((this.idGenero == null && other.idGenero != null) || (this.idGenero != null && !this.idGenero.equals(other.idGenero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "metodos.Generos[ idGenero=" + idGenero + " ]";
    }
    
}
