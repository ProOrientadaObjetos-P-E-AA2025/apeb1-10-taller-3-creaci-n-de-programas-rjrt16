
public class Problema3_Ejecutar {
    public static void main(String[] args) {
        String nombre = "Apc";
        String tipo = "Privada";
        int al = 100;
        int dc = 30;
        int sedes = 2;
        double preAlumnos = 20;
        double presupuesto = 50000;
        Problema3_InstitucionesEducativas colegio = new Problema3_InstitucionesEducativas();
        colegio.setNombre(nombre);
        colegio.setTipoInstitucion(tipo);
        colegio.setNumeroAlumnos(al);
        colegio.setNumeroDocentes(dc);
        colegio.setNumeroSedes(sedes);
        colegio.setGastosProyectosEstudiante(preAlumnos);
        colegio.setPresupuesto(presupuesto);
        
        System.out.println("");
        System.out.println("-------------------------------");
        System.out.println("La institucion educativa " + colegio.getNombre() + " de tipo " + colegio.getTipoInstitucion());
        System.out.println("Tiene: ");
        System.out.println("" + colegio.getNumeroAlumnos() + " alumnos");
        System.out.println("" + colegio.getNumeroDocentes() + " docentes");
        System.out.println("" + colegio.getNumeroSedes() + " aulas");
        System.out.println("" + colegio.getGastosProyectosEstudiante()+" presupuesto alumno");
        System.out.println("" + colegio.getPresupuesto()+" presupuesto colegio");        
    }
}
