//Amanda Carolyne de Lima
//DPSI

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pedagio {

    private ArrayList<Transporte> transportes;

    public Pedagio() {
        transportes = new ArrayList<>();
    }

    public void registrarPassagemVeiculo(Transporte transporte) {
        transportes.add(transporte);
    }

    public List<Transporte> getTransporte() {
        return Collections.unmodifiableList(transportes);
    }

    public double getTotalArrecadado() {
        double total = 0;
        for (Transporte transportes : transportes) {
            total += transportes.getTarifa();
        }
        return total;
    }
}