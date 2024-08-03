package br.com.roberto.aula4;

import java.util.LinkedList;

public class TestaListaAlunos {


    public static void main(String[] args) {

       

        LinkedList<Aluno> osAlunos = new LinkedList<Aluno>();
        
        
        for (int i = 0; i < 89764; i++) {
            Aluno oAluno = new Aluno();
                oAluno.setNome("Aluno"+i);
                osAlunos.add(oAluno);

        }

        System.out.println("Imprima a lista dos Alunos :");
        for (Aluno oAluno : osAlunos) {
            System.out.println(oAluno);
            
        }
        


    }

}
