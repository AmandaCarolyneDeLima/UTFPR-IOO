import java.util.Scanner;

class Valor{
    private int valor = 5;
    private int maior = 0;
    private int posicao = 0;

    public void setValor(int valor){
        this.valor = valor;
    }

    public int getValor(){
        return valor;
    }
    
    public void setMaior(int maior){
        this.maior = maior;
    }
    
    public int getMaior(){
        return maior;
    }
    
    public void setPosicao(int posicao){
        this.posicao = posicao;
    }
    
    public int getPosicao(){
        return posicao;
    }

    public void maiorePosicao(){
        Scanner entrada = new Scanner(System.in);
        
        for (int i=1; i<=5; i++) {
            valor = entrada.nextInt();
            if (valor > maior) {
                maior = valor;
                posicao=i;
            }
        }
        
        setMaior(maior);
        setPosicao(posicao);
    }
}