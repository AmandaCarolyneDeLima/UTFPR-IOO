class Tabuada{
    private String tabuada = "";
    private int valor;

    public void setValor(int valor) {
        if (valor > 2 && valor < 1000){
            this.valor = valor;
        }
    }

    public String getCalculo() {
        for (int i = 1; i < 11; i++){
            tabuada += i + " x " + valor + " = " + (valor * i) + "\n";
        }
        return tabuada;
    }
}