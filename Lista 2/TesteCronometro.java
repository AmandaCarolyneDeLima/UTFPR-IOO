import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TesteCronometro
{
    @Test
    public void inicialmenteOValorDeveSerZero() {
        Cronometro cronometro = new Cronometro();
        assertEquals(0, cronometro.getValor());
    }
    
    @Test
    public void deveIncrementarOValor() {
        Cronometro cronometro = new Cronometro();
        cronometro.incrementa();
        assertEquals(1, cronometro.getValor());
    }
    
    @Test
    public void deveSerPossivelZerarOCronometro() {
        Cronometro cronometro = new Cronometro();
        cronometro.incrementa();
        cronometro.incrementa();
        cronometro.incrementa();
        assertEquals(3, cronometro.getValor());
        cronometro.zera();
        assertEquals(0, cronometro.getValor());
    }
}