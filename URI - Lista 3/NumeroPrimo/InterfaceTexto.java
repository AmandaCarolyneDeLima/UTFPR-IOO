import java.util.Scanner;

class InterfaceTexto {
    private Scanner entrada;
    private Primo primo;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        primo = new Primo();
    }

    public void executar() {
        int numeroEntradas = entrada.nextInt();

        for(int i = 0; i< numeroEntradas ; i++){

            primo.setValor(entrada.nextInt());

            sln(primo.getCalcular());
        }
    }

    private void sln() {
        System.out.println();
    }

    private void sln(String s) {
        System.out.println(s);
    }
}