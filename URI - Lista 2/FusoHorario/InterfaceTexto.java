import java.util.Scanner;
import java.lang.String;

class InterfaceTexto {
    private Scanner entrada;
    private FusoHorario fusoHorario;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        fusoHorario = new FusoHorario();
    }

    public void executar() {
        fusoHorario.setS(entrada.nextInt());
        fusoHorario.setT(entrada.nextInt());
        fusoHorario.setF(entrada.nextInt());
        
        sln(fusoHorario.calcFuso());
        
    }

    private void sln() {
        System.out.println();
    }

    private void sln(String s) {
        System.out.println(s);
    }
}
