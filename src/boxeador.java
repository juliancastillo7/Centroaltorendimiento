public class Boxeador extends Atleta {

    private int golpesAcertados;
    private int peleasGanadas;

    public Boxeador() {
    }

    public Boxeador(String nombre, int edad, double horasEntrenamiento,
                    int golpesAcertados, int peleasGanadas) {
        super(nombre, edad, horasEntrenamiento);
        this.golpesAcertados = golpesAcertados;
        this.peleasGanadas = peleasGanadas;
    }

    public int getGolpesAcertados() {
        return golpesAcertados;
    }

    public void setGolpesAcertados(int golpesAcertados) {
        this.golpesAcertados = golpesAcertados;
    }

    public int getPeleasGanadas() {
        return peleasGanadas;
    }

    public void setPeleasGanadas(int peleasGanadas) {
        this.peleasGanadas = peleasGanadas;
    }

    @Override
    public double calcularRendimiento() {
        return (golpesAcertados * 0.5) + (peleasGanadas * 10);
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