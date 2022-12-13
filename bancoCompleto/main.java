import java.util.ArrayList;
import java.util.Scanner;

public class main {
	private Scanner scan = new Scanner(System.in);

	public void main(String[] args) {
		boolean verification = true;
		ArrayList<Conta> contas = new ArrayList<Conta>();
		while(verification == true) {
			System.out.println("Bem vindo ao banco"+
					"\n1) Criar conta"+
					"\n2) Atualizar conta"+
					"\n3) Depositar"+
					"\n4) Sacar"+
					"\n5) Transferir"
			);
			String variavel = scan.nextLine();
			switch(variavel) {
				case "1":
					break;
				case "2":
					break;
				case "3":
					break;
				case "4":
					break;
				case "5":
					break;
				default:
					System.out.println("Argumento invalido");
			}
		}
	}
	private void criarNovaConta() {}
	private void atualizarConta() {}
	private void depositarConta() {}
	private void sacarConta() {}
	private void transferirConta() {}
}
