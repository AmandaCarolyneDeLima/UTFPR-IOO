public class temperatura{
    private float valorProd;
    private float desc;
    
    public void setValorProd(float valorProd){
        this.valorProd = valorProd;
    }
    public float getValorProd(){
        return valorProd;
    }
    
    public void setDesc(float desc){
        this.desc = desc;
    }
    public float getDesc(){
        return desc;
    }
    
    public float pDesc(){
        return (valorProd - (valorProd * (desc / 100)));
    }
}    