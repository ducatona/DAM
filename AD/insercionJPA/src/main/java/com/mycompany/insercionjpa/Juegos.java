/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.insercionjpa;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author apena
 */
@Entity
@Table(name = "juegos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Juegos.findAll", query = "SELECT j FROM Juegos j"),
    @NamedQuery(name = "Juegos.findByIdJuego", query = "SELECT j FROM Juegos j WHERE j.idJuego = :idJuego"),
    @NamedQuery(name = "Juegos.findByNombreJuego", query = "SELECT j FROM Juegos j WHERE j.nombreJuego = :nombreJuego"),
    @NamedQuery(name = "Juegos.findByDescripcion", query = "SELECT j FROM Juegos j WHERE j.descripcion = :descripcion"),
    @NamedQuery(name = "Juegos.findByUrl", query = "SELECT j FROM Juegos j WHERE j.url = :url"),
    @NamedQuery(name = "Juegos.findByUrlCaratula", query = "SELECT j FROM Juegos j WHERE j.urlCaratula = :urlCaratula"),
    @NamedQuery(name = "Juegos.findByNivelDificultad", query = "SELECT j FROM Juegos j WHERE j.nivelDificultad = :nivelDificultad"),
    @NamedQuery(name = "Juegos.findByFechaCreacion", query = "SELECT j FROM Juegos j WHERE j.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "Juegos.findByPrecio", query = "SELECT j FROM Juegos j WHERE j.precio = :precio"),
    @NamedQuery(name = "Juegos.findByDescargasAcumuladas", query = "SELECT j FROM Juegos j WHERE j.descargasAcumuladas = :descargasAcumuladas")})
public class Juegos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_juego")
    private Integer idJuego;
    @Basic(optional = false)
    @Column(name = "nombre_juego")
    private String nombreJuego;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "url")
    private String url;
    @Column(name = "url_caratula")
    private String urlCaratula;
    @Column(name = "nivel_dificultad")
    private String nivelDificultad;
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precio")
    private BigDecimal precio;
    @Column(name = "descargas_acumuladas")
    private Integer descargasAcumuladas;
    @JoinColumn(name = "id_desarrollador", referencedColumnName = "id_usuario")
    @ManyToOne
    private Usuarios idDesarrollador;
    @JoinColumn(name = "id_genero", referencedColumnName = "id_genero")
    @ManyToOne(optional = false)
    private Generos idGenero;
    @JoinColumn(name = "id_pegui", referencedColumnName = "id_pegui")
    @ManyToOne(optional = false)
    private Pegui idPegui;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "juegos")
    private Collection<Biblioteca> bibliotecaCollection;

    public Juegos() {
    }

    public Juegos(Integer idJuego) {
        this.idJuego = idJuego;
    }

    public Juegos(Integer idJuego, String nombreJuego) {
        this.idJuego = idJuego;
        this.nombreJuego = nombreJuego;
    }

    public Integer getIdJuego() {
        return idJuego;
    }

    public void setIdJuego(Integer idJuego) {
        this.idJuego = idJuego;
    }

    public String getNombreJuego() {
        return nombreJuego;
    }

    public void setNombreJuego(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrlCaratula() {
        return urlCaratula;
    }

    public void setUrlCaratula(String urlCaratula) {
        this.urlCaratula = urlCaratula;
    }

    public String getNivelDificultad() {
        return nivelDificultad;
    }

    public void setNivelDificultad(String nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Integer getDescargasAcumuladas() {
        return descargasAcumuladas;
    }

    public void setDescargasAcumuladas(Integer descargasAcumuladas) {
        this.descargasAcumuladas = descargasAcumuladas;
    }

    public Usuarios getIdDesarrollador() {
        return idDesarrollador;
    }

    public void setIdDesarrollador(Usuarios idDesarrollador) {
        this.idDesarrollador = idDesarrollador;
    }

    public Generos getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(Generos idGenero) {
        this.idGenero = idGenero;
    }

    public Pegui getIdPegui() {
        return idPegui;
    }

    public void setIdPegui(Pegui idPegui) {
        this.idPegui = idPegui;
    }

    @XmlTransient
    public Collection<Biblioteca> getBibliotecaCollection() {
        return bibliotecaCollection;
    }

    public void setBibliotecaCollection(Collection<Biblioteca> bibliotecaCollection) {
        this.bibliotecaCollection = bibliotecaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idJuego != null ? idJuego.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Juegos)) {
            return false;
        }
        Juegos other = (Juegos) object;
        if ((this.idJuego == null && other.idJuego != null) || (this.idJuego != null && !this.idJuego.equals(other.idJuego))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.insercionjpa.Juegos[ idJuego=" + idJuego + " ]";
    }
    
}
