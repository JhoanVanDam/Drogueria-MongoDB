/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clases;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoException;
import java.util.ArrayList;

public class MetodosDB {

    ConexionDB db = new ConexionDB();

    public MetodosDB() {
        this.db.conexion();
    }

    public Productos Buscarproducto(String Nombre) {
        DBObject prodoc = this.db.buscarDBO(this.db.getDb(), "Productos", Nombre);
        Productos Producto = new Productos(prodoc.get("prod_descripcion").toString(), prodoc.get("prod_id").toString(), prodoc.get("prod_costo").toString(), prodoc.get("prod_venta").toString(), prodoc.get("prod_cantidad").toString(), prodoc.get("ventas_desde").toString(), prodoc.get("prod_fechavencimiento").toString());

        return Producto;

    }

    public String InsertatProducto(String nombre, String Costo, String valor, String cantidad, String fecha) {
        try {
            BasicDBObject ProdDBO = new BasicDBObject();
            ProdDBO.append("prod_id", this.db.Coleccion.getCount() + 1);
            ProdDBO.append("prod_descripcion", nombre);
            ProdDBO.append("prod_costo", Costo);
            ProdDBO.append("prod_venta", valor);
            ProdDBO.append("prod_cantidad", cantidad);
            ProdDBO.append("ventas_desde", "0");
            ProdDBO.append("prod_fechavencimiento", fecha);
            this.db.Insertar(this.db.getDb(), "Productos", ProdDBO);
            return "No problemas";
        } catch (MongoException e) {
            System.out.println("Error en metodosdb insertar prod" + e);
            return null;
        }

    }

    public String EditarProducto(String key, String valor, String buscar) {
        try {
            BasicDBObject nuevodoc = (BasicDBObject) this.db.buscarDBO(this.db.getDb(), "Productos", buscar);

            nuevodoc.replace(key, valor);

            this.db.Actualizar(this.db.getDb(), "Productos", nuevodoc, buscar);
            return "Excelente";
        } catch (MongoException e) {
            System.out.println("Erro en edirtar prodcuto metodos db" + e);
            return null;
        }

    }

    public String BorrarProducto(String Nombre) {
        try {
            this.db.Eliminar(this.db.getDb(), "Productos", Nombre);
            return "Exito";
        } catch (MongoException e) {
            return "Error en borrar producto metodos db " + e;
        }

    }

    public boolean existeono(String Nombre) {

        if (this.Buscarproducto(Nombre).getNombre().isEmpty() == false) {
            System.out.println("existe");
            return true;
        } else {
            return false;
        }
    }
    public ArrayList<Productos> Llenar() {
        ArrayList<Productos> Prod;
        Prod = this.db.Llenar();
        
        if(Prod.isEmpty()==true){
            System.out.println("No hay productos");
            return null;
        }else{
          return Prod;  
        }
        
        
        

    }
    public boolean existefactura(String random){
        try {
             String Num = this.db.buscarFactura(this.db.getDb(), "Facturas", random).get("fact_numero").toString();
         
        if( Num.isEmpty()==true){
        return false;
        }else{
        return true;    
        }
        } catch (Exception e) {
            
            System.out.println("error existe fact"+e);
            return false;
        }
       
       
        
    }
}
