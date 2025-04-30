
public class Problema3_InstitucionesEducativas {
    public String nombre;
    public String tipoinstitucion;
    public int numeroAlumnos;
    public int numeroDocentes;
    public int numeroSedes;
    public double gastosProyectosEstudiante;
    public double presupuesto;
    
    public void setNombre(String nombre){
            this.nombre = nombre;
    }            
    public String getNombre(){
        return nombre;
    }
    public void setTipoInstitucion (String tipoinstitucion){
        this.tipoinstitucion = tipoinstitucion;
    }
    public String getTipoInstitucion(){
        return tipoinstitucion;
    }
    public void setNumeroAlumnos ( int numeroAlumnos){
        this.numeroAlumnos = numeroAlumnos;
    }
    public int getNumeroAlumnos (){
        return numeroAlumnos;
    }
    public void setNumeroDocentes ( int numeroDocentes){
        this.numeroDocentes = numeroDocentes;
    }
    public int getNumeroDocentes (){
        return numeroDocentes;
    }
    public void setNumeroSedes (int numeroSedes){
        this.numeroSedes = numeroSedes;
    }
    public int getNumeroSedes(){
        return numeroSedes;
    }
    public void setGastosProyectosEstudiante ( double gastosProyectosEstudiante){
        this.gastosProyectosEstudiante = gastosProyectosEstudiante;
    }
    public double getGastosProyectosEstudiante (){
        return gastosProyectosEstudiante;
    }
    public void setPresupuesto (double presupuesto){
        this.presupuesto = presupuesto;
    }
    public double getPresupuesto (){
        return presupuesto;
    }
}