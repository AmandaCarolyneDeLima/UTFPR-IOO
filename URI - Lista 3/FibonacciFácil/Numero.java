class Numero{
    private int numero;

    public void setNumero(int numero){
        this.numero = numero;
    }

    public String getFibonacci(){

        String aux = "";
        int proximo = 0;
        int anterior = 0;
        int a = 1;

        for (int i = 1; i <= numero; i++)
            if (i == numero) 
                aux= aux + anterior;
            else {
                aux = aux + (anterior + " ");
                proximo = anterior + a;
                anterior = a;
                a = proximo;
            }
        return aux;
    }
}