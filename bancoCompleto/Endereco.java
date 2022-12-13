class Endereco {
	private String rua = "";
	private String bairro = "";
	private String cidade = "";
	private String uf = "";
	private int numero = 0;
	private double cep = 0;
	Endereco (String varRua, String varBairro, String varCidade, String UF, int varNumero, double varCep) {
		if(varCep > 9999999) {
			this.rua = varRua;
			this.bairro = varBairro;
			this.cidade = varCidade;
			this.uf = UF;
			this.numero = varNumero;
			this.cep = varCep;
		}
		else {
			System.out.println("Argumento invalido");
		}
	}
	public String getRua() {
		return this.rua;
	}
	public String getBairro() {
		return this.bairro;
	}
	public String getCidade() {
		return this.cidade;
	}
	public String getUf() {
		return this.uf;
	}
	public int getNumero() {
		return this.numero;
	}
	public double getCep() {
		return this.cep;
	}
	public String getEndereco() {
		return "Rua: " + this.rua +
			"\nBairro: " + this.bairro +
			"\nCidade: " + this.cidade +
			"\nNumero: " + Integer.toString(this.numero) +
			"\nUF: " + this.uf +
			"\nCEP: " + Double.toString(this.cep);
	}
}
