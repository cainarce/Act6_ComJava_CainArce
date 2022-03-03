public class Main {
    public static void main(String[] args) {

        double[] calificaciones = {98,79,85,83,100};

        Alumno alumno1 = new Alumno();
        alumno1.setNombreAlumno("Caín Omar Arce Aldapa");
        alumno1.setCalificaciones(calificaciones);

        System.out.println("Nombre: " + alumno1.getNombreAlumno());
        System.out.println(alumno1.getCalificaciones());
        System.out.println("Promedio: " + alumno1.getPromedio());
        System.out.println("Calificación " + alumno1.getCalificacionPromediada(alumno1.getPromedio()));

    }
}