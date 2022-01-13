package ec.edu.espe.controlador;

public class Jugador {
    private int id;
    private String cedula;
    private String nombre;
    private String equipo;
    private String pais;
    private static int contadorJugadores;

    public Jugador() {
        this.id = ++Jugador.contadorJugadores;
    }

    public Jugador(int id, String cedula, String nombre, String equipo, String pais) {
        this.id = ++Jugador.contadorJugadores;
        this.cedula = cedula;
        this.nombre = nombre;
        this.equipo = equipo;
        this.pais = pais;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    
    
}
