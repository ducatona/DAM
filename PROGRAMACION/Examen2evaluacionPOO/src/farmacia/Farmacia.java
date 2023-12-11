/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farmacia;

/**
 *
 * @author Usuario
 */
public class Farmacia {

    public String producto;
    public int cantidad;
    public double precio;

    public Farmacia() {
        producto = "tiritas";
        cantidad = 10;
        precio = 2;
    }

    public Farmacia(String producto, int cantidad, double precio) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public Farmacia(Farmacia copia) {
        this.producto = copia.producto;
        this.cantidad = copia.cantidad;
        this.precio = copia.precio;

    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Farmacia{" + "producto=" + producto + ", cantidad=" + cantidad + ", precio=" + calculaPrecio(cantidad, precio) + '}';
    }

    public double calculaPrecio(int cantidad, double precio) {

        if (precio < 30) {

            return precio * 1.1 * cantidad;

        } else {

            return precio * 1.18* cantidad;

        }

    }
}
