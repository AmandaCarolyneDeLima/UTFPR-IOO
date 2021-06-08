//Amanda Carolyne de Lima
//DPSI

public class Transporte{

    private String placa;
    private String tipo;
    private int numeroEixo;
    private double tarifa = 23.30;

    public Transporte(String placa, int numeroEixo) {
        this.placa = placa;
        this.numeroEixo = numeroEixo;
    }

    public String getPlaca() {
        return placa;
    }

    public int getNumeroDeEixos() {
        return numeroEixo;
    }

    public double getTarifa() {
        return tarifa;
    }

    public String getTipo() {
        return "Tipo fixo";
    }

    public String getTipoDeTarifa() {
        return "Valor fixo";
    }
}