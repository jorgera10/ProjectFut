
package ec.edu.espe.controlador;

import com.kenwalger.mongoJava.MongoJava;
import static com.kenwalger.mongoJava.MongoJava.crearConexion;
import static com.kenwalger.mongoJava.MongoJava.numeroEquipos;
import com.mongodb.DB;
import com.mongodb.MongoClient;

public class Partida {
    MongoClient mongo = crearConexion();
    DB db = mongo.getDB("Futbol");
    
    
    private String equipo1;
    private String equipo2;
    private String resultado;

    public Partida() {
    }

    public Partida(String equipo1, String equipo2, String resultado) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.resultado = resultado;
    }

    public String getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(String equipo1) {
        this.equipo1 = equipo1;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(String equipo2) {
        this.equipo2 = equipo2;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
    
    
    public int emparejarEquipo1(){
        MongoJava.mostrarColeccion(db, "Equipo");
        int equipo1 = (int)(Math.random()*Integer.parseInt(numeroEquipos(db, "Equipo"))+1);
        return equipo1;
    }
    public int emparejarEquipo2(){
        MongoJava.mostrarColeccion(db, "Equipo");
        int equipo2 = (int)(Math.random()*Integer.parseInt(numeroEquipos(db, "Equipo"))+1);
        
        
        return equipo2;
    }
    
    
    
    
    public int resultadoEquipo1(){
        MongoJava.mostrarColeccion(db, "Equipo");
        int resultadoEquipo1 = (int)(Math.random()*Integer.parseInt(numeroEquipos(db, "Equipo"))+1);
        return resultadoEquipo1;
    }
    public int ResultadoEquipo2(){
        MongoJava.mostrarColeccion(db, "Equipo");
        int resultadoEquipo2 = (int)(Math.random()*Integer.parseInt(numeroEquipos(db, "Equipo"))+1);
        return resultadoEquipo2;
    }

}
