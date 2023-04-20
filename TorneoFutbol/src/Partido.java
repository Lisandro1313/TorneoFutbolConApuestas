import java.util.Random;

public class Partido {
    private Equipo local;
    private Equipo visitante;
    private int golesLocal;
    private int golesVisitante;

    public Partido(Equipo local, Equipo visitante) {
        this.local = local;
        this.visitante = visitante;
        this.golesLocal = 0;
        this.golesVisitante = 0;
    }

    public void jugar() {
        Random r = new Random();
        this.golesLocal = r.nextInt(6);
        this.golesVisitante = r.nextInt(6);
        while (this.golesLocal == this.golesVisitante) {
            this.golesLocal = r.nextInt(6);
            this.golesVisitante = r.nextInt(6);
        }
        if (this.golesLocal > this.golesVisitante) {
            this.local.sumarGol();
        } else {
            this.visitante.sumarGol();
        }
    }

    public Equipo getGanador() {
        if (this.golesLocal > this.golesVisitante) {
            return this.local;
        } else {
            return this.visitante;
        }
    }

    public String toString() {
        return local.getNombre() + " " + golesLocal + " - " + golesVisitante + " " + visitante.getNombre();
    }
}
