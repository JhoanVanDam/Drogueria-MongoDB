    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clases;

import java.util.Date;

/**
 *
 * @author Jhoan
 */
public class FacturaClase {
//    private MetodosDeDB MetodosDB = new MetodosDeDB();
    private String Valor;
    private String Descripcion;
    private String Ciudad;
    private String fecha;
    private String Cantidad;
    private String Nfactura;
    MetodosDB MetodosDB = new MetodosDB();
    
    public FacturaClase(String Valor,String Cantidad,String Descripcion) {
        this.Valor = Valor;
        this.Ciudad = "La Laguna";
        this.fecha = new Date().toString();
         this.Nfactura = Factura();
        this.Cantidad = Cantidad;
        this.Descripcion = Descripcion;
       
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getCantidad() {
        return Cantidad;
    }

    public void setCantidad(String Cantidad) {
        this.Cantidad = Cantidad;
    }
    public FacturaClase(){
        
    }

    public String getValor() {
        return Valor;
    }

    public void setValor(String Valor) {
        this.Valor = Valor;
    }

    

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNfactura() {
        return Nfactura;
    }

    public void setNfactura(String Nfactura) {
        this.Nfactura = Nfactura;
    }

    private String Factura() {
        int random = (int) (Math.random() * 1000000);
       if(this.MetodosDB.existefactura(random+"")==false){
           return (random+"");
       }else{
           while(this.MetodosDB.existefactura(random+"")==true){
             random = (int) (Math.random() * 1000000);
         }
           return (random+"");
       }
    }
}
