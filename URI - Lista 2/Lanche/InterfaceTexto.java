import java.util.Scanner;
import java.lang.String;

class InterfaceTexto {
    
	private Scanner entrada;
	private Lanche lanche;

	public InterfaceTexto() {
		entrada = new Scanner(System.in);
		lanche = new Lanche();
	}
	
	public void executar() {
		lanche.setCodigo(entrada.nextInt());
		lanche.setQuantidade(entrada.nextInt());
		
		sln("Total: R$ " + formateParaDuasCasasDecimais(lanche.valorASerPago()));
	}
	
	private String formateParaDuasCasasDecimais(double preco) {
		return String.format("%.2f", preco);
	}

	private void sln() {
		System.out.println();
	}

	private void sln(String s) {
		System.out.println(s);
	}
}