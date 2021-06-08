public class FusoHorario{

    private int S;
    private int T;
    private int F; 

    public int getS(){
        return S;
    }

    public void setS(int S) {
        if((S >= 0) && ( S <= 23))
            this.S = S;
    }

    public int getT(){
        return T;
    }

    public void setT(int T) {
        if((T >= 1) && ( T <= 12))
            this.T = T;
    }

    public int getF(){
        return F;
    }

    public void setF(int F) {
        if((F >= -5) && ( F <= 5))
            this.F = F;
    }

    public String calcFuso(){
  
        int res = (getS() + getT() + getF());
        if(res >= 24) {
            res = res - 24;
        }
        else if(res < 0){
            res = 24 + res;
        }
        return "" + res;
    }
}
