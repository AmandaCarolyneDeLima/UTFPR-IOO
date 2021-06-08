//Amanda Carolyne de Lima
//DPSI

public class Caminhao extends Transporte{

    private int numeroEixo;
    private String placa;
    private double tarifaPorEixo = 19.50;

    public Caminhao(String placa, int numeroEixo) {
        super(placa,numeroEixo);
    }

    public double getTarifa() {
        return numeroEixo * tarifaPorEixo;
    }

    public String getTipo() {
        return "Caminhão";
    }

    public String getTipoDeTarifa() {
        return "Por eixo";
    }
}