/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author apena
 */
@Embeddable
public class BibliotecaPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_juego")
    private int idJuego;
    @Basic(optional = false)
    @Column(name = "id_usuario")
    private int idUsuario;

    public BibliotecaPK() {
    }

    public BibliotecaPK(int idJuego, int idUsuario) {
        this.idJuego = idJuego;
        this.idUsuario = idUsuario;
    }

    public int getIdJuego() {
        return idJuego;
    }

    public void setIdJuego(int idJuego) {
        this.idJuego = idJuego;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idJuego;
        hash += (int) idUsuario;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BibliotecaPK)) {
            return false;
        }
        BibliotecaPK other = (BibliotecaPK) object;
        if (this.idJuego != other.idJuego) {
            return false;
        }
        if (this.idUsuario != other.idUsuario) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelos.BibliotecaPK[ idJuego=" + idJuego + ", idUsuario=" + idUsuario + " ]";
    }
    
}
