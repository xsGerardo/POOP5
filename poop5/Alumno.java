package poop5;

public class Alumno {
    private String nombre, apellido, curso;
    private int edad;
    private float promedio;
    private boolean inscrito;
    private Fecha fNacimiento;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, String curso, int edad, float promedio, boolean inscrito, Fecha fNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.edad = edad;
        this.promedio = promedio;
        this.inscrito = inscrito;
        this.fNacimiento = fNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public boolean isInscrito() {
        return inscrito;
    }

    public Fecha getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(Fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }
   
   
    public void dormir(){
        System.out.println("ZZZZ");
    }
   
    public void estudiar(){
        System.out.println("Estudiando...");
    }
   
    public void realizarTarea(){
        System.out.println("Realizando la tarea");
    }
   
    public void presentarExamen(){
        System.out.println("Haciendo examen");
    }
   
    public void tomarNotas(){
        System.out.println("Tomando notas");
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", curso=" + curso + ", edad=" + edad + ", promedio=" + promedio + ", inscrito=" + inscrito + ", fNacimiento=" + fNacimiento + '}';
    }
}
