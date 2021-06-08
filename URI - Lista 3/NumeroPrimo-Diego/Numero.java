class Numero {

    private int valor;

    public void setValor(int valor){
        this.valor = valor;
    }

    public int getValor(){
        return valor;
    }

    public boolean ePrimo() {
        for (int j = 2; j < valor; j++) {
            if (valor % j == 0) return false;
        }
        return true;
    }

    public String ePrimoEmTexto() {
        if (ePrimo())
           return valor + " eh primo";

        return valor + "nao eh primo";
    }
}
