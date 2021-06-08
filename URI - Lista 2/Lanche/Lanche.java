public class Lanche{
    
    private int codigo;
    private double preco;
    private int quantidade;
    
    public int getCodigo(){
        return codigo;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public double getQuantidade(){
        return quantidade * preco();
    }
    
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    
    public double preco(){
      if (codigo == 1 ){
        return preco = 4.00;
      } else if(codigo == 2 ){
        return preco = 4.50;
      } else if (codigo == 3 ){
        return preco = 5.00;
      } else if (codigo == 4 ){
        return preco = 2.00;
      } else if (codigo == 5 ){
        return preco = 1.50;
      } 
      return 0;
    }
    
    public double valorASerPago(){
        return getQuantidade();
    }
}