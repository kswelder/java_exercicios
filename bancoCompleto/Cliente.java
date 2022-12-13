class Cliente {
	private String nome = "";
	private Endereco endereco;
	private String data = "";

	Cliente (String titular, String aniversario) {
		this.nome = nome;
		this.data = aniversario;
	}
	Cliente (String titular, String aniversario, Endereco novoEndereco) {
		endereco = new Endereco(
				novoEndereco.getRua(),
				novoEndereco.getBairro(),
				novoEndereco.getCidade(),
				novoEndereco.getUf(),
				novoEndereco.getNumero(),
				novoEndereco.getCep()
				);
	}
	public void setEndereco(
			String rua,
			String bairro,
			String cidade,
			String uf,
			int numero,
			double cep
			) {
		endereco = new Endereco(
				rua,
				bairro,
				cidade,
				uf,
				numero,
				cep
				);
	}
	public String getEndereco() {
		return this.endereco.getEndereco();
	}
	public String getData() {
		return this.data;
	}
	public String getNome() {
		return this.nome;
	}
	public String imprimir() {
		return "Titular: " + this.nome +
			"\nData: " + this.data +
			"\nEndereco: " + this.endereco.getEndereco();
	}
}
