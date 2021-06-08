class Primo{

    private int valor;

    public void setValor(int valor){
        this.valor = valor;
    }

    public int getValor(){
        return valor;
    }

    public String getCalcular(){

        for (int j = 2; j < valor; j++) {
            if (valor % j == 0) return valor + "nao eh primo";
        }
        return valor + " eh primo";
    }
}