public class Ciclista extends Atleta {

    private double kilometrosRecorridos;
    private double tiempoHoras;

    public Ciclista() {
    }

    public Ciclista(String nombre, int edad, double horasEntrenamiento,
                    double kilometrosRecorridos, double tiempoHoras) {
        super(nombre, edad, horasEntrenamiento);
        this.kilometrosRecorridos = kilometrosRecorridos;
        this.tiempoHoras = tiempoHoras;
    }

    public double getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public void setKilometrosRecorridos(double kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    public double getTiempoHoras() {
        return tiempoHoras;
    }

    public void setTiempoHoras(double tiempoHoras) {
        this.tiempoHoras = tiempoHoras;
    }

    @Override
    public double calcularRendimiento() {
        return kilometrosRecorridos / tiempoHoras;
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