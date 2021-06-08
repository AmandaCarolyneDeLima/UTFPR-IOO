import java.util.Scanner;

class InterfaceTexto {
    private Scanner entrada;
    private Valor valor;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);

        valor = new Valor();

    }

    public void executar() {
        valor.maiorePosicao();
        sln(valor.getMaior());
        sln(valor.getPosicao());

    }

    private void sln() {
        System.out.println();
    }

    private void sln(int s) {
        System.out.println(s);
    }
}