package br.com.digitalhouse;

public class Aluno {
    private String nome;
    private String sobrenome;
    private Integer codDeAluno;

    public Aluno() {
    }

    public Aluno(String nome, String sobrenome, Integer codDeAluno) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.codDeAluno = codDeAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getCodDeAluno() {
        return codDeAluno;
    }

    public void setCodDeAluno(Integer codDeAluno) {
        this.codDeAluno = codDeAluno;
    }
}
