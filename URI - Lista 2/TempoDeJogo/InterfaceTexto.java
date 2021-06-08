import java.util.Scanner;
import java.lang.String;

class InterfaceTexto {
    private Scanner entrada;
    private TempoDeJogo tempoDeJogo;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        tempoDeJogo = new TempoDeJogo();
    }

    public void executar() {
        tempoDeJogo.setHoraInicial(entrada.nextInt());
        tempoDeJogo.setHoraFinal(entrada.nextInt());

        sln("O JOGO DUROU " + tempoDeJogo.duracaoJogo() + " HORA(S)");

    }

    private void sln() {
        System.out.println();
    }

    private void sln(String s) {
        System.out.println(s);
    }
}