package br.com.digitalhouse;

public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Ivan", "Alineri", 1234);
        Aluno aluno2 = new Aluno("Diego", "Almeida", 1235);
        Aluno aluno3 = new Aluno("Otavio", "Teixeira", 1236);
        Aluno aluno4 = new Aluno("Jessica", "Gibson", 1236);
        Aluno aluno5 = new Aluno("Carla", "Fender", 1236);

        //Adicionar Professor.
        ProfessorTitular professorTitular1 = new ProfessorTitular("Tairo", "Roberto", 2, 1324, "Android/Java");
        ProfessorTitular professorTitular2 = new ProfessorTitular("Jessica", "Millena", 2, 1325, "POO");
        ProfessorAdjunto professorAdjunto1 = new ProfessorAdjunto("Vini", "PHP", 1, 1322, 12);
        ProfessorAdjunto professorAdjunto2 = new ProfessorAdjunto("Hendy", "PHP", 1, 1322, 15);
        //Adicionar Curso
        Curso curso1 = new Curso("Full Stack", 20001, 3);
        Curso curso2 = new Curso("Android", 20002, 2);
        // Adicionando professores
        curso1.setProfessorAdjunto(professorAdjunto1);
        curso1.setProfessorTitular(professorTitular1);
        curso2.setProfessorTitular(professorTitular2);
        curso2.setProfessorAdjunto(professorAdjunto2);
        // Adicionando Alunos curso Full Stack
        curso1.adicionarUmAluno(aluno1);
        curso1.adicionarUmAluno(aluno2);
        // Adicionando Alunos curso Android
        curso2.adicionarUmAluno(aluno3);
        curso2.adicionarUmAluno(aluno4);
        curso2.adicionarUmAluno(aluno5);


    }
}
