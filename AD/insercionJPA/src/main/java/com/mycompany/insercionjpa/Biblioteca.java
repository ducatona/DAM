/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.insercionjpa;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author apena
 */
@Entity
@Table(name = "biblioteca")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Biblioteca.findAll", query = "SELECT b FROM Biblioteca b"),
    @NamedQuery(name = "Biblioteca.findByIdJuego", query = "SELECT b FROM Biblioteca b WHERE b.bibliotecaPK.idJuego = :idJuego"),
    @NamedQuery(name = "Biblioteca.findByIdUsuario", query = "SELECT b FROM Biblioteca b WHERE b.bibliotecaPK.idUsuario = :idUsuario"),
    @NamedQuery(name = "Biblioteca.findByFecha", query = "SELECT b FROM Biblioteca b WHERE b.fecha = :fecha"),
    @NamedQuery(name = "Biblioteca.findByUrl", query = "SELECT b FROM Biblioteca b WHERE b.url = :url")})
public class Biblioteca implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BibliotecaPK bibliotecaPK;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "url")
    private String url;
    @JoinColumn(name = "id_juego", referencedColumnName = "id_juego", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Juegos juegos;
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Usuarios usuarios;

    public Biblioteca() {
    }

    public Biblioteca(BibliotecaPK bibliotecaPK) {
        this.bibliotecaPK = bibliotecaPK;
    }

    public Biblioteca(int idJuego, int idUsuario) {
        this.bibliotecaPK = new BibliotecaPK(idJuego, idUsuario);
    }

    public BibliotecaPK getBibliotecaPK() {
        return bibliotecaPK;
    }

    public void setBibliotecaPK(BibliotecaPK bibliotecaPK) {
        this.bibliotecaPK = bibliotecaPK;
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

    public Juegos getJuegos() {
        return juegos;
    }

    public void setJuegos(Juegos juegos) {
        this.juegos = juegos;
    }

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bibliotecaPK != null ? bibliotecaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Biblioteca)) {
            return false;
        }
        Biblioteca other = (Biblioteca) object;
        if ((this.bibliotecaPK == null && other.bibliotecaPK != null) || (this.bibliotecaPK != null && !this.bibliotecaPK.equals(other.bibliotecaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.insercionjpa.Biblioteca[ bibliotecaPK=" + bibliotecaPK + " ]";
    }
    
}
