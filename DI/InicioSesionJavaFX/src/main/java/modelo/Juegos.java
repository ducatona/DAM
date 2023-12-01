/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;

/**
 *
 * @author apena
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "juegos")
@javax.persistence.NamedQueries({
    @javax.persistence.NamedQuery(name = "Juegos.findAll", query = "SELECT j FROM Juegos j"),
    @javax.persistence.NamedQuery(name = "Juegos.findByIdJuego", query = "SELECT j FROM Juegos j WHERE j.idJuego = :idJuego"),
    @javax.persistence.NamedQuery(name = "Juegos.findByNombreJuego", query = "SELECT j FROM Juegos j WHERE j.nombreJuego = :nombreJuego"),
    @javax.persistence.NamedQuery(name = "Juegos.findByDescripcion", query = "SELECT j FROM Juegos j WHERE j.descripcion = :descripcion"),
    @javax.persistence.NamedQuery(name = "Juegos.findByUrl", query = "SELECT j FROM Juegos j WHERE j.url = :url"),
    @javax.persistence.NamedQuery(name = "Juegos.findByUrlCaratula", query = "SELECT j FROM Juegos j WHERE j.urlCaratula = :urlCaratula"),
    @javax.persistence.NamedQuery(name = "Juegos.findByNivelDificultad", query = "SELECT j FROM Juegos j WHERE j.nivelDificultad = :nivelDificultad"),
    @javax.persistence.NamedQuery(name = "Juegos.findByFechaCreacion", query = "SELECT j FROM Juegos j WHERE j.fechaCreacion = :fechaCreacion"),
    @javax.persistence.NamedQuery(name = "Juegos.findByPrecio", query = "SELECT j FROM Juegos j WHERE j.precio = :precio"),
    @javax.persistence.NamedQuery(name = "Juegos.findByDescargasAcumuladas", query = "SELECT j FROM Juegos j WHERE j.descargasAcumuladas = :descargasAcumuladas")})
public class Juegos implements Serializable {

    private static final long serialVersionUID = 1L;
    @javax.persistence.Id
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "id_juego")
    private Integer idJuego;
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "nombre_juego")
    private String nombreJuego;
    @javax.persistence.Column(name = "descripcion")
    private String descripcion;
    @javax.persistence.Column(name = "url")
    private String url;
    @javax.persistence.Column(name = "url_caratula")
    private String urlCaratula;
    @javax.persistence.Column(name = "nivel_dificultad")
    private String nivelDificultad;
    @javax.persistence.Column(name = "fecha_creacion")
    @javax.persistence.Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaCreacion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @javax.persistence.Column(name = "precio")
    private BigDecimal precio;
    @javax.persistence.Column(name = "descargas_acumuladas")
    private Integer descargasAcumuladas;
    @javax.persistence.JoinColumn(name = "id_genero", referencedColumnName = "id_genero")
    @javax.persistence.ManyToOne(optional = false)
    private Generos idGenero;
    @javax.persistence.JoinColumn(name = "id_desarrollador", referencedColumnName = "id_usuario")
    @javax.persistence.ManyToOne
    private Usuarios idDesarrollador;
    @javax.persistence.JoinColumn(name = "id_pegui", referencedColumnName = "id_pegui")
    @javax.persistence.ManyToOne(optional = false)
    private Pegui idPegui;
    @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL, mappedBy = "idJuegos")
    private Collection<Descargas> descargasCollection;

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

    public Generos getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(Generos idGenero) {
        this.idGenero = idGenero;
    }

    public Usuarios getIdDesarrollador() {
        return idDesarrollador;
    }

    public void setIdDesarrollador(Usuarios idDesarrollador) {
        this.idDesarrollador = idDesarrollador;
    }

    public Pegui getIdPegui() {
        return idPegui;
    }

    public void setIdPegui(Pegui idPegui) {
        this.idPegui = idPegui;
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
        return "metodos.Juegos[ idJuego=" + idJuego + " ]";
    }
    
}
