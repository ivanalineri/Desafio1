package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String nome;
    private Integer codDeCurso;
    private ProfessorTitular professorTitular;
    private ProfessorAdjunto professorAdjunto;
    private Integer quantidadeMaximaDeAlunos;

    private List<Aluno> alunosMatriculados = new ArrayList<>();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodDeCurso() {
        return codDeCurso;
    }

    public void setCodDeCurso(Integer codDeCurso) {
        this.codDeCurso = codDeCurso;
    }

    public ProfessorTitular getProfessorTitular() {
        return professorTitular;
    }

    public void setProfessorTitular(ProfessorTitular professorTitular) {
        this.professorTitular = professorTitular;
    }

    public ProfessorAdjunto getProfessorAdjunto() {
        return professorAdjunto;
    }

    public void setProfessorAdjunto(ProfessorAdjunto professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }

    public Integer getQuantidadeMaximaDeAlunos() {
        return quantidadeMaximaDeAlunos;
    }

    public void setQuantidadeMaximaDeAlunos(Integer quantidadeMaximaDeAlunos) {
        this.quantidadeMaximaDeAlunos = quantidadeMaximaDeAlunos;
    }

    public List<Aluno> getAlunosMatriculados() {
        return alunosMatriculados;
    }

    public void setAlunosMatriculados(List<Aluno> alunosMatriculados) {
        this.alunosMatriculados = alunosMatriculados;
    }

    public Boolean adicionarUmAluno(Aluno umAluno) {
        if (this.getAlunosMatriculados().size() < quantidadeMaximaDeAlunos) {
            alunosMatriculados.add(umAluno);
            return true;
        } else {
            return false;
        }

    }

    public void excluirAluno(Aluno umAluno) {

        for (int i = 0; i < alunosMatriculados.size(); i++) {
            if (alunosMatriculados.contains(umAluno)) {
                alunosMatriculados.remove(umAluno);

            }
        }


    }

    public Curso(String nome, Integer codDeCurso, Integer quantidadeMaximaDeAlunos) {
        this.nome = nome;
        this.codDeCurso = codDeCurso;
        this.quantidadeMaximaDeAlunos = quantidadeMaximaDeAlunos;
    }
}
