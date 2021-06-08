import java.util.Scanner;
import java.lang.String;

class InterfaceTexto {
    private Scanner entrada;
    private Corrida corrida;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        corrida = new Corrida();
    }

    public void executar() {
        corrida.setCharreteA(entrada.nextInt(), entrada.nextInt(), entrada.nextInt());
        corrida.setCharreteB(entrada.nextInt(), entrada.nextInt(), entrada.nextInt());

        sln (corrida.calcular());
    }

    private void sln() {
        System.out.println();
    }

    private void sln(String s) {
        System.out.println(s);
    }
}