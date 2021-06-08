import java.util.Scanner;

class InterfaceTexto {
    private Scanner entrada;
    private SortSimples sortSimples;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        sortSimples = new SortSimples();
    }

    public void executar() {
        sortSimples.setValorA(entrada.nextInt());
        sortSimples.setValorB(entrada.nextInt());
        sortSimples.setValorC(entrada.nextInt());
        
        sln(sortSimples.ordenar());
        sln();
        sln(sortSimples.getExibir());
    }


    private void sln() {
        System.out.println();
    }

    private void sln(String s) {
        System.out.println(s);
    }
}