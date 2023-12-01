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
@javax.persistence.Table(name = "usuarios")
@javax.persistence.NamedQueries({
    @javax.persistence.NamedQuery(name = "Usuarios.findAll", query = "SELECT u FROM Usuarios u"),
    @javax.persistence.NamedQuery(name = "Usuarios.findByIdUsuario", query = "SELECT u FROM Usuarios u WHERE u.idUsuario = :idUsuario"),
    @javax.persistence.NamedQuery(name = "Usuarios.findByNombre", query = "SELECT u FROM Usuarios u WHERE u.nombre = :nombre"),
    @javax.persistence.NamedQuery(name = "Usuarios.findByApellidos", query = "SELECT u FROM Usuarios u WHERE u.apellidos = :apellidos"),
    @javax.persistence.NamedQuery(name = "Usuarios.findByFechaNac", query = "SELECT u FROM Usuarios u WHERE u.fechaNac = :fechaNac"),
    @javax.persistence.NamedQuery(name = "Usuarios.findByAlias", query = "SELECT u FROM Usuarios u WHERE u.alias = :alias"),
    @javax.persistence.NamedQuery(name = "Usuarios.findByPassword", query = "SELECT u FROM Usuarios u WHERE u.password = :password"),
    @javax.persistence.NamedQuery(name = "Usuarios.findByEmail", query = "SELECT u FROM Usuarios u WHERE u.email = :email")})
public class Usuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @javax.persistence.Id
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "id_usuario")
    private Integer idUsuario;
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "nombre")
    private String nombre;
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "apellidos")
    private String apellidos;
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "fecha_nac")
    @javax.persistence.Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaNac;
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "alias")
    private String alias;
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "password")
    private String password;
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "email")
    private String email;
    @javax.persistence.OneToMany(mappedBy = "idDesarrollador")
    private Collection<Juegos> juegosCollection;
    @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL, mappedBy = "idUsuario")
    private Collection<Biblioteca> bibliotecaCollection;
    @javax.persistence.JoinColumn(name = "id_biblioteca", referencedColumnName = "id_biblioteca")
    @javax.persistence.ManyToOne(optional = false)
    private Biblioteca idBiblioteca;
    @javax.persistence.JoinColumn(name = "id_perfil", referencedColumnName = "id_perfil")
    @javax.persistence.ManyToOne
    private Perfil idPerfil;
    @javax.persistence.JoinColumn(name = "id_nacionalidad", referencedColumnName = "id_nacionalidad")
    @javax.persistence.ManyToOne(optional = false)
    private Nacionalidad idNacionalidad;

    public Usuarios() {
    }

    public Usuarios(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Usuarios(Integer idUsuario, String nombre, String apellidos, Date fechaNac, String alias, String password, String email) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNac = fechaNac;
        this.alias = alias;
        this.password = password;
        this.email = email;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Collection<Juegos> getJuegosCollection() {
        return juegosCollection;
    }

    public void setJuegosCollection(Collection<Juegos> juegosCollection) {
        this.juegosCollection = juegosCollection;
    }

    public Collection<Biblioteca> getBibliotecaCollection() {
        return bibliotecaCollection;
    }

    public void setBibliotecaCollection(Collection<Biblioteca> bibliotecaCollection) {
        this.bibliotecaCollection = bibliotecaCollection;
    }

    public Biblioteca getIdBiblioteca() {
        return idBiblioteca;
    }

    public void setIdBiblioteca(Biblioteca idBiblioteca) {
        this.idBiblioteca = idBiblioteca;
    }

    public Perfil getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(Perfil idPerfil) {
        this.idPerfil = idPerfil;
    }

    public Nacionalidad getIdNacionalidad() {
        return idNacionalidad;
    }

    public void setIdNacionalidad(Nacionalidad idNacionalidad) {
        this.idNacionalidad = idNacionalidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuarios)) {
            return false;
        }
        Usuarios other = (Usuarios) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "metodos.Usuarios[ idUsuario=" + idUsuario + " ]";
    }
    
}
