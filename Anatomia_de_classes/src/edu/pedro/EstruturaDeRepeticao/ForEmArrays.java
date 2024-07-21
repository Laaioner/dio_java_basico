package edu.pedro.EstruturaDeRepeticao;

public class ForEmArrays {
    public static void main(String[] args) {
        String aluno[] = {"Felipe", "Jonas", "Julia", "Marcos"};

        for ( int i = 0; i <aluno.length; i++){
            System.out.println("O aluno de indice x=" + i + " é " + aluno[i]);
        }

        //forma abreviada
        for (String alunos : aluno){
            System.out.println("Nome do aluno é " + alunos);
        }
    }
    
}
