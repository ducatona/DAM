/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

/**
 *
 * @author apena
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "biblioteca")
@javax.persistence.NamedQueries({
    @javax.persistence.NamedQuery(name = "Biblioteca.findAll", query = "SELECT b FROM Biblioteca b"),
    @javax.persistence.NamedQuery(name = "Biblioteca.findByIdBiblioteca", query = "SELECT b FROM Biblioteca b WHERE b.idBiblioteca = :idBiblioteca"),
    @javax.persistence.NamedQuery(name = "Biblioteca.findByFecha", query = "SELECT b FROM Biblioteca b WHERE b.fecha = :fecha"),
    @javax.persistence.NamedQuery(name = "Biblioteca.findByUrl", query = "SELECT b FROM Biblioteca b WHERE b.url = :url")})
public class Biblioteca implements Serializable {

    private static final long serialVersionUID = 1L;
    @javax.persistence.Id
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "id_biblioteca")
    private Integer idBiblioteca;
    @javax.persistence.Column(name = "fecha")
    @javax.persistence.Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha;
    @javax.persistence.Column(name = "url")
    private String url;
    @javax.persistence.JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
    @javax.persistence.ManyToOne(optional = false)
    private Usuarios idUsuario;
    @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL, mappedBy = "idBiblioteca")
    private Collection<Usuarios> usuariosCollection;
    @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL, mappedBy = "idBiblioteca")
    private Collection<Descargas> descargasCollection;

    public Biblioteca() {
    }

    public Biblioteca(Integer idBiblioteca) {
        this.idBiblioteca = idBiblioteca;
    }

    public Integer getIdBiblioteca() {
        return idBiblioteca;
    }

    public void setIdBiblioteca(Integer idBiblioteca) {
        this.idBiblioteca = idBiblioteca;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Usuarios getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuarios idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Collection<Usuarios> getUsuariosCollection() {
        return usuariosCollection;
    }

    public void setUsuariosCollection(Collection<Usuarios> usuariosCollection) {
        this.usuariosCollection = usuariosCollection;
    }

    public Collection<Descargas> getDescargasCollection() {
        return descargasCollection;
    }

    public void setDescargasCollection(Collection<Descargas> descargasCollection) {
        this.descargasCollection = descargasCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBiblioteca != null ? idBiblioteca.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Biblioteca)) {
            return false;
        }
        Biblioteca other = (Biblioteca) object;
        if ((this.idBiblioteca == null && other.idBiblioteca != null) || (this.idBiblioteca != null && !this.idBiblioteca.equals(other.idBiblioteca))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "metodos.Biblioteca[ idBiblioteca=" + idBiblioteca + " ]";
    }
    
}
