package entities;

public class Medico {
    private Integer crm;
    private String nomeMedico;
    private Double precoConsulta;
    private Especialidade especialidade;

    public Medico() {
    }

    public Medico(Integer crm, String nomeMedico, Double precoConsulta, Especialidade especialidade) {
        this.crm = crm;
        this.nomeMedico = nomeMedico;
        this.precoConsulta = precoConsulta;
        this.especialidade = especialidade;
    }

    public Integer getCrm() {
        return crm;
    }

    public void setCrm(Integer crm) {
        this.crm = crm;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public Double getPrecoConsulta() {
        return precoConsulta;
    }

    public void setPrecoConsulta(Double precoConsulta) {
        this.precoConsulta = precoConsulta;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }
  
}
