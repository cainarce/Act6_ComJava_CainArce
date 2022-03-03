public class Alumno {

    public String nombreAlumno;
    public double calificaciones[] = new double[5];

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public void setCalificaciones(double[] calificaciones) {
        this.calificaciones = calificaciones;
    }

    public String getNombreAlumno(){
        return nombreAlumno;
    }

    public String getCalificaciones(){
        String calif = "";

        for(int i=0;i<calificaciones.length;i++){
            if(i != calificaciones.length-1){
                calif += "Calificación " + (i+1) + ": " + calificaciones[i] + "\n";
            } else {
                calif += "Calificación " + (i+1) + ": " + calificaciones[i];
            }
        }

        return calif;
    }

    public double getPromedio(){
        double sumaCalif = 0;
        double promedioCalif = 0;

        for(int i=0;i<calificaciones.length;i++){
            sumaCalif += calificaciones[i];
        }

        promedioCalif = sumaCalif / calificaciones.length;

        return promedioCalif;
    }

    public String getCalificacionPromediada(double promedioCalif){
        if (promedioCalif <= 50) {
            return "F";
        } else if (promedioCalif >= 51 && promedioCalif <= 60) {
            return "E";
        } else if (promedioCalif >= 61 && promedioCalif <= 70) {
            return "D";
        } else if (promedioCalif >= 71 && promedioCalif <= 80) {
            return "C";
        } else if (promedioCalif >= 81 && promedioCalif <= 90) {
            return "B";
        } else if (promedioCalif >= 91 && promedioCalif <= 100) {
            return "A";
        } else {
            return "Error";
        }
    }

}
