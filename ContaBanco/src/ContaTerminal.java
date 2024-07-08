import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o Numero da sua conta?");
        int Numero = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Qual é a Agencia da sua conta?");
        String Agencia = scanner.nextLine();

        System.out.println("Qual seu nome?");
        String Cliente = scanner.nextLine();

        System.out.println("Seu saldo é ");
        double Saldo = scanner.nextDouble();

        System.out.println("Olá" + Cliente + " , obrigado por criar uma conta em nosso banco, sua agência é " + Agencia
                + " , conta" + Numero + " e seu saldo " + Saldo + " já está disponível para saque");

        scanner.close();
    }
}
