public class TempoDeJogo{

    private int horaInicial;
    private int horaFinal;

    public int getHoraInicial(){
        return horaInicial;
    }

    public void setHoraInicial(int horaInicial){
        this.horaInicial = horaInicial;
    }

    public int getHoraFinal(){
        return horaFinal;
    }

    public void setHoraFinal(int horaFinal){
        this.horaFinal = horaFinal;
    }

    public int duracaoJogo(){
        int horaTotal = 24 - (24 + horaInicial - horaFinal) % 24;

        if (horaInicial <= 24 && horaFinal <= 24 && horaInicial >= 0 && horaFinal >= 0) {
            if (horaFinal > horaInicial) {
                horaTotal = horaFinal - horaInicial;
            } else if (horaFinal < horaInicial || horaFinal == horaInicial) {
                horaTotal = (horaFinal - horaInicial) + 24;
            }
        }
        return horaTotal;
    }
}