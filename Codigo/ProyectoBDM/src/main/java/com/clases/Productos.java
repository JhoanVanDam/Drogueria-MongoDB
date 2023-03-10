/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clases;

public class Productos {
    private String Nombre;
    private String Codigo;
    private String PrecioDeCompra;
    private String PrecioDeVenta;
    private String Cantidad;
    private String VentasDesde;
    private String FechaCaducidad;

    public String getNombre() {
        return Nombre;
    }

    @Override
    public String toString() {
        return "Productos{" + "Nombre=" + Nombre + ", Codigo=" + Codigo + ", PrecioDeCompra=" + PrecioDeCompra + ", PrecioDeVenta=" + PrecioDeVenta + ", Cantidad=" + Cantidad + ", VentasDesde=" + VentasDesde + ", FechaCaducidad=" + FechaCaducidad + '}';
    }

    
    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getVentasDesde() {
        return VentasDesde;
    }

    public void setVentasDesde(String VentasDesde) {
        this.VentasDesde = VentasDesde;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPrecioDeCompra() {
        return PrecioDeCompra;
    }

    public void setPrecioDeCompra(String PrecioDeCompra) {
        this.PrecioDeCompra = PrecioDeCompra;
    }

    public String getPrecioDeVenta() {
        return PrecioDeVenta;
    }

    public void setPrecioDeVenta(String PrecioDeVenta) {
        this.PrecioDeVenta = PrecioDeVenta;
    }

    public String getCantidad() {
        return Cantidad;
    }

    public void setCantidad(String Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getFechaCaducidad() {
        return FechaCaducidad;
    }

    public void setFechaCaducidad(String FechaCaducidad) {
        this.FechaCaducidad = FechaCaducidad;
    }

    public Productos(String Nombre, String Codigo, String PrecioDeCompra, String PrecioDeVenta, String Cantidad,String VentasDesde,String Fecha) {
        this.Nombre = Nombre;
        this.Codigo = Codigo;
        this.PrecioDeCompra = PrecioDeCompra;
        this.PrecioDeVenta = PrecioDeVenta;
        this.Cantidad = Cantidad;
        this.VentasDesde = VentasDesde;
        this.FechaCaducidad = Fecha;
    }

    
}
