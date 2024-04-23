package CoisasFaculdade;
import Pessoas.Aluno;
import Pessoas.Professor;

import java.util.*;
public class Ensalamento {
    public static List<Turma> turmas = new ArrayList<Turma>();

    public void criarEnsalamento(){
        // Professores
        Professor mia = new Professor("Mia", "POO");
        Professor saulo = new Professor("Saulo", "Estrutura de Dados");
        Professor paula = new Professor("Paula", "BI");

        // Disciplinas
        Disciplina poo = new Disciplina("POO", "TI");
        Disciplina ed = new Disciplina("Estrutura de Dados", "TI");
        Disciplina bi = new Disciplina("BI", "ADM");

        // Alunos
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Alfredo", "TI"));
        alunos.add(new Aluno("Amélia", "TI"));
        alunos.add(new Aluno("Ana", "ADM"));
        alunos.add(new Aluno("Bruno","TI"));
        alunos.add(new Aluno("Bentinho","ADM"));
        alunos.add(new Aluno("Capitú","TI"));
        alunos.add(new Aluno("Debra","TI"));
        alunos.add(new Aluno("Ian","ADM"));
        alunos.add(new Aluno("Iracema","TI"));
        alunos.add(new Aluno("Joelmir","ADM"));
        alunos.add(new Aluno("Julieta","TI"));
        alunos.add(new Aluno("Luana","ADM"));
        alunos.add(new Aluno("Luciana","TI"));
        alunos.add(new Aluno("Majô","ADM"));
        alunos.add(new Aluno("Maria","ADM"));
        alunos.add(new Aluno("Norberto", "TI"));
        alunos.add(new Aluno("Paulo","ADM"));
        alunos.add(new Aluno("Romeu","ADM"));
        alunos.add(new Aluno("Wendel","TI"));
        alunos.add(new Aluno("Zoey","TI"));
        List<Aluno> alunosPoo = new ArrayList<>();
        List<Aluno> alunosEd = new ArrayList<>();
        List<Aluno> alunosBi = new ArrayList<>();

        for (Aluno aluno : alunos){
            if (aluno.getCurso().equals("TI")){
                alunosPoo.add(aluno);
                alunosEd.add(aluno);
            } else {
                alunosBi.add(aluno);
            }
        }

        Turma turmaPOO = new Turma(mia, poo, alunosPoo);
        Turma turmaED = new Turma(saulo, ed, alunosEd);
        Turma turmaBI = new Turma(paula, bi, alunosBi);

        turmas.add(turmaPOO);
        turmas.add(turmaED);
        turmas.add(turmaBI);
    }

}
