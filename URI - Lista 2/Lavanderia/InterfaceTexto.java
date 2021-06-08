import java.util.Scanner;

class InterfaceTexto {
    private Scanner entrada;
    private Lavanderia lavanderia;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        lavanderia = new Lavanderia();
    }

    public void executar() {
        lavanderia.setN(entrada.nextInt());
        lavanderia.setLa(entrada.nextInt());
        lavanderia.setLb(entrada.nextInt());
        lavanderia.setSa(entrada.nextInt());
        lavanderia.setSb(entrada.nextInt());
        
        sln(lavanderia.calc());
    }

    private void sln() {
        System.out.println();
    }

    private void sln(String s) {
        System.out.println(s);
    }
}