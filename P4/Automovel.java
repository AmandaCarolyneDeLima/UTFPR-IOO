//Amanda Carolyne de Lima
//DPSI

public class Automovel extends Transporte{

    private String placa;
    private int numeroEixo;

    public Automovel(String placa, int numeroEixo){
        super(placa,numeroEixo);
        this.numeroEixo = numeroEixo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getTipo() {
        return "Automovel";
    }
}