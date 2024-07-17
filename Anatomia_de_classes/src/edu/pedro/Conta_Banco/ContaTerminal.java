package edu.pedro.Conta_Banco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

    //TODO(PARA FAZER): Conhecer e importar classe Scanner

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int numero;
        double saldo;
        String agencia, nomeCliente;

    //Exibir as mensagens para nosso usuario
    //Obter pela scanner os valores digitados no terminal

        System.out.println("Por favor, digite seu nome: ");
        nomeCliente= sc.nextLine();
        
        System.out.println("Por favor, digite o número da agência: ");
        agencia= sc.nextLine();

        System.out.println("Por favor, digite o numero da conta: ");
        numero = sc.nextInt();

        System.out.println("Por favor, digite seu saldo: ");
        saldo = sc.nextDouble();

        //Exibir a mensagem conta criada

        System.out.println("Olá " + nomeCliente + " ,obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque" );
        
    }
}
