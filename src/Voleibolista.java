public class Voleibolista extends Atleta {

    private int saquesEfectivos;
    private int bloqueos;

    public Voleibolista() {
    }

    public Voleibolista(String nombre, int edad, double horasEntrenamiento,
                        int saquesEfectivos, int bloqueos) {
        super(nombre, edad, horasEntrenamiento);
        this.saquesEfectivos = saquesEfectivos;
        this.bloqueos = bloqueos;
    }

    public int getSaquesEfectivos() {
        return saquesEfectivos;
    }

    public void setSaquesEfectivos(int saquesEfectivos) {
        this.saquesEfectivos = saquesEfectivos;
    }

    public int getBloqueos() {
        return bloqueos;
    }

    public void setBloqueos(int bloqueos) {
        this.bloqueos = bloqueos;
    }

    @Override
    public double calcularRendimiento() {
        return (saquesEfectivos * 2) + (bloqueos * 3);
    }

    @Override
    public String clasificarNivel() {
        double r = calcularRendimiento();
        if (r < 30) return "Básico";
        else if (r <= 70) return "Competente";
        else return "Elite";
    }

    @Override
    public double calcularBono() {
        String nivel = clasificarNivel();
        if (nivel.equals("Básico")) return 50000;
        else if (nivel.equals("Competente")) return 150000;
        else return 300000;
    }
}