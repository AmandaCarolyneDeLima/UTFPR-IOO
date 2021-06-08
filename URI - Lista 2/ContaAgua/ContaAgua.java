
public class ContaAgua{

    private int n;

    public int getN(){
        return n;
    }

    public void setN(int n){
        this.n = n;
    }

    public  String calculo(){
        int p = 0;
        
        if(getN() <= 10){
            p = 7;
        }else if(getN() >= 11 && getN() <= 30){
            p = (getN()-10)*1 + 7;
        }else if(getN() >= 31 && getN() <= 100){
            p = (getN() - 30)*2 + 27;
        }else if(getN() >= 101){
            p = (getN() - 100)*5 + 167;
        }
        return "" + p;
    }
}
