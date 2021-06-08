public class Lavanderia{

    private int n;
    private int la;
    private int lb;
    private int sa;
    private int sb;

    public int getN(){
        return n;
    }

    public void setN(int n){
        this.n = n;
    }

    public int getLa(){
        return la;
    }

    public void setLa( int la){
        this.la = la;
    }

    public int getLb(){
        return lb;
    }

    public void setLb(int lb){
        this.lb = lb;
    }

    public int getSa(){
        return sa;
    }

    public void setSa(int sa){
        this.sa = sa;
    }

    public int getSb(){
        return sb;
    }

    public void setSb(int sb){
        this.sb = sb;
    }

    public String calc(){
        if (n >= la && n <= lb && n >= sa && n <= sb){
            return "possivel";
        } else {
            return "impossivel";
        }
    }

}