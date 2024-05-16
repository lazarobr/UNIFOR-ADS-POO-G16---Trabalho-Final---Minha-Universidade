// Q1 (continuação): Crie uma classe “Disciplina” com os atributos
//como “codigo”, “nome” e “semestre”.
public class Disciplina {
    private String codigo;
    private String nome;
    private int semestre;

    public Disciplina(String codigo, String nome, int semestre) {
        this.codigo = codigo;
        this.nome = nome;
        this.semestre = semestre;
    }
// getters e setters das disciplinas
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

}
