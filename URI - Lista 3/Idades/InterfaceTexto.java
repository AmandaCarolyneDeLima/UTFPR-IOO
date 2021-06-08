import java.util.Scanner;

class InterfaceTexto {
    private Scanner entrada;
    private Idade idade;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        idade = new Idade();
    }

    public void executar() {
        do {
            idade.setIdade(entrada.nextInt());

        }
        while (idade.getIdade() > 0);
        System.out.println(idade.mediaIdade());
    }

    private String formateParaDuasCasasDecimais(float idade) {
        return String.format("%.2f", idade);
    }

    private void sln() {
        System.out.println();
    }

    private void sln(double s) {
        System.out.println(s);
    }
}
