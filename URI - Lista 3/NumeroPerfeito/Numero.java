class Numero{

    private int numero;
    private int soma;

    public void setNumero(int numero){
        this.numero = numero;
    }

    public int getNumero(){
        return numero;
    }

    public String getCalcular(){
        for (int i = 0; i < numero; i++) {
            soma = 0;

            for (int j = 1; j < numero; j++) {
                if (numero % j == 0) {
                    soma += j;
                }
            }
            if (soma == numero) {
                return numero + " eh perfeito";
            }
            else return numero + " nao eh perfeito";
        }
        return "";
    }
}