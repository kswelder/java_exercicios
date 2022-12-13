import java.util.ArrayList;

class teste {
	static ArrayList<String> lista = new ArrayList<String>();
	public static void main(String[] args) {
		for(int x = 33;x <= 231; x++) {
			//lista.add();
			if(x == 96) {continue;}
			if(x >= 126) {
			if(x != 199 && x != 231) {
				continue;
			}
			}
			//System.out.println("Code "+x+" = "+(char)x);
			lista.add(Character.toString((char)x));
		}
		/*
		lista.forEach(item -> {
			System.out.println(item);
		});
		*/
		String letra = "uma palavra";
	}
}
