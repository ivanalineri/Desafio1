package br.com.digitalhouse;

public class ProfessorAdjunto extends Professores {

    private Integer quantDeHorasDeMonitoria;



    public Integer getQuantDeHorasDeMonitoria() {
        return quantDeHorasDeMonitoria;
    }

    public void setQuantDeHorasDeMonitoria(Integer quantDeHorasDeMonitoria) {
        this.quantDeHorasDeMonitoria = quantDeHorasDeMonitoria;
    }

    public ProfessorAdjunto(String nome, String sobrenome, Integer umTempoDeCasa, Integer codDePorfessor, Integer quantDeHorasDeMonitoria) {
        super(nome, sobrenome, umTempoDeCasa, codDePorfessor);
        this.quantDeHorasDeMonitoria = quantDeHorasDeMonitoria;
    }
}
