import java.util.Scanner;

class InterfaceTexto {
    private Scanner entrada;
    private Tabuada tabuada;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        tabuada = new Tabuada();
    }

    public void executar() {
        tabuada.setValor(entrada.nextInt());

        sln(tabuada.getCalculo());
    }

    private void sln() {
        System.out.println();
    }

    private void sln(String s) {
        System.out.println(s);
    }
}