package entities;

public class Medico {
    private Integer crm;
    private String nomeMedico;
    private Double precoConsulta;

    public Medico() {
    }

    public Medico(Integer crm, String nomeMedico, Double precoConsulta) {
        this.crm = crm;
        this.nomeMedico = nomeMedico;
        this.precoConsulta = precoConsulta;
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
  
}
