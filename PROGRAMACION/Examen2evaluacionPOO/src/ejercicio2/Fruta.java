/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.lang.reflect.Array;

/**
 *
 * @author Usuario
 */
public class Fruta extends Producto {

    public String tipo;
    public Boolean estadoOptimo;

    public Fruta() {
    }

    public Fruta(String tipo, Boolean estadoOptimo, double precioBase, int codigo) {
        this.tipo = tipo;
        this.estadoOptimo = estadoOptimo;
        super.codigo = codigo;
        super.precioBase = precioBase;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Boolean getEstadoOptimo() {
        return estadoOptimo;
    }

    public void setEstadoOptimo(Boolean estadoOptimo) {
        this.estadoOptimo = estadoOptimo;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Fruta {" + "codigo" + codigo + "tipo=" + tipo + ", estadoOptimo=" + estadoOptimo + "Precio final: " + calcularPrecio() + '}';
    }

  

    @Override
    public double calcularPrecio() {

        return getPrecioBase() * 1.04;

    }

}
