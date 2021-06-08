class Corrida{

    private int n1,d1,v1;
    private int n2, d2, v2;
    private int charreteA, charreteB;

    public double getCharreteA(){
        double d1 = Double.valueOf(this.d1);
        double v1 = Double.valueOf(this.v1);

        //if (1 <= n1 && n1 <= 99); 
        //if (0 <= d1 && d1 <= 1000);
        //if (0 <= v1 && v1 <= 50);

        double tempo1 = d1/v1;
        return tempo1;
    }

    public void setCharreteA(int n1, int d1, int v1){
        this.n1 = n1;
        this.d1 = d1;
        this.v1 = v1;
    }

    public double getCharreteB(){

        double d2 = Double.valueOf(this.d2);
        double v2 = Double.valueOf(this.v2);

        //if (1 <= n2 && n2 <= 99); 
        //if (0 <= d2 && d2 <= 1000);
        //if (0 <= v2 && v2 <= 50);

        double tempo2 = d2/v2;
        return tempo2;
    }

    public void setCharreteB(int n2, int d2, int v2){
        this.n2 = n2;
        this.d2 = d2;
        this.v2 = v2;
    }

    public String calcular(){

        if (getCharreteA() < getCharreteB()){
            return ""+ n1;
        }else{
            return ""+ n2;
        }

    }
}
