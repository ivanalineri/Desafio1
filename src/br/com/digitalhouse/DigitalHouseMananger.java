package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DigitalHouseMananger {

    private List<Aluno> alunos = new ArrayList<>();
    private List<Professores> professores = new ArrayList<>();
    private List<Curso> cursos = new ArrayList<>();
    private List<Matricula> matriculas = new ArrayList<>();


    public void registrarCurso(String nome, Integer codigoDeCurso, Integer quantidadeMaximaDeAlunos) {
        Curso curso = new Curso(nome,codigoDeCurso,quantidadeMaximaDeAlunos);
        cursos.add(curso);
    }

    public void excluirCurso(Integer codigoCurso) {
        if(cursos.size() > 0){
            for( int i = 0; i < cursos.size(); i++){
                if(codigoCurso.equals(cursos.get(i).getCodDeCurso())){
                    cursos.remove(cursos.get(i));
                }
            }
        }


    }

    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codigoProfessor, Integer quantidadeDeHoras, Integer quantDeHorasDeMonitoria) {
    ProfessorAdjunto professorAdjunto = new ProfessorAdjunto(nome, sobrenome,codigoProfessor,quantidadeDeHoras,quantDeHorasDeMonitoria);
        professores.add(professorAdjunto);
    }

    public void registrarProfessorTitular(String nome, String sobrenome, Integer umTempoDeCasa, Integer codigoProfessor, String especialidade) {
    ProfessorTitular professorTitular = new ProfessorTitular(nome,sobrenome,umTempoDeCasa,codigoProfessor,especialidade);
    professores.add(professorTitular);
    }

    public void excluirProfessor(Integer codigoProfessor) {

        if(professores.size() > 0){
            for( int i = 0; i < professores.size(); i++){
                if(codigoProfessor.equals(professores.get(i).getCodDePorfessor())){
                    professores.remove(professores.get(i));
                }
            }
        }

    }

    public void matricularAluno(String nome, String sobrenome, Integer codigoAluno){
        Aluno aluno = new Aluno(nome,sobrenome,codigoAluno);
        alunos.add(aluno);

    }

    public void matricularAluno(Integer codigoAluno, Integer codigoCurso){
        Aluno aluno= null;
        Curso curso = null;
        for (Aluno value : alunos) {
            if (codigoAluno.equals(value.getCodDeAluno())) {
                aluno = value;
            }
        }
        for (Curso value : cursos) {
            if (codigoCurso.equals(value.getCodDeCurso())) {
                curso = value;
            }
        }


        List<Aluno> alunosMatriculados = curso.getAlunosMatriculados();
        if(alunosMatriculados.size() < curso.getQuantidadeMaximaDeAlunos()){
            Matricula matricula = new Matricula(aluno,curso, new Date());
            matriculas.add(matricula);
            System.out.println("matricula efetuada com sucesso");
        }else {
            System.out.println("Infelizmente não foi possível fazer a matrícula");
        }


    }

    public void alocarProfessores(Integer codigoCurso, Integer codigoProfessorTitular, Integer codigoProfessorAdjunto){
        ProfessorTitular professorTitular = null;
        ProfessorAdjunto professorAdjunto = null;
        Curso curso = null;
        if(professores.size() > 0){
            for( int i = 0; i < professores.size(); i++){
                if(codigoProfessorAdjunto.equals(professores.get(i).getCodDePorfessor())){
                    professorAdjunto = (ProfessorAdjunto) professores.get(i);

                }
                if(codigoProfessorTitular.equals(professores.get(i).getCodDePorfessor())){
                   professorTitular = (ProfessorTitular) professores.get(i);
                }
            }
        }

        if (cursos.size() >0 ){
            for (int i = 0; i < cursos.size(); i++) {
                 if(codigoCurso.equals(cursos.get(i).getCodDeCurso())){
                     curso = cursos.get(i);
                 }
            }
        }

        curso.setProfessorTitular(professorTitular);
        curso.setProfessorAdjunto(professorAdjunto);
    }
}

