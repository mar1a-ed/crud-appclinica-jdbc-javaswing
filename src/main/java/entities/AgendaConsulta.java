package entities;

import java.time.LocalDate;

public class AgendaConsulta {
    private Integer id;
    private Paciente paciente;
    private Medico crmMedico;
    private LocalDate dataConsulta;
    private String statusConsulta;

    public AgendaConsulta() {
    }

    public AgendaConsulta(Integer id, Paciente paciente, Medico crmMedico, LocalDate dataConsulta, String statusConsulta) {
        this.id = id;
        this.paciente = paciente;
        this.crmMedico = crmMedico;
        this.dataConsulta = dataConsulta;
        this.statusConsulta = statusConsulta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getCrmMedico() {
        return crmMedico;
    }

    public void setCrmMedico(Medico crmMedico) {
        this.crmMedico = crmMedico;
    }

    public LocalDate getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(LocalDate dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public String getStatusConsulta() {
        return statusConsulta;
    }

    public void setStatusConsulta(String statusConsulta) {
        this.statusConsulta = statusConsulta;
    }
 
}
