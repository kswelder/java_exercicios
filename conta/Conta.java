import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

class Conta {
	private String titular = "";
	private String agencia = "";
	private String conta = "";
	private double saldo = 0;
	private String data = "";
	private static int totalDeContas = 0;
	
	Conta (String valor) {
		this.setTitular(valor);
		this.agencia = "0001";
		this.conta = "4589324" + Integer.toString(10001 + totalDeContas);
		this.saldo = 0;
		this.data = this.novaData();
		totalDeContas += 1;
	}

	Conta (String novoTitular, double novoSaldo) {
		this(novoTitular);
		this.depositar(novoSaldo);
	}

	public void setTitular(String novoTitular) {
		this.titular = novoTitular;
	}

	private String novaData() {
		DateFormat df = new SimpleDateFormat();
		Date dt = new Date();
		return df.format(dt);
	}

	public boolean depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
			return true;
		}
		else {
			return false;
		}
	}
	public boolean sacar(double valor) {
		if(valor <= this.saldo) {
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

	public double rendimento() {
		return this.saldo * 0.1;
	}
	
	public String getTitular() {
		return this.titular;
	}
	public String getAgencia() {
		return this.agencia;
	}
	public String getConta() {
		return this.conta;
	}
	public double getSaldo() {
		return this.saldo;
	}
	public String getData() {
		return this.data;
	}
	public String imprimir() {
		String dados = "Titular: " + this.titular + "\nAgencia: " + this.agencia + "\nConta: " + this.conta + "\nSaldo: R$" + Double.toString(this.saldo) + "\nRendimento " + Double.toString(this.rendimento()) + " por mes\nAbertura " + this.data;
		return dados;
	}
}
