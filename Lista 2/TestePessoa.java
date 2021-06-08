import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestePessoa
{
    private Pessoa pessoa;
    
    @Before
    public void setUp()
    {
        pessoa = new Pessoa();
        pessoa.setNome("Mateus");
        pessoa.setSobrenome("da Silva");
        pessoa.setAnoDeNascimento(1960);
    }

    @Test
    public void deveRetornarONomeCompleto() {
        assertEquals("Mateus", pessoa.getNome());
        assertEquals("da Silva", pessoa.getSobrenome());
        
        assertEquals("Mateus da Silva", pessoa.getNomeCompleto());
    }
    
    @Test
    public void deveRetornarAIdade() {
        assertEquals(57, pessoa.getIdade());
    }
    
    @Test
    public void deveRetornarAIdadeEmMeses() {
        assertEquals(57*12, pessoa.getIdadeEmMeses());
    }
}