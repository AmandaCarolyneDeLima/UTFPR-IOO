import java.util.Scanner;
import java.lang.String;

class InterfaceTexto {
    private Scanner entrada;
    private ContaAgua contaAgua;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        contaAgua = new ContaAgua();
    }

    public void executar() {
        contaAgua.setN(entrada.nextInt());
        

        sln(contaAgua.calculo());
    }

    private void sln() {
        System.out.println();
    }

    private void sln(String s) {
        System.out.println(s);
    }
}