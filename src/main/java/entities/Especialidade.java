package entities;

public class Especialidade {
    private Integer idEspecialidade;
    private String nome;
    private String desc;
    
    public Especialidade() {
    }

    public Especialidade(String nome, String desc){
        this.nome = nome;
        this.desc = desc;
    }
    
    public Especialidade(Integer idEspecialidade, String nome, String desc) {
        this.idEspecialidade = idEspecialidade;
        this.nome = nome;
        this.desc = desc;
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return nome;
    }
    
}
