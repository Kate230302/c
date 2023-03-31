package Tarea2;

//Se importa la librería
import java.time.LocalDate;

//Se crea la clase cEmpleado
public class cEmpleado {
    
    private int idEmpleado;
    private String nombre;
    private String apellidos;
    private int edad;
    private String puestoDesempenado;
    private LocalDate fechaIngreso;
    
    //Se crea e constructor con los parámetros
    public cEmpleado(int idEmpleado, String nombre, String apellidos, int edad, String puestoDesempenado, LocalDate fechaIngreso) {
        this.idEmpleado =  idEmpleado;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.puestoDesempenado = puestoDesempenado;
        this.fechaIngreso = fechaIngreso;
    }

    // Getters y setters
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPuestoDesempenado() {
        return puestoDesempenado;
    }

    public void setPuestoDesempenado(String puestoDesempenado) {
        this.puestoDesempenado = puestoDesempenado;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    
}
    

