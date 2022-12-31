/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clases;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoException;
import java.util.ArrayList;


public class ConexionDB {

    private MongoClient MC = null;
    public DBCollection Coleccion;
    private DB db;

    public void conexion() {

        try {
            MongoClientURI url = new MongoClientURI("mongodb+srv://JhoanVanDam:prototype1@elqueustedquiera.pzbzamr.mongodb.net/?retryWrites=true&w=majority");
            //Crea la conexion de la db
            MC = new MongoClient(url);
            this.Coleccion = MC.getDB("ProyectoDB").getCollection("Productos"); // El objeto Coleccion contiene la coleccion indicada
            this.db = MC.getDB("ProyectoDB");

        } catch (MongoException e) {
            System.out.println("Error en conexion conexionDB" + e);

        }

    }

    public DB getDb() {
        return db;
    }

    public String buscar(DB db, String NomColeccion, String valor) {
        DBCollection coleccion = db.getCollection(NomColeccion);
        try {
            BasicDBObject consulta = new BasicDBObject();
            consulta.put("nombre", valor);
            DBCursor cur = coleccion.find(consulta);
            String Res = "";
            while (cur.hasNext()) {
                System.out.println(cur.next());
                System.out.println(cur.curr().get("nombre"));
                System.out.println(cur.curr().get("apellido"));
                System.out.println(cur.curr().get("edad"));
                Res = cur.curr().get("nombre").toString() + " ," + cur.curr().get("apellido").toString() + " ," + cur.curr().get("edad").toString();
            }
            return Res;
        } catch (MongoException e) {

            System.out.println("Error en ConexionDB metodo buscar" + e);
            return "Error";
        }

    }
    

    public DBObject buscarDBO(DB db, String NomColeccion, String valor) {
        //buscamos la coleccion
        DBCollection coleccion = db.getCollection(NomColeccion);
        try {

            //agregamos documentos para consultar
            BasicDBObject consulta = new BasicDBObject();
            consulta.put("prod_descripcion", valor);
            //creamos un cursor para iterar la coleccion y le pasamos la consulta de parametro
            DBCursor cur = coleccion.find(consulta);
            //dentro de un while se ejecuta el current o actual

            while (cur.hasNext()) {
                System.out.println(cur.next());

            }

            return cur.curr();
        } catch (MongoException e) {

            System.out.println("Error en ConexionDB metodo buscar" + e);
            return null;
        }

    }
    public DBObject buscarFactura(DB db, String NomColeccion, String valor) {
        //buscamos la coleccion
        DBCollection coleccion = db.getCollection(NomColeccion);
        try {

            //agregamos documentos para consultar
            BasicDBObject consulta = new BasicDBObject();
            consulta.put("fact_numero", valor);
            //creamos un cursor para iterar la coleccion y le pasamos la consulta de parametro
            DBCursor cur = coleccion.find(consulta);
            //dentro de un while se ejecuta el current o actual

            while (cur.hasNext()) {
                System.out.println(cur.next());

            }

            return cur.curr();
        } catch (MongoException e) {

            System.out.println("Error en ConexionDB metodo buscar" + e);
            return null;
        }

    }
    
    

    public String Insertar(DB db, String NomColeccion, BasicDBObject valor) {
        try {
            DBCollection coleccion = db.getCollection(NomColeccion);
            coleccion.insert(valor);
            System.out.println(valor.toString());
            return "Correcto";
        } catch (MongoException e) {
            System.out.println("Error en ConexionDB metodo Insertar" + e);
            return "Error";
        }

    }

    public String Eliminar(DB db, String NomColeccion, String valor) {
        try {
            //Obtenemos la coleccion
            DBCollection coleccion = db.getCollection(NomColeccion);

            //se crea el documento a eliminar
            BasicDBObject Eliminar = new BasicDBObject();
            // agregamos los campos a eliminar
            Eliminar.put("prod_descripcion", valor);
            // ejecutamos la accion de eliminar 
            coleccion.remove(Eliminar);

            return "se elimino a :" + Eliminar.toString();

        } catch (MongoException e) {
            System.out.println("Error en ConexionDB metodo Insertar" + e);
            return "Error";
        }

    }

    public String Actualizar(DB db, String NomColeccion, BasicDBObject Actualizar, String NombreBuscar) {
        try {
            //Obtenemos la coleccion
            DBCollection coleccion = db.getCollection(NomColeccion);

            //nuevo va a ser el parametro actualizar
            //antiguo
            BasicDBObject Buscar = new BasicDBObject();
            Buscar.append("prod_descripcion", NombreBuscar);

            //actualizamos el documento antiguo por el nuevo
            coleccion.update(Buscar, Actualizar);

            return "se Actualizo a :" + Actualizar.toString();
        } catch (MongoException e) {
            System.out.println("Error en ConexionDB metodo Insertar" + e);
            return "Error";
        }

    }
    public ArrayList<Productos> Llenar() {
        ArrayList<Productos> Arr;
        Arr = new ArrayList<>();

        try {
            DBCollection coleccion = db.getCollection("Productos");
            //Obtenemos la coleccion

            //creamos un cursor para iterar la coleccion 
            DBCursor cur = coleccion.find();
            //dentro de un while se ejecuta el current o actual

            while (cur.hasNext()) {
                System.out.println(cur.next());
                Productos Prod = new Productos(
                        cur.curr().get("prod_descripcion")+"",
                        cur.curr().get("prod_id")+"",
                        cur.curr().get("prod_costo")+"",
                        cur.curr().get("prod_venta")+"",
                        cur.curr().get("prod_cantidad")+"",
                        cur.curr().get("ventas_desde")+"",
                        cur.curr().get("prod_fechavencimiento")+"");
                System.out.println(Prod.toString());
                Arr.add(Prod);
            }

            return Arr;
        } catch (MongoException e) {

            System.out.println("Error en ConexionDB metodo llenar" + e);
            return null;
        }

    }

}
