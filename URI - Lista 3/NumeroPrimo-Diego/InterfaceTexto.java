import java.util.Scanner;

class InterfaceTexto {
    private Scanner entrada;
    private Numero numero;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        numero = new Numero();
    }

    public void executar() {
        int numeroEntradas = entrada.nextInt();

        for(int i = 0; i < numeroEntradas ; i++){

            numero.setValor(entrada.nextInt());
            sln(numero.ePrimoEmTexto());
        }
    }

    private void sln() {
        System.out.println();
    }

    private void sln(String s) {
        System.out.println(s);
    }
}