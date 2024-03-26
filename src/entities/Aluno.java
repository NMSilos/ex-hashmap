package entities;

public class Aluno {

    private String matricula;
    private String nome;
    private String ra;
    private String curso;

    public Aluno(){
    }

    public Aluno(String matricula, String nome, String ra, String curso){
        this.matricula = matricula;
        this.nome = nome;
        this.ra = ra;
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nDADOS DO ALUNO:\n\n");
        sb.append("Nome........: " + nome + "\n");
        sb.append("RA..........: " + ra + "\n");
        sb.append("Curso.......: " + curso + "\n");
        sb.append("Matricula...: " + matricula);
        return sb.toString();
    }
}
