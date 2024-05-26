
import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
        System.out.println("Seja bem vindo ao seu Banco! Vamos criar sua conta.");
         Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome e sobrenome:");
        String userName = scanner.nextLine();

        System.out.println("Por favor, digite o numero da Agencia:");
        String userAgency = scanner.next(); 

        System.out.println("Digite sua conta:");
        int userAccount = scanner.nextInt();

        System.out.println("Digite seu saldo:");
        double userBalance = 0.0;

        while (true) {
            if (scanner.hasNextDouble()) {
                userBalance = scanner.nextDouble();
                break; 
            } else {
                System.out.println("Por favor, insira um saldo válido:");
                scanner.next(); 
            }
        }
         

        System.out.print("Ola ".concat(userName) + ", obrigado por criar uma conta em nosso banco! " + "Sua agencia eh ".concat(userAgency) + ", conta " + userAccount + "e seu saldo " + userBalance + " ja esta disponivel para saque");

    }


}
