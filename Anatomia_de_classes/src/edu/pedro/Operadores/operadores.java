package edu.pedro.Operadores;

public class operadores {
    public static void main(String[] args) {
        int numero = 5;
        
        numero = - numero;

        System.out.println(numero);

        numero = + numero; //errado, lembre das regras matemáticas
    
        numero = numero * -1;

        System.out.println(numero);
        System.out.println(++ numero);
        System.out.println(-- numero);

        boolean variavel = true;

        System.out.println(!variavel);
        System.out.println(variavel);

        variavel = !variavel;

        System.out.println(variavel);

        //operadores ternarios, fazer execicios depois para memorizar

        int a, b;
        a = 5; 
        b = 6;
        
        String resultado = a==b ? "Igual":"Diferente";

        System.out.println(resultado);


        //operadores relacionais, exemplos de operadores >, <, >=, <=, != , entre outros. Lembre-se de sempre pesquisar ter conhecimento nunca é demais.
        int numero1, numero2;
        numero1 = 1;
        numero2 = 3;
        boolean simNao = numero1 == numero2;
        simNao = numero1 != numero2;
        
        System.out.println("Numero 1 é diferente ao numero 2 " + simNao);

        //operadores lógicos, exemplos && = e, || = ou e
    }

    
}
