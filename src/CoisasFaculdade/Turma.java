package CoisasFaculdade;

import CoisasFaculdade.Disciplina;
import Pessoas.Aluno;
import Pessoas.Professor;
import java.util.*;

public class Turma {
    private Professor professor;
    private Disciplina disciplina;
    private List<Aluno> alunos;

    public Turma(Professor professor, Disciplina disciplina, List<Aluno> alunos) {
        this.professor = professor;
        this.disciplina = disciplina;
        this.alunos = alunos;
    }

    public String getProfessor() {
        return professor.getNome();
    }
    public String getDisciplina(){return disciplina.getNome();}
    public List<Aluno> getAlunos(){
        return alunos;
    }

}
