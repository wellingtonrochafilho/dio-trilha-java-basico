import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = scanner.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = scanner.nextInt();

		try {
			
			contar(parametroUm, parametroDois);

		} catch (ParametrosInvalidosException exception) {
			System.err.println("O segundo parâmetro deve ser maior que o primeiro");
		}

		scanner.close();

	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if (parametroUm < parametroDois) {
			int contagem = parametroDois - parametroUm;

			for (int n = 0; n <= contagem; n++) {
				System.out.print("Imprimindo o número " + n);
			}
		} else {
			throw new ParametrosInvalidosException();// caso os parametros não estejam de acordo com a verificação acima, o else chama a exceção personalizada, com a mensagem que já definimos no catch que está no main.
		}

	}

}