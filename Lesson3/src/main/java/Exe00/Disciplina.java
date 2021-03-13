package Exe00;

public class Disciplina {

    private String nome;
    private int cargaHr;
    //associação (relacionamento):
    private Professor professor;

    // START CONSTRUCTORS
    public Disciplina(String nome, int cargaHr, Professor professor) {
        this.setNome(nome);
        this.setCargaHr(cargaHr);
        this.setProfessor(professor);
    }

    public Disciplina() {
        this.nome = null;
        this.cargaHr = 0;
        this.professor = new Professor();
    }

    // END CONSTRUCTORS
    /*-----*/
    // START GETTERS + SETTERS
    public String getNome() {
        return nome;
    }

    public final void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHr() {
        return cargaHr;
    }

    public final void setCargaHr(int cargaHr) {
        this.cargaHr = cargaHr;
    }

    public Professor getProfessor() {
        return professor;
    }

    public final void setProfessor(Professor professor) {
        this.professor = professor;
    }

    // END GETTERS + SETTERS
    /*-----*/
    // OTHER METHODS
    public String mostra() {
        return "Disciplina{" + "nome=" + getNome() + ", cargaHr=" + getCargaHr() + ", professor=" + professor.mostra() + '}';
    }

}
