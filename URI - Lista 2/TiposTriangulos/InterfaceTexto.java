import java.util.Scanner;

class InterfaceTexto {
    private Scanner entrada;
    private Triangulo triangulo;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        triangulo = new Triangulo();
    }

    public void executar() {
        triangulo.setLadoA(entrada.nextDouble());
        triangulo.setLadoB(entrada.nextDouble());
        triangulo.setLadoC(entrada.nextDouble());
    
        
        triangulo.getOrdem();

        sln(triangulo.tipoTriangulo());
        sln(triangulo.formaTriangulo());
        
    }

    private void sln() {
        System.out.println();
    }

    private void sln(String s) {
        System.out.println(s);
    }
}
