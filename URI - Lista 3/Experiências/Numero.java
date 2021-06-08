
class Numero{

    private int numero;
    private int totalCoelhos = 0;
    private int totalRatos = 0;
    private int totalSapos = 0;

    private int totalCobaias;
    private float mediaCoelhos;
    private float mediaRatos;
    private float mediaSapos;

    public void setNumero(int numero){
        this.numero = numero;
    }

    public int getNumero(){
        return numero;
    }

    private char tipo = 0;

    public void setTipo(char tipo){
        this.tipo = tipo;
    }

    public void getResult(){

        switch (tipo) {
            case 'C': totalCoelhos += numero; break;
            case 'R': totalRatos += numero; break;
            case 'S': totalSapos += numero; break;
        }

        totalCobaias = totalCoelhos + totalRatos + totalSapos;

        mediaCoelhos = (totalCoelhos * 100) / (float) totalCobaias;
        mediaRatos = (totalRatos * 100) / (float) totalCobaias;
        mediaSapos = (totalSapos * 100) / (float) totalCobaias;
    }

    public String toString(){
        return ("Total: " + totalCobaias + " cobaias"+"\n"+ 
            "Total de coelhos: " + totalCoelhos+"\n"+ 
            "Total de ratos: " + totalRatos+"\n"+ 
            "Total de sapos: " + totalSapos+"\n"+ 

            ("Percentual de coelhos:" +formateParaDuasCasasDecimais(mediaCoelhos)) + " %"+"\n"+ 
            ("Percentual de ratos:" +formateParaDuasCasasDecimais(mediaRatos)) + " %"+"\n"+
            ("Percentual de sapos:" +formateParaDuasCasasDecimais(mediaSapos)) + " %");

    }

    private String formateParaDuasCasasDecimais(float numero) {
        return String.format("%.2f", numero);
    }

}
