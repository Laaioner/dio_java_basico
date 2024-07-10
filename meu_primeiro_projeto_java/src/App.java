import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
		
        int A, B, PROD;
		
        A = -30;
        B = 10;
		
        // Calcular o produto de A e B
        PROD = A * B;  

        // Exibir o resultado
        System.out.println("PROD = " + PROD);

        // Fechar o scanner
        sc.close();
    }
}
