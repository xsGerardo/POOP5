package poop5;

class Fecha {
    private int dia, anio;
    private String mes;

    public Fecha() {
    }

    public Fecha(int dia, String mes, int anio) {
        this.dia = dia;
        this.anio = anio;
        this.mes = mes;
    }

    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", anio=" + anio + ", mes=" + mes + '}';
    }
}
