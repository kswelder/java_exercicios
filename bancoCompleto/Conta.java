class Conta {
	Cliente cliente;
	Data data;
	String agencia = "";
	String conta = "";
	double saldo = 0;

	Conta(String nome) {
		data = new Data();
	}
	/*
	Conta(String nome, double novoSaldo) {
		this(nome);
		depositar(novoSaldo);
	}
	*/
	public boolean depositar(double valor) {
		if(valor > 0) {
			this.saldo += valor;
			return true;
		}
		else {
			return false;
		}
	}
	public boolean sacar(double valor) {
		if(valor > 0 && valor < this.saldo) {
			this.saldo -= valor;
			return true;
		}
		else {
			return false;
		}
	}
	public boolean transferir(Conta novaConta, double valor) {
		if(valor > 0) {
			novaConta.depositar(valor);
			this.saldo -= valor;
			return true;
		}
		else {
			return false;
		}
	}
}
