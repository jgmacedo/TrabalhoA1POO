package Pessoas;


import Pessoas.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
    private String curso;
    public Aluno(String nome, String curso){
        super(nome);
        this.curso = curso;
    }
    List<Aluno> alunosList = new ArrayList<Aluno>();

    public String getCurso() {
        return curso;
    }

}
