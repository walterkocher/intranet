package intranet;
import java.util.*;
public class Curso {
    private List<Alumno> alumnos;
    public Curso(){
        this.alumnos = new ArrayList<Alumno>();
    }
    public Alumno agregarAlumno(String nombre,String apellido, String rut, String matricula){
        Alumno alumno = new Alumno(nombre,apellido,rut,apellido);
        this.alumnos.add(alumno);
        return alumno;
    }
    public void eliminarAlumno(Alumno alumno){
        this.alumnos.remove(alumno);

    }
    public boolean removerAlumno(String nombre, String rut){
        for(Alumno alumno: this.alumnos){
            if (alumno.getnombre().equals(nombre) && alumno.getrut().equals(rut)){
                this.alumnos.remove(alumno);
                return true;
            }
        }
        return false;
    }
}
