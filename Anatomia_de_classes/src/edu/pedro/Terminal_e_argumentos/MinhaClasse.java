package edu.pedro.Terminal_e_argumentos;

import java.util.Scanner;

public class MinhaClasse {
    public static void main(String[] args) {
       	Scanner sc = new Scanner(System.in);
		
		int A, B, PROD;
		
		System.out.println("Digite o valor de A: ");
		A = sc.nextInt();
		
		System.out.println("Digite o valor de B: ");
		B = sc.nextInt();
		 //TODO: Complete os espaços em branco com uma possível solução para o desafio 
		PROD = A * B;

		System.out.println("PROD = " +  PROD   );
	
    }
}
