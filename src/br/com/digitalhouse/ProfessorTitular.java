package br.com.digitalhouse;

public class ProfessorTitular extends Professores {

    private String especialidade;

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public ProfessorTitular(String nome, String sobrenome, Integer umTempoDeCasa, Integer codDePorfessor, String especialidade) {
        super(nome, sobrenome, umTempoDeCasa, codDePorfessor);
        this.especialidade = especialidade;
    }
}
