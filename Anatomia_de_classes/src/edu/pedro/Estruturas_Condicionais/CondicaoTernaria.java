package edu.pedro.Estruturas_Condicionais;

public class CondicaoTernaria {
    public static void main(String[] args) {
        int nota = 5;
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota <7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
}
