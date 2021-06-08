public class Idade{
    private int contador;
    private int idadeTotal;
    private int idade;

    public Idade() {
        this.contador = 0;
        this.idadeTotal = 0;
        this.idade = 0;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
        if (idade > 0){
            this.idadeTotal += idade;
            contador++;
        }
    }

    public double mediaIdade(){
        return (double)this.idadeTotal / contador;
    }
}