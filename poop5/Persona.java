package poop5;

class Persona {
    private String nombre, apellido;
    private int edad;
    private char genero;
    private String posicion;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, char genero, String posicion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", genero=" + genero + ", posicion=" + posicion + '}';
    }
    
}
