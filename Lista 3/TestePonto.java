import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestePonto{

	private Ponto p;
	
	@Before
	public void setUp() {
		p = new Ponto();
	}

	@Test
	public void deveTerValorInicialZero() {
		assertEquals(0, p.getX());
		assertEquals(0, p.getY());
	}
	
	@Test
	public void deveInstanciarUmPontoInformandoOsValoresDeXeY() {
		p = new Ponto(10, 20);
		assertEquals(10, p.getX());
		assertEquals(20, p.getY());
	}
	
	@Test
	public void deveSerPossivelAlterarOsValoresDeXeY() {
		p.setX(50);
		p.setY(55);
		assertEquals(50, p.getX());
		assertEquals(55, p.getY());
	}
	
	public void deveTerRepresentacaoEmString() {
		assertEquals("P(0,0)", p);
		p.setX(5);
		p.setY(15);
		assertEquals("P(5,15)", p);
	}
}