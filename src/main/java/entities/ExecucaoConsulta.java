package entities;

public class ExecucaoConsulta {
    private Integer id;
    private AgendaConsulta agendaConsulta;
    private String diagnostico;

    public ExecucaoConsulta() {
    }

    public ExecucaoConsulta(Integer id, AgendaConsulta agendaConsulta, String diagnostico) {
        this.id = id;
        this.agendaConsulta = agendaConsulta;
        this.diagnostico = diagnostico;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public AgendaConsulta getAgendaConsulta() {
        return agendaConsulta;
    }

    public void setAgendaConsulta(AgendaConsulta agendaConsulta) {
        this.agendaConsulta = agendaConsulta;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

}
