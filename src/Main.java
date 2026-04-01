public class Main {
    public static void main(String[] args) {

        Ciclista ciclista = new Ciclista("Juan", 25, 5, 120, 4);
        boxeador boxeador = new boxeador("Carlos", 28, 6, 80, 5);
        Voleibolista voleibolista = new Voleibolista("Julian", 24, 6, 50, 9);

        System.out.println("        CICLISTA     ");
        ciclista.mostrarDatos();
        double r1 = ciclista.calcularRendimiento();
        System.out.println("Rendimiento: " + r1);
        System.out.println("Nivel: " + ciclista.clasificarNivel());
        System.out.println("Bono: " + ciclista.calcularBono());

        System.out.println("         BOXEADOR      ");
        boxeador.mostrarDatos();
        double r2 = boxeador.calcularRendimiento();
        System.out.println("Rendimiento: " + r2);
        System.out.println("Nivel: " + boxeador.clasificarNivel());
        System.out.println("Bono: " + boxeador.calcularBono());

        System.out.println("         VOLEIBOLISTA    ");
        voleibolista.mostrarDatos();
        double r3 = voleibolista.calcularRendimiento();
        System.out.println("Rendimiento: " + r3);
        System.out.println("Nivel: " + voleibolista.clasificarNivel());
        System.out.println("Bono: " + voleibolista.calcularBono());

        double mayor = r1;
        String mejor = "Ciclista";

        if (r2 > mayor) {
            mayor = r2;
            mejor = "Boxeador";
        }

        if (r3 > mayor) {
            mayor = r3;
            mejor = "Voleibolista";
        }

        System.out.println(" El mejor atleta es: " + mejor + " con rendimiento: " + mayor);
    }
}