package br.com.roberto.aula3;

public class TestAluno {

    public static void main(String[] args) {

        Aluno roberto = new Aluno();
        roberto.setNome("Roberto Ilton");
        roberto.setNota1(10);
        roberto.setNota2(7);
        roberto.setNota3(5);
        System.out.println();
        System.out.println(roberto);

        if (roberto.aprovadoMedia())
            System.out.println("Passou por média!");
        else
            System.out.println("Ixe, reprovou pq tirou " + roberto.getMedia());
    }

}
