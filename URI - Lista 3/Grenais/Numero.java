class Numero{

    private int inter;
    private int gremio;
    private int flag = 1;
    private int totalJogos = 0;
    private int vitoriasGremio = 0;
    private int vitoriasInter = 0;
    private int empates = 0;

    public void setInter(int inter){
        this.inter = inter;
    }

    public int getInter(){
        return inter;
    }

    public void setGremio(int gremio){
        this.gremio = gremio;
    }

    public int getGremio(){
        return gremio;
    }

    public String getCalcular(){
        while (flag == 1) {
            totalJogos++;
            
            if (inter > gremio) {
                vitoriasInter++;
            }
            else if (gremio > inter) {
                vitoriasGremio++;
            }
            else  empates++;

  
            while (flag != 1 && flag != 2) {
                return "Novo grenal (1-sim 2-nao)";
            }
        }
        
        return "Novo grenal (1-sim 2-nao)";
    }
}