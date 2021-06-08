import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RelogioTeste{
    
   private Relogio relogio;
    
   @Before
   public void setUp(){
       relogio = new Relogio();
   }
    
   @Test
   public void deveTerHoraDozeQuandoInstanciado(){
       assertEquals("12:00 AM", relogio.getHora());
   }
   
   @Test
   public void devePermitirAjustarHora(){
       relogio.ajustaHora(3,0,"PM");
       assertEquals("03:00 PM", relogio.getHora());
   }
   
   @Test
   public void deveMarcarORitmoDosMinutos(){
       relogio.marcaRitmo();
       assertEquals("12:01 AM", relogio.getHora());
   }
   
   @Test
   public void deveMarcarORitmoDasHoras(){
       relogio.ajustaHora(2,59, "AM");
       relogio.marcaRitmo();
       assertEquals("03:00 AM", relogio.getHora());
   }
   
   @Test
   public void deveMarcarORitmoDasHorasMudandoOPeriodo(){
       relogio.ajustaHora(11,59, "AM");
       relogio.marcaRitmo();
       assertEquals("12:00 PM", relogio.getHora());
       
       relogio.ajustaHora(11,59, "PM");
       relogio.marcaRitmo();
       assertEquals("12:00 AM", relogio.getHora());
   }
   
   @Test
   public void naoDeveAjustarAHoraComArgumentosInvalidos(){
       relogio.ajustaHora(15,15, "PM");
       assertEquals("12:15 PM", relogio.getHora());
       
       relogio.ajustaHora(1,70, "AM");
       assertEquals("01:15 AM", relogio.getHora());
       
       relogio.ajustaHora(11,15, "XY");
       assertEquals("11:15 AM", relogio.getHora());
       
       relogio.ajustaHora(15,75, "XY");
       assertEquals("11:15 AM", relogio.getHora());
   }
   
   @Test
   public void devePermitirAjustarSomenteOPeriodo(){
       relogio.setPeriodo("PM");
       assertEquals("12:00 PM", relogio.getHora());
   }
   
   @Test
   public void devePermitirAjustarOPeriodoIgnorandoMaiusculasOuMinusculas(){
       relogio.setPeriodo("pm");
       assertEquals("12:00 PM", relogio.getHora());
       
       
       relogio.setPeriodo("am");
       assertEquals("12:00 AM", relogio.getHora());
   }
   
   @Test
   public void devePermitirAjustarAHoraIgnorandoMaiusculasOuMinusculas(){
       relogio.ajustaHora(15,15, "pm");
       assertEquals("12:15 PM", relogio.getHora());
       
       relogio.ajustaHora(1,70, "am");
       assertEquals("01:15 AM", relogio.getHora()); 
   }
}
