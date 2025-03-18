import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	protected List<Double> transacoes = new ArrayList<>();

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	@Override
	public void sacar(double valor) {
		if (validaSaldo(valor)) {
			saldo -= valor;
			transacoes.add(-valor);
		}else{
			System.out.println("Saldo insuficiente");
			}

	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
		transacoes.add(valor);
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		if(validaSaldo(valor)) {
			this.sacar(valor);
			contaDestino.depositar(valor);
		}else{
			System.out.println("Saldo insuficiente");
		}
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
		System.out.println("Histórico de Transações:");
		transacoes.forEach(this::imprimirTransacao);
	}

	protected void imprimirTransacao(double value) {
		if (value>=0){
			System.out.printf("Entrada: %.2f%n", value);
		}else{
			System.out.printf("Saída: %.2f%n", -value);
		}
	}

	protected boolean validaSaldo(double valor){
		return saldo > valor;
	}
}
