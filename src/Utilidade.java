import CoisasFaculdade.*;
import Pessoas.*;

import java.util.*;

public class Utilidade {
    public static void exibirEnsalamento(){
        for (Turma turma : Ensalamento.turmas){
            System.out.println("Professor: " + turma.getProfessor());
            System.out.println("Disciplina: " + turma.getDisciplina());
            System.out.println("Alunos: ");
            for (Aluno aluno : turma.getAlunos()){
                System.out.print(aluno.getNome() + ", ");
            }
            System.out.println("\n");
        }
    }

}
