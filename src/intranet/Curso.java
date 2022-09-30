package intranet;
import java.util.*;
public class Curso {
    private List<Alumno> alumnos;
    public Curso(){
        this.alumnos = new ArrayList<Alumno>();
    }
    public Alumno agregarAlumno(String nombre,String apellido, String rut, String matricula){
        Alumno alumno = new Alumno(nombre,apellido,rut,matricula);
        this.alumnos.add(alumno);
        return alumno;
    }
    public boolean removerAlumno(String nombre, String apellido, String rut, String matricula){
        for(Alumno alumno: this.alumnos){
            if (alumno.getnombre().equals(nombre) && alumno.getapellidos().equals(apellido) && alumno.getrut().equals(rut) && alumno.getmatricula().equals(matricula)){
                this.alumnos.remove(alumno);
                return true;
            }
        }
        return false;
    }

    public void modificarRutAlumno(String nombre, String apellido,String matricula, String rut){
        for(Alumno alumno: this.alumnos){
            if(alumno.getnombre().equals(nombre) && alumno.getapellidos().equals(apellido) && alumno.getmatricula().equals(matricula)){
                alumno.setRut(rut);
                break;
            }
        }
    }
    public void modificarMatriculaAlumno(String nombre, String apellido, String rut,String matricula){
        for(Alumno alumno: this.alumnos){
            if(alumno.getnombre().equals(nombre) && alumno.getapellidos().equals(apellido) && alumno.getrut().equals(rut)){
                alumno.setmatricula(matricula);
                break;
            }
        }
    }
    public void modificarNombreAlumno(String nombre, String apellido, String rut,String matricula){
        for(Alumno alumno: this.alumnos){
            if(alumno.getapellidos().equals(apellido) && alumno.getrut().equals(rut) && alumno.getmatricula().equals(matricula)){
                alumno.setnombre(nombre);
                break;
            }
        }
    }
    public void modificarApellidoAlumno(String nombre, String apellido, String rut,String matricula){
        for(Alumno alumno: this.alumnos){
            if(alumno.getnombre().equals(nombre) && alumno.getrut().equals(rut) && alumno.getmatricula().equals(matricula)){
                alumno.setapellidos(apellido);
                break;
            }
        }
    }

}
