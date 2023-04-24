import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Apuestas {

    private List<Equipo> equipos;
    private Equipo equipoUsuario;
    private int monto;

    public Apuestas() {
        this.equipos = new ArrayList<>();
        equipos.add(new Equipo("Velez"));
        equipos.add(new Equipo("Boca"));
        equipos.add(new Equipo("River"));
        equipos.add(new Equipo("Estudiantes"));
        equipos.add(new Equipo("Gimnasia"));
        equipos.add(new Equipo("Racing"));
        equipos.add(new Equipo("Independiente"));
        equipos.add(new Equipo("Lanus"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del equipo por el que quiere apostar:");
        String nombreEquipo = scanner.nextLine();

        for (Equipo equipo : equipos) {
            if (equipo.getNombre().equalsIgnoreCase(nombreEquipo)) {
                this.equipoUsuario = equipo;
                break;
            }
        }

        if (this.equipoUsuario == null) {
            System.out.println("No se encontró el equipo ingresado, se apostará por un equipo al azar.");
            Random random = new Random();
            this.equipoUsuario = equipos.get(random.nextInt(equipos.size()));
        }

        System.out.println("Ingrese el monto a apostar:");
        this.monto = scanner.nextInt();
        scanner.close();
    }

    public List<Equipo> jugarTorneo() {
        Torneo torneo = new Torneo();
        List<Equipo> ganadoresFinales = torneo.jugar();


                System.out.println("***************************************");
                System.out.println("El ganador del torneo es: " + ganadoresFinales.get(0).getNombre());
                System.out.println("***************************************");
                System.out.println("Usted aposto por: " + equipoUsuario.getNombre());

                if (equipoUsuario.getNombre() == ganadoresFinales.get(0).getNombre()) {
                    System.out.println("¡Felicidades! Has ganado " + (this.monto * 13.27) + " de pesos en tu apuesta.");
                } else {
                    System.out.println("Lo siento, has perdido tu apuesta de " + this.monto + " pesos.");
                }
        return ganadoresFinales;
    }
        }
