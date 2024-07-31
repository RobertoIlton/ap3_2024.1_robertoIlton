package br.com.roberto.aula3;

public class Aluno {

    String nome;
    double nota1;
    double nota2;
    double nota3;

    public String getNomeMaiusculo (){
        return nome.toUpperCase();
    }

    public String getNomeMinusculo(){
        return nome.toLowerCase();
    }

    public double getMedia(){
        return (nota1 + nota2 + nota3) / 3;
    }

    public boolean aprovadoMedia (){
        if (getMedia() >= 7);
            return true;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getNota1(){
        return nota1;
    }

    public void setNota1(double nota1){
        this.nota1 = nota1;
    }

    public double getNota2(){
        return nota2;
    }

    public void setNota2(double nota2){
        this.nota2 = nota2;
    }

    public double getNota3(){
        return nota3;
    }

    public void setNota3(double nota3){
        this.nota3 = nota3;
    }

    @Override
    public String toString() {
        return "Aluno [nome = " + nome + ", nota1 = " + nota1 + ", nota2 = " + nota2 + ", nota3 = " + nota3 + "]";
    }


}
        
