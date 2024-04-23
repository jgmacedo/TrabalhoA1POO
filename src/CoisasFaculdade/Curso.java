package CoisasFaculdade;
import java.util.List;

public class Curso {
    private String nome;
    private List<Disciplina> disciplinas;

    public Curso(String nome, List<Disciplina> disciplinas) {
        this.nome = nome;
        this.disciplinas = disciplinas;
    }

    // Getters e setters omitidos para brevidade
    public String getCurso(){
        return nome;
    }
}