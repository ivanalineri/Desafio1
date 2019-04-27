package br.com.digitalhouse;

public class Professores {
    private String nome;
    private String sobrenome;
    private Integer umTempoDeCasa;
    private Integer codDePorfessor;

    public Professores(String nome, String sobrenome, Integer umTempoDeCasa, Integer codDePorfessor) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.umTempoDeCasa = umTempoDeCasa;
        this.codDePorfessor = codDePorfessor;
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

    public Integer getUmTempoDeCasa() {
        return umTempoDeCasa;
    }

    public void setUmTempoDeCasa(Integer umTempoDeCasa) {
        this.umTempoDeCasa = umTempoDeCasa;
    }

    public Integer getCodDePorfessor() {
        return codDePorfessor;
    }

    public void setCodDePorfessor(Integer codDePorfessor) {
        this.codDePorfessor = codDePorfessor;
    }




}
