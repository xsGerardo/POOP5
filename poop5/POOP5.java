package poop5;


public class POOP5 {

    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        /*alumno.nombre = "Gerardo";
        alumno.apellido = "Pliego";
        alumno.curso = "POO";
        alumno.edad = 19;
        alumno.promedio = 9.2f;
       
        System.out.println(alumno.nombre);
        System.out.println(alumno);
        System.out.println(alumno.toString());*/
       
        alumno.setNombre("Juan");
        System.out.println(alumno.getNombre());
       
        alumno.setApellido("Mendoza");
        System.out.println(alumno.getApellido());
       
        alumno.setCurso("POO");
        alumno.setEdad(19);
        alumno.setPromedio(9.2f);
        System.out.println(alumno);
       
        Alumno alumno2 = new Alumno();
        System.out.println(alumno2);
       
        Circulo circulo = new Circulo(7);
        System.out.println(circulo);
        System.out.println(circulo.getPerimetro());
        System.out.println(circulo.getArea());
       
        Fecha fNacimiento = new Fecha(28, "marzo", 2004);
        Alumno alumno3 = new Alumno ("Jose", "Perez", "POO", 19, 8.8f, true, fNacimiento);
        System.out.println(alumno3);
       
        Alumno alumno4 = new Alumno ("Pedro", "Ramirez", "POO", 20, 7.8f, false, new Fecha(8, "marzo", 2003));
        System.out.println(alumno4);
        
        Persona chofer = new Persona ("Martha", "Diaz", 22, 'M', "Izquiera adelante");
        Persona copiloto = new Persona ("Gerardo", "Pliego", 19, 'H', "Derecha adelante");
        Persona pasajero1 = new Persona ("Juan", "Perez", 21, 'H', "Izquierda atras");
        Persona pasajero2 = new Persona ("Ximena", "Gomez", 20, 'M', "Derecha atras");
        
        Coche coche1 = new Coche ("Audi", "RS5", "Rojo", 4, 21, chofer, copiloto, pasajero1, pasajero2);
        System.out.println(coche1);
    }
    
}
