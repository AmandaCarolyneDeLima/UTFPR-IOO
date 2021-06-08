//Exercicio 1

//Usando como base o exemplo do relógio desenvolvido em sala de aula, modele e
//implemente de maneira orientada a objetos um relógio de 12 horas. Tenha cuidado, isso
//não é tão fácil quanto parece a princípio. Em um relógio de 12 horas, as horas depois da
//meia-noite não são mostradas como 00:30, mas como 12:30 e para diferenciar 12:30 da
//manhã ou 12:30 da noite usa-se AM e PM.


public class Relogio{
    
   private PainelNumerico horas;
   private PainelNumerico minutos;
   private String mostrador;
   private String periodo;

   public Relogio()
   {
       horas = new PainelNumerico(12);
       minutos = new PainelNumerico(60);
       periodo = "AM";
   }
   
   public void setPeriodo(String periodo){
       periodo = periodo.toUpperCase();
       if (periodo.equals("AM") || periodo.equals("PM"))
            this.periodo = periodo;
   }
    
   public void marcaRitmo()
   {
       minutos.incrementa();
       if(minutos.getValor() == 0) {
           // acabou de ultrapassar o limite!
           horas.incrementa();
           if(horas.getValor() == 0){
            trocaPeriodo();
           }
       }
   }
    
   public void ajustaHora(int hora, int minuto, String periodo)
   {
       horas.setValor(hora);
       minutos.setValor(minuto);
       setPeriodo(periodo);
   }
   
   public String getHora()
   {
       atualizaMostrador();
       return mostrador;
   }
   
   private void atualizaMostrador()
   {
       mostrador = horas.getValorExibido();
       
       if (horas.getValor() == 0)
        mostrador = "12";
        
       mostrador += ":" + minutos.getValorExibido() + " " + periodo;
    }
    
   private void trocaPeriodo(){
       if (periodo.equals("AM"))
            periodo = "PM";
       else
            periodo = "AM";
   }    
}