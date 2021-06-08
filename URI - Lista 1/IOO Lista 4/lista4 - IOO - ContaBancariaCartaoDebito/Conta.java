public class Conta {
    
    private double saldo;
    
    public Conta(){
        this.saldo = 0;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    public void sacar(double valor){
        if(valor<= saldo&& valor>0)
            saldo = saldo - valor;
    }
    
    public void depositar(double valor){
        if(valor>0)
        saldo = saldo + valor;
    }
    public void correcaoJuros(){
        if(saldo<1000)
            saldo = saldo * 1.01;
        else{
            if((saldo>=1000)&&(saldo <10000))
                saldo = saldo * 1.02;
            else{
                saldo = saldo * 1.03;
            }
        }
    }
}
