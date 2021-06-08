

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TesteRetangulo {
    
    private static final double DELTA = 0.001;
    
    private Retangulo r;
    
    @Before
    public void executeAntesDeCadTeste() {
        r = new Retangulo(10, 20); 
    }
    
    @Test
    public void deveInformarOTamanhoDeUmLadoNoConstrutor() {
        r = new Retangulo(10);
        assertEquals(10, r.getLadoUm(), DELTA);
        assertEquals(10, r.getLadoDois(), DELTA);
    }
    
    @Test
    public void deveInformarOTamanhoDeDoisLadoNoConstrutor() {
        assertEquals(10, r.getLadoUm(), DELTA);
        assertEquals(20, r.getLadoDois(), DELTA);
    }
    
    @Test
    public void deveTerArea() {
        assertEquals(200, r.getArea(), DELTA);
    }
    
    @Test
    public void deveTerPerimetro() {
        assertEquals(60, r.getPerimetro(), DELTA);
    }
    
    @Test
    public void deveVerificarSeEUmQuadrado() {
        assertFalse("Nao e quadrado", r.eQuadrado());
        r.setLadoUm(20);
        assertTrue("E quadrado", r.eQuadrado());
    }
    
    @Test
    public void deveVerificarSeTemAreaMaiorQueUmValorInformado() {
        assertFalse("Nao tem area maior que 200", r.temAreaMaiorQue(210));
        assertTrue("Tem area maior que 20", r.temAreaMaiorQue(20));
    }
    
     @Test
    public void deveVerificarSeTemAreaMaiorQueUmOutroRetanguloInformado() {
        Retangulo r2 = new Retangulo(30,30);
        Retangulo r3 = new Retangulo(10);
                
        assertFalse("Nao tem area maior que 900", r.temAreaMaiorQue(r2));
        assertTrue("Tem area maior que 100", r.temAreaMaiorQue(r3));
    }
}