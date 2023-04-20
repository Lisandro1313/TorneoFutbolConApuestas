
public class Equipo {
    private String nombre;
    private int goles;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.goles = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void sumarGol() {
        goles++;
    }
}