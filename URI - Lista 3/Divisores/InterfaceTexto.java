import java.util.Scanner;

class InterfaceTexto {
	private Scanner entrada;
	private Numero numero;

	public InterfaceTexto() {
		entrada = new Scanner(System.in);
		numero = new Numero();
	}
	
	public void executar() {
		numero.setNumero(entrada.nextInt());

		sln(numero.getCalcular());
	}

	private void sln() {
		System.out.println();
	}

	private void sln(String s) {
		System.out.println(s);
	}
}