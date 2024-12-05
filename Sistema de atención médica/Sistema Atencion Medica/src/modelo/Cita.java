package modelo;

public class Cita {
    private String id;
    private String idPaciente;
    private String idMedico;
    private String fecha;

    public Cita(String id, String idPaciente, String idMedico, String fecha) {
        this.id = id;
        this.idPaciente = idPaciente;
        this.idMedico = idMedico;
        this.fecha = fecha;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(String idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(String idMedico) {
        this.idMedico = idMedico;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Cita{" +
                "id='" + id + '\'' +
                ", idPaciente='" + idPaciente + '\'' +
                ", idMedico='" + idMedico + '\'' +
                ", fecha='" + fecha + '\'' +
                '}';
    }
}