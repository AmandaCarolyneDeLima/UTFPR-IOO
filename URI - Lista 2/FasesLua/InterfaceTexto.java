import java.util.Scanner;

class InterfaceTexto {
    private Scanner entrada;
    private Lua lua;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        lua = new Lua();
    }

    public void executar() {
        lua.setNum1(entrada.nextInt());
        lua.setNum2(entrada.nextInt());
        
        sln(lua.faseLua());
    }

    private void sln() {
        System.out.println();
    }

    private void sln(String s) {
        System.out.println(s);
    }
}