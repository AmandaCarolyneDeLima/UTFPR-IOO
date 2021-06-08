public class ImpostoRenda{

    private double valor;

    public double getValor(){
        return valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    public String valorTotal(){
        
        if (valor >= 0 && valor <= 2000) {
            return "Isento";
        } else if (valor > 2000 && valor <= 3000) {
            return String.format("R$ %.2f", (valor - 2000) * 0.08);
        } else if (valor > 3000 && valor <= 4500) {
            return String.format("R$ %.2f", ((valor - 3000)  * 0.18) + 80);
        } else {
            return String.format("R$ %.2f", ((valor - 4500) * 0.28) + 350);
        }
    }
}

