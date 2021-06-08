public class Relogio {
    private PainelNumerico minutos;
    private PainelNumerico horas;
    private String mostrador;
    public Relogio(){
        horas = new PainelNumerico(24);
        minutos = new PainelNumerico(60);
        atualizarMostrador();
    }
    
    public void marcaRitmo(){
        minutos.incrementa();
        if(minutos.getValor()==0){
            horas.incrementa();
         }
        atualizarMostrador();

    }
    
    public void atualizarMostrador(){
        mostrador=
                horas.getValorExibido() + ":" +
                minutos.getValorExibido();
    }
    
    public void ajustaHoras(int hora, int minuto){
        horas.setValor(hora);
        minutos.setValor(minuto);
        atualizarMostrador();
    }
    
    public String getHoras(){
        return mostrador;
    }
}
