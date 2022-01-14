package ec.edu.espe.vista;

import com.kenwalger.mongoJava.MongoJava;
import static com.kenwalger.mongoJava.MongoJava.crearConexion;
import com.mongodb.DB;
import com.mongodb.MongoClient;

/**
 *
 * @author LENOVO
 */
public class main {
    public static void main(String[] args){
        //MongoClient mongo = crearConexion();
        
        
        // SI NO EXISTE LA BASE DE DATOS LA CREAMOS
        /*if(mongo != null) {
            DB db = mongo.getDB("Futbol");
            
            System.out.println("BASE DE DATOS CREADA");
            // CREA UNA COLECCION(TABLA) SI NO EXISTE E
            // INSERTA EL DOCUMENTO(REGISTRO) A LA COLECCION
            /*insertarUsuario(db,"usuarios",1, "asdaSergio", "Mexico");
            insertarUsuario(db,"usuarios",2, "dasdaLaura", "Colombia");
            insertarUsuario(db, "usuarios",3, "dasFranco", "Chile");/
            
            //mostrarColeccion(db, "usuarios");
            //buscarPorNombre(db, "usuarios", "Sergio");
            
            //System.out.println("ANTES DEL UPDATE");
            //mostrarColeccion(db, "usuarios");
            //actualizarDocumento(db, "usuarios", "Sergio");
            //System.out.println("DESPUES DEL UPDATE");
            //mostrarColeccion(db, "usuarios");
            
            /*System.out.println("ANTES DEL DELETE");
            mostrarColeccion(db, "usuarios");
            borrarDocumento(db, "usuarios", "Sergio");
            System.out.println("DESPUES DEL DELETE");
            mostrarColeccion(db, "usuarios");*/
            //MongoJava.insertarUsuario(db, "Equipo",  "2","jorge2", "ecuador");
        //}
        
        MainV main = new MainV();
        main.setVisible(true);
    }
    
    
    
}
