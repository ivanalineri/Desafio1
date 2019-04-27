package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseMananger {

    private List<Aluno> alunos = new ArrayList<>();
    private List<Professores> professores = new ArrayList<>();
    private List<Curso> cursos = new ArrayList<>();
    private List<Matricula> matriculas = new ArrayList<>();


    public void registrarCurso(String nome, Integer codigoDeCurso, Integer quantidadeMaximaDeAlunos) {

    }

    public void excluirCurso(Integer codigoCurso) {

    }

    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codigoProfessor, Integer quantidadeDeHoras) {

    }

    public void registrarProfessorTitular(String nome, String sobrenome, Integer codigoProfessor, String especialidade) {


    }

    public void excluirProfessor(Integer codigoProfessor) {

    }

    public void regitrarAluno(String nome, String sobrenome, Integer codigoAluno){

    }

    public void matricularAluno(Integer codigoAluno, Integer codigoCurso){

    }

    public void alocarProfessores(Integer codigoCurso, Integer codigoProfessorTitular, Integer codigoProfessorAdjunto){

    }
}

