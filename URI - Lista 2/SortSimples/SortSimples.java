public class SortSimples{

    private int valorA;
    private int valorB;
    private int valorC;

    public int getValorA(){
        return valorA;
    }

    public void setValorA(int valorA){
        this.valorA = valorA;
    }

    public int getValorB(){
        return valorB;
    }

    public void setValorB(int valorB){
        this.valorB = valorB;
    }

    public int getValorC(){
        return valorC;
    }

    public void setValorC(int valorC){
        this.valorC = valorC;
    }

    public String ordenar(){

        int num1 = valorA, num2 = valorB, num3 = valorC, aux;

        if (num1 > num2) {
            aux = num1;
            num1 = num2;
            num2 = aux;
        }

        if (num2 > num3) {
            aux = num2;
            num2 = num3;
            num3 = aux;

            if (num1 > num2) {
                aux = num1;
                num1 = num2;
                num2 = aux;
            }
        }

        return num1 + "\n" + num2 + "\n" + num3;
    }

    public String getExibir() {
        return valorA + "\n" + valorB + "\n" + valorC;
    }
}