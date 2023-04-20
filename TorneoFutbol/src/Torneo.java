    import java.util.ArrayList;
    import java.util.List;


    public class Torneo {
        private List<Equipo> equipos;

        public Torneo() {
            this.equipos = new ArrayList<>();
            equipos.add(new Equipo("Velez"));
            equipos.add(new Equipo("Boca"));
            equipos.add(new Equipo("River"));
            equipos.add(new Equipo("Estudiantes"));
            equipos.add(new Equipo("Gimnasia"));
            equipos.add(new Equipo("Racing"));
            equipos.add(new Equipo("Independiente"));
            equipos.add(new Equipo("Lanus"));
        }

        public List<Equipo> jugar() {
            System.out.println("------ Cuartos de Final ------");
            List<Partido> cuartosDeFinal = new ArrayList<>();
            cuartosDeFinal.add(new Partido(equipos.get(0), equipos.get(7)));
            cuartosDeFinal.add(new Partido(equipos.get(1), equipos.get(6)));
            cuartosDeFinal.add(new Partido(equipos.get(2), equipos.get(5)));
            cuartosDeFinal.add(new Partido(equipos.get(3), equipos.get(4)));

            List<Equipo> ganadoresCuartos = new ArrayList<>();
            for (Partido partido : cuartosDeFinal) {
                partido.jugar();
                System.out.println(partido);
                ganadoresCuartos.add(partido.getGanador());
            }

            System.out.println("------ Semifinales ------");

            List<Partido> semifinales = new ArrayList<>();
            semifinales.add(new Partido(ganadoresCuartos.get(0), ganadoresCuartos.get(3)));
            semifinales.add(new Partido(ganadoresCuartos.get(1), ganadoresCuartos.get(2)));
            List<Equipo> ganadoresSemis = new ArrayList<>();
            for (Partido partido : semifinales) {
                partido.jugar();
                System.out.println(partido);
                ganadoresSemis.add(partido.getGanador());
            }

            System.out.println("------ Final ------");

            Partido finalPartido = new Partido(ganadoresSemis.get(0), ganadoresSemis.get(1));
            finalPartido.jugar();
            System.out.println(finalPartido);
            List<Equipo> ganadoresFinales = new ArrayList<>();
            ganadoresFinales.add(finalPartido.getGanador());

            return ganadoresFinales;
        }

    }