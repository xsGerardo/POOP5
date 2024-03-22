package poop5;

public class Coche {
    private String marca, modelo, color;
    private int numeroPuertas, tamanoRin;
    private Persona chofer, copiloto, pasajero1, pasajero2;

    public Coche() {
    }

    public Coche(String marca, String modelo, String color, int numeroPuertas, int tamanoRin, Persona chofer, Persona copiloto, Persona pasajero1, Persona pasajero2) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.numeroPuertas = numeroPuertas;
        this.tamanoRin = tamanoRin;
        this.chofer = chofer;
        this.copiloto = copiloto;
        this.pasajero1 = pasajero1;
        this.pasajero2 = pasajero2;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getTamanoRin() {
        return tamanoRin;
    }

    public void setTamanoRin(int tamanoRin) {
        this.tamanoRin = tamanoRin;
    }

    public Persona getChofer() {
        return chofer;
    }

    public void setChofer(Persona chofer) {
        this.chofer = chofer;
    }

    public Persona getCopiloto() {
        return copiloto;
    }

    public void setCopiloto(Persona copiloto) {
        this.copiloto = copiloto;
    }

    public Persona getPasajero1() {
        return pasajero1;
    }

    public void setPasajero1(Persona pasajero1) {
        this.pasajero1 = pasajero1;
    }

    public Persona getPasajero2() {
        return pasajero2;
    }

    public void setPasajero2(Persona pasajero2) {
        this.pasajero2 = pasajero2;
    }
    
    
    public void encender(){
        System.out.println("Encendiendo el coche");
    }
    
    public void apagar(){
        System.out.println("Apagando el coche");
    }
    
    public void avanzar(){
        System.out.println("El coche esta avanzando");
    }
    
    public void frenar(){
        System.out.println("Frenando...");
    }
    
    public void prenderLuces(){
        System.out.println("Esta obscuro, prendiendo las luces");
    }

    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", numeroPuertas=" + numeroPuertas + ", tamanoRin=" + tamanoRin + ", chofer=" + chofer + ", copiloto=" + copiloto + ", pasajero1=" + pasajero1 + ", pasajero2=" + pasajero2 + '}';
    }
    
}
