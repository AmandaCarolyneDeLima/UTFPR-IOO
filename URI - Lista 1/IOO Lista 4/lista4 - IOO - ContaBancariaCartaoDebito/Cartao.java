public class Cartao {
    
    private String nome;
    private int numero;
    private String senha;
    private Conta conta;
    
    public Cartao(String nome, int numero, Conta conta){
        this.nome = nome;
        this.numero = numero;
        this.conta = conta;
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNumero(int numero){
        this.numero=numero;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public void setConta(Conta conta){
            this.conta= conta;
    }
    
    public Conta getConta(){
            return conta;
    }
    
    public void setSenha(String senha){
        this.senha=senha;
    }
    
    public String getSenha(){
        return senha;
    }
    
      public void pagar(double valor, String senha){
        if(this.senha.equals(senha)&&conta.getSaldo() >= valor)
            conta.sacar(valor);
    }    
}