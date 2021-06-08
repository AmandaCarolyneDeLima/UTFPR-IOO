import java.util.Scanner;
import java.lang.String;

class InterfaceTexto {
    private Scanner entrada;
    private ImpostoRenda impostoRenda;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        impostoRenda = new ImpostoRenda();
    }
    
    public void executar() {
        impostoRenda.setValor(entrada.nextDouble());
        
        sln(impostoRenda.valorTotal());
        
        
        //sln("Total: R$ " + formateParaDuasCasasDecimais(impostoRenda.valorTotal()));
    }
    
    private String formateParaDuasCasasDecimais(double preco) {
        return String.format("%.2f", preco);
    }

    private void sln() {
        System.out.println();
    }

    private void sln(String s) {
        System.out.println(s);
    }
}