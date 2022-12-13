import java.util.ArrayList;
import java.util.Scanner;

public class main {
	private ArrayList<Conta> contas = new ArrayList<Conta>();
	private Scanner scan = new Scanner(System.in);

	public void main(String[] args) {
		boolean verificacao = true;
		while(verificacao == true) {
			System.out.println(
				"1) Criar nova conta\n"+
				"2) Atualizar conta\n"+
				"3) Sacar\n"+
				"4) Depositar\n"+
				"5) Transferir\n"+
				"6) Informacoes da conta\n"
			);
			String argumento = scan.nextLine();
			switch(argumento) {
				case "1":
					criarConta();
					break;
				case "2":
					atualizarConta();
					break;
				case "3":
					sacarConta();
					break;
				case "4":
					depositarConta();
					break;
				case "5":
					transferirConta();
					break;
				case "6":
					informacoesConta();
					break;
				default:
					System.out.println("Argumento invalido");
					break;
			}
			System.out.println("Deseja parar a execucao?");
			String v = scan.nextLine();
			if(v == "n" || v == "N") {
				continue;
			}
			else {
				if(v == "s" || v == "S") {
					System.out.println("Encerrando programa");
				}
				else {
					System.out.println("Argumento invalido");
				}
				System.out.println("Fim da execucao");
				break;
			}
		}
		System.out.println("Fim do programa");
	}
	private void criarConta() {
		System.out.println("Digite o nome");
		String nome = scan.nextLine();
		Conta conta = new Conta(nome);
		contas.add(conta);
		System.out.println("Conta criada com sucesso");
	}
	private void atualizarConta() {
		System.out.println("Conta atualizada com sucesso.");
	}
	private void sacarConta() {
		System.out.println("Saque realizado com sucesso");
	}
	private void depositarConta() {
		System.out.println("Deposito realizado com sucesso");
	}
	private void transferirConta() {
		System.out.println("Transferencia realizada com sucesso");
	}
	private void informacoesConta() {
		for(int x = 0;x <= lista.lenght(); x++) {
			continue;
		}
		System.out.println("nome");
	}
}
