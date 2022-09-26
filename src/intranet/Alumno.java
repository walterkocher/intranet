package intranet;

public class Alumno {
    private String nombre;
    private String apellidos;
    private String rut;
    private String matricula;

    //contructor
    public Alumno (String nombre, String apellidos, String rut, String matricula){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.rut=rut;
        this.matricula=matricula;
    }
    
    public void setnombre (String valorNombre){
        nombre = "nombre" + valorNombre;
    }

    public void setapellidos (String valorApellidos){
        apellidos = "apellidos" + valorApellidos;
    }

    public void setRut (String valorRut){
        rut = valorRut;
    }

    public void setmatricula (String valorMatricula){
        matricula = valorMatricula;
    }

    public String getnombre (String s){ return nombre; }

    public String getapellidos (String s) { return apellidos; }

    public String getrut (String s) { return rut; }

    public String getmatricula (String s) { return matricula; }


}
