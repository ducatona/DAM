/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author apena
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "descargas")
@javax.persistence.NamedQueries({
    @javax.persistence.NamedQuery(name = "Descargas.findAll", query = "SELECT d FROM Descargas d"),
    @javax.persistence.NamedQuery(name = "Descargas.findByIdDescarga", query = "SELECT d FROM Descargas d WHERE d.idDescarga = :idDescarga"),
    @javax.persistence.NamedQuery(name = "Descargas.findByFecha", query = "SELECT d FROM Descargas d WHERE d.fecha = :fecha")})
public class Descargas implements Serializable {

    private static final long serialVersionUID = 1L;
    @javax.persistence.Id
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "id_descarga")
    private Integer idDescarga;
    @javax.persistence.Column(name = "fecha")
    @javax.persistence.Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha;
    @javax.persistence.JoinColumn(name = "id_biblioteca", referencedColumnName = "id_biblioteca")
    @javax.persistence.ManyToOne(optional = false)
    private Biblioteca idBiblioteca;
    @javax.persistence.JoinColumn(name = "id_juegos", referencedColumnName = "id_juego")
    @javax.persistence.ManyToOne(optional = false)
    private Juegos idJuegos;

    public Descargas() {
    }

    public Descargas(Integer idDescarga) {
        this.idDescarga = idDescarga;
    }

    public Integer getIdDescarga() {
        return idDescarga;
    }

    public void setIdDescarga(Integer idDescarga) {
        this.idDescarga = idDescarga;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Biblioteca getIdBiblioteca() {
        return idBiblioteca;
    }

    public void setIdBiblioteca(Biblioteca idBiblioteca) {
        this.idBiblioteca = idBiblioteca;
    }

    public Juegos getIdJuegos() {
        return idJuegos;
    }

    public void setIdJuegos(Juegos idJuegos) {
        this.idJuegos = idJuegos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDescarga != null ? idDescarga.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Descargas)) {
            return false;
        }
        Descargas other = (Descargas) object;
        if ((this.idDescarga == null && other.idDescarga != null) || (this.idDescarga != null && !this.idDescarga.equals(other.idDescarga))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "metodos.Descargas[ idDescarga=" + idDescarga + " ]";
    }
    
}
