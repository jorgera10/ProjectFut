package com.kenwalger.mongoJava;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import java.util.ArrayList;

public class MongoJava {
    public static int numeroEquipos = 0;

    public static void main(String[]args) {
        
        MongoClient mongo = crearConexion();
        
        // SI NO EXISTE LA BASE DE DATOS LA CREAMOS
        if(mongo != null) {
            DB db = mongo.getDB("Futbol");
            
            System.out.println("BASE DE DATOS CREADA");
            // CREA UNA COLECCION(TABLA) SI NO EXISTE E
            // INSERTA EL DOCUMENTO(REGISTRO) A LA COLECCION
            /*insertarUsuario(db,"usuarios",1, "asdaSergio", "Mexico");
            insertarUsuario(db,"usuarios",2, "dasdaLaura", "Colombia");
            insertarUsuario(db, "usuarios",3, "dasFranco", "Chile");*/
            
            //mostrarColeccion(db, "usuarios");
            //buscarPorNombre(db, "Equipo", "barcelona");
            
            //System.out.println("ANTES DEL UPDATE");
            //mostrarColeccion(db, "usuarios");
            //actualizarDocumento(db, "usuarios", "Sergio");
            //System.out.println("DESPUES DEL UPDATE");
            //mostrarColeccion(db, "usuarios");
            
            /*System.out.println("ANTES DEL DELETE");
            mostrarColeccion(db, "Equipo");
            borrarDocumento(db, "usuarios", "Sergio");
            System.out.println("DESPUES DEL DELETE");
            mostrarColeccion(db, "usuarios");*/
        }
        
    }
    
    // METODO PARA CREAR LA CONEXION A MONGODB
    public static MongoClient crearConexion() {
        System.out.println("PRUEBA CONEXION MONGODB");
        
        MongoClient mongo = null;
        
        mongo = new MongoClient("localhost", 27017);
        
        return mongo;
    }
    
    // METODO PARA INSERTAR UN DOCUMENTO (REGISTRO)
    public static void insertarUsuario(DB db, String coleccion, int ID ,String nombre, String pais) {
        DBCollection colec = db.getCollection(coleccion);
        
        // CREA EL DOCUMENTO(REGISTRO) E INSERTA LA INFORMACION RECIBIDA
        BasicDBObject documento = new BasicDBObject();
        documento.put("ID", ID);
        documento.put("nombre", nombre);
        documento.put("pais", pais);
        
        colec.insert(documento);
        
    }
    public static void insertarJugador(DB dbJugador, String coleccionJugador, int IdJugador , String cedulaJugador, String nombreJugador,String equipoJugador, String paisJugador) {
        DBCollection colec = dbJugador.getCollection(coleccionJugador);
        
        // CREA EL DOCUMENTO(REGISTRO) E INSERTA LA INFORMACION RECIBIDA
        BasicDBObject documento = new BasicDBObject();
        documento.put("ID", IdJugador);
        documento.put("cedula", cedulaJugador);
        documento.put("nombre", nombreJugador);
        documento.put("equipo", equipoJugador);
        documento.put("pais", paisJugador);
        
        colec.insert(documento);
        
    }
    
    
    
    
    // MUESTRA TODOS LOS DOCUMENTOS DE LA COLECCION USUARIOS
    public static String mostrarColeccion(DB db, String coleccion) {
        
        ArrayList<String> ListaEquipos = new ArrayList<String>(); //array de equipos
        String ListaEquiposStr = ""; //en esta variable guardamos los equipos
        
        DBCollection colec = db.getCollection(coleccion);
        
        DBCursor cursor = colec.find();
        
        while(cursor.hasNext()) {
            ListaEquipos.add(cursor.next().get("ID") + " - " + cursor.curr().get("nombre")); //añadimos cada equipo de la base al array list
        }
        
        numeroEquipos = ListaEquipos.size();
        
        for (String ListaEquipo : ListaEquipos) { //foreach
            ListaEquiposStr += ListaEquipo+"\n"; //sumamos en una cadena cada elemento del array list
        }
        
        return ListaEquiposStr;
    }
    
    
    // MUESTRA TODOS LOS DOCUMENTOS DE LA COLECCION USUARIOS QUE COINCIDAN CON EL NOMBRE
    public static void buscarPorNombre(DB db, String coleccion, String nombre) {
        DBCollection colect = db.getCollection(coleccion);
        
        // CREAMOS LA CONSULTA CON EL CAMPO NOMBRE
        BasicDBObject consulta = new BasicDBObject();
        consulta.put("nombre", nombre);
        
        // BUSCA Y MUESTRA TODOS LOS DOCUMENTOS QUE COINCIDAN CON LA CONSULTA
        DBCursor cursor = colect.find(consulta);
        while(cursor.hasNext()) {
            System.out.println("-- " + cursor.next().get("nombre") + " - " + cursor.curr().get("pais"));
        }
    }
    
    
    // MUESTRA TODOS LOS DOCUMENTOS DE LA COLECCION USUARIOS QUE COINCIDAN CON EL ID
    public static String buscarPorId(DB db, String coleccion, int id) {
        ArrayList<String> resultadoBusqueda = new ArrayList<String>();
        String strResultadoBusqueda = "";
        
        DBCollection colect = db.getCollection(coleccion);
        
        // CREAMOS LA CONSULTA CON EL CAMPO NOMBRE
        BasicDBObject consulta = new BasicDBObject();
        consulta.put("ID", id);
        
        // BUSCA Y MUESTRA TODOS LOS DOCUMENTOS QUE COINCIDAN CON LA CONSULTA
        DBCursor cursor = colect.find(consulta);
        while(cursor.hasNext()) {
            resultadoBusqueda.add(cursor.next().get("ID") + " - " + cursor.curr().get("nombre"));
        }
        
        for(String resultadobusqueda : resultadoBusqueda){
            strResultadoBusqueda += resultadobusqueda+"\n"; //sumamos en una cadena cada elemento del array list
        }
        return strResultadoBusqueda;
    }
    
    
    
    // METODO PARA ACTUALIZAR UN DOCUMENTO (REGISTRO)
    public static void actualizarDocumento(DB db, String coleccion, String nombre) {
        DBCollection colec = db.getCollection(coleccion);
        
        // SENTENCIA CON LA INFORMACION A REMPLAZAR
        BasicDBObject actualizarPais = new BasicDBObject();
        actualizarPais.append("$set", new BasicDBObject().append("pais", "Peru"));
        
        // BUSCA EL DOCUMENTO EN LA COLECCION
        BasicDBObject buscarPorNombre = new BasicDBObject();
        buscarPorNombre.append("nombre", nombre);
        
        // REALIZA EL UPDATE
        colec.updateMulti(buscarPorNombre, actualizarPais);
    }
    
    // METODO PARA ELIMINAR UN DOCUMENTO (REGISTRO)
    public static void borrarDocumento(DB db, String coleccion, String id) {
        DBCollection colec = db.getCollection(coleccion);
        
        colec.remove(new BasicDBObject().append("id", id));
    }
    
    
    
    
    public static String numeroEquipos(DB db, String coleccion) {
        
        DBCollection colec = db.getCollection(coleccion);
        
        DBCursor cursor = colec.find();

        String numCadena= String.valueOf(numeroEquipos);
        return numCadena;
    
    }

    
}