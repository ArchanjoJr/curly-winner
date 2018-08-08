package estruturaHeranca;

public class Professor extends Pessoa {
    public int numeroMatricula;
    public String[] turmas;
    public Professor(String nome, int numeroMatricula){
        super(nome);
        this.numeroMatricula = numeroMatricula;
    }
    public void setTurmas(String[] turmas) {
        this.turmas = turmas;
    }
}
