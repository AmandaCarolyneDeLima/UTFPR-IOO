public class PainelNumerico {
     private int limite;
    private int valor;
    
    public PainelNumerico(int limite){
        this.limite = limite;
        this.valor = 0;
    }
    
    public void incrementa(){
        if(valor==(limite - 1)){
            valor=0;
      } else {
            valor = valor +1;
        }
    }

    public String getValorExibido(){
        if(valor < 10)
        return"0" + valor;
        else
        return "" + valor;
    }
    
    public void setValor(int valor){
        if((valor >=0)&&(valor < limite)){
            this.valor = valor;
    }
    }
    
    public int   getValor(){
        return valor;
    } 
}