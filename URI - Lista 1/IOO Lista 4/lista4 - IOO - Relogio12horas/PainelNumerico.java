public class PainelNumerico{
    
    private int limite;
    private int valor;
    
    public PainelNumerico(int limite)
    {
      this.limite = limite;
      this.valor = 0;
    }
    
    public void incrementa()
    {
        valor = (valor + 1) % limite;
    }
    
    public String getValorExibido()
    {
        if(valor < 10)
        return "0" + valor;
        else
        return "" + valor;
    }
    
    public void setValor(int valor)
    {
        if ((valor >= 0) && (valor < limite))
        {
            this.valor = valor;
        }
    }
    
    public int getValor()
    {
     return valor;
    }
}
