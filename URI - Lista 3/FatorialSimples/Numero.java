class Numero{

    private int numero;
    private int fatorial = 1;

    public void setNumero(int numero){
        this.numero = numero;
    }

    public int getNumero(){
        return numero;
    }

    public String getCalcular(){
        for (int i = 1; i <= numero; i++) {
        	fatorial *= i;
        }
        return fatorial+"\n";
    }
}