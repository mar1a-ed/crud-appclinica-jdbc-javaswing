package entities;

public class Especialidade {
    private Integer idEspecialidade;
    private String nome;

    public Especialidade() {
    }

    public Especialidade(Integer idEspecialidade, String nome) {
        this.idEspecialidade = idEspecialidade;
        this.nome = nome;
    }

    public Integer getIdEspecialidade() {
        return idEspecialidade;
    }

    public void setIdEspecialidade(Integer idEspecialidade) {
        this.idEspecialidade = idEspecialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
