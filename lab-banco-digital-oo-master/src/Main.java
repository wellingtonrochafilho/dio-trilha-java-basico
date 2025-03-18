
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.depositar(100);
		cc.depositar(100);
		cc.depositar(100);
		cc.sacar(250);
		cc.transferir(100, poupanca);
		cc.transferir(100, poupanca);
		cc.transferir(100, poupanca);
		cc.transferir(100, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
