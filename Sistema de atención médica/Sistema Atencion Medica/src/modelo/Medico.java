package modelo;

public class Medico {
    private String nombre;
    private String especialidad;
    private String id;

    public Medico(String nombre, String especialidad, String id) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "nombre='" + nombre + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}