
public class Main {

	public static void main(String[] args) {
		Cliente math = new Cliente();
		math.setNome("Math");
		
		Conta cc = new ContaCorrente(math);
		Conta poupanca = new ContaPoupanca(math);

		cc.depositar(1000);
		cc.transferir(50, poupanca);
		cc.setTipoPessoa("PJ");
		poupanca.setTipoPessoa("PF");
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
