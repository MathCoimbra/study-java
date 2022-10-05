
public class ContaCorrente extends Conta {

	private double chequeEspecial = 2000;

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
		System.out.println(String.format("Valor padrão do cheque especial: %.2f", this.chequeEspecial));
	}

	public double getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}

	public double getSaldoDisponível() {
		return super.getSaldo() + getChequeEspecial();
	}

}
