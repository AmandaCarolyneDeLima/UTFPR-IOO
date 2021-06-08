package provaIoo2.provaIoo2;

//Amanda Carolyne de Lima
//Isabela Taques Vitek
//Marco Amaral

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TesteJogo {
    
    private Jogo jogo;
    
    @BeforeEach
    public void antesDeCadaTeste() {
        jogo = new Jogo();
    }
    
    @Test
    public void deveTerJogadoresDevidaMenteNomeados() {

        assertEquals("Jogador 1", jogo.getPrimeiroColocado());
        assertEquals("Jogador 2", jogo.getSegundoColocado());
        assertEquals("Jogador 3", jogo.getTerceiroColocado());
    }

    @Test
    public void deveDeterminarAColocacaoComUmaRodada() {
        jogo.rodada(5, 10, 2);
        
        assertEquals("Jogador 1", jogo.getPrimeiroColocado());
        assertEquals("Jogador 2", jogo.getSegundoColocado());
        assertEquals("Jogador 3", jogo.getTerceiroColocado());
    }
    
    @Test
    public void deveDeterminarAColocacaoComNRodadas() {
        jogo.rodada(10, 5, 20);
        jogo.rodada(20, 1, 3);
        jogo.rodada(20, 50, 30);
        
        assertEquals("Jogador 3", jogo.getPrimeiroColocado());
        assertEquals("Jogador 1", jogo.getSegundoColocado());
        assertEquals("Jogador 2", jogo.getTerceiroColocado());
    }
    
    @Test
    public void deveCancelarARodadaCasoDoisOuTresJogadoresEscolhamOMesmoNumero() {
        jogo.rodada(10, 0, 0);
        assertEquals(true, jogo.isRodadaCancelada());
    }
    
    @Test
    public void naoDeveAtribuirPontosCasoSejaFornecidoNumerosForaDoIntervalo() {
        jogo.rodada(10, -1, 51);
        assertEquals(true, jogo.isRodadaCancelada());
    }
    
    @Test
    public void deveSerPossivelReiniciarOJogo() {
        // Escreve um método chamado reiniciar na classe Jogo, 
        // este não deve ter retorno nem parâmetros. Deve zerar a pontuação
        // de cada jogador e manter a ordem inicial da classificação.
        
        jogo.rodada(20, 2, 10);
        
        jogo.reiniciarJogo();
        assertEquals("Jogador 1", jogo.getPrimeiroColocado());
        assertEquals("Jogador 2", jogo.getSegundoColocado());
        assertEquals("Jogador 3", jogo.getTerceiroColocado());
        
    }
    
    @Test
    public void deveRetornarAClassifcaoComAPontucaoDeCadaJogador() {
        // Escreve um método, na classe Jogo, chamado getClassificacao, 
        // este não deve ter parâmetros e deve retornar a classificação no
        // formato no seguinte formato:
        // Jogador 1 - 10 pontos
        // Jogador 2 - 3 pontos
        // Jogador 3 - 5 pontos
        //**sendo que o participante que escrever o número do meio recebe 10 pontos.**
        jogo.rodada(5, 10, 2);
        
        assertEquals("Jogador 1 - 10 pontos\nJogador 2 - 0 pontos\nJogador 3 - 0 pontos", jogo.getClassificacao());
    }

    @Test
    public void colocacaoJogadorUmJogadorDoisJogadorTres() {
        jogo.rodada(9, 2, 10);//jogador1 ganha
        jogo.rodada(4, 7, 12);//jogador2 ganha
        jogo.rodada(10, 1, 15);//jogador1 ganha

        assertEquals("Jogador 1", jogo.getPrimeiroColocado());
        assertEquals("Jogador 2", jogo.getSegundoColocado());
        assertEquals("Jogador 3", jogo.getTerceiroColocado());
    }

    @Test
    public void colocacaoJogadorUmJogadorTresJogadorDois() {
        jogo.rodada(9, 2, 10);//jogador1 ganha
        jogo.rodada(4, 12, 7);//jogador3 ganha
        jogo.rodada(10, 1, 15);//jogador1 ganha

        assertEquals("Jogador 1", jogo.getPrimeiroColocado());
        assertEquals("Jogador 3", jogo.getSegundoColocado());
        assertEquals("Jogador 2", jogo.getTerceiroColocado());
    }

    @Test
    public void colocacaoJogadorDoisJogadorUmJogadorTres() {
        jogo.rodada(5, 10, 20);//jogador2 ganha
        jogo.rodada(2, 1, 3);//jogador1 ganha
        jogo.rodada(6, 12, 15);//jogador2 ganha

        assertEquals("Jogador 2", jogo.getPrimeiroColocado());
        assertEquals("Jogador 1", jogo.getSegundoColocado());
        assertEquals("Jogador 3", jogo.getTerceiroColocado());
    }

    @Test
    public void colocacaoJogadorDoisJogadorTresJogadorUm() {
        jogo.rodada(5, 10, 20);//jogador2 ganha
        jogo.rodada(1, 3, 2);//jogador3 ganha
        jogo.rodada(6, 12, 15);//jogador2 ganha

        assertEquals("Jogador 2", jogo.getPrimeiroColocado());
        assertEquals("Jogador 3", jogo.getSegundoColocado());
        assertEquals("Jogador 1", jogo.getTerceiroColocado());
    }

    @Test
    public void colocacaoJogadorTresJogadorUmJogadorDois() {
        jogo.rodada(5, 20, 10);//jogador3 ganha
        jogo.rodada(2, 1, 3);//jogador1 ganha
        jogo.rodada(6, 15, 12);//jogador3 ganha

        assertEquals("Jogador 3", jogo.getPrimeiroColocado());
        assertEquals("Jogador 1", jogo.getSegundoColocado());
        assertEquals("Jogador 2", jogo.getTerceiroColocado());
    }

    @Test
    public void colocacaoJogadorTresJogadorDoisJogadorUm() {
        jogo.rodada(5, 20, 10);//jogador3 ganha
        jogo.rodada(1, 2, 3);//jogador2 ganha
        jogo.rodada(6, 15, 12);//jogador3 ganha

        assertEquals("Jogador 3", jogo.getPrimeiroColocado());
        assertEquals("Jogador 2", jogo.getSegundoColocado());
        assertEquals("Jogador 1", jogo.getTerceiroColocado());
    }

    @Test
    public void aCadaRodadaDeveAtualizarAClassificacao() {
        jogo.rodada(1,2,3);

        assertEquals(
                "Jogador 1 - 0 pontos\n" +
                "Jogador 2 - 10 pontos\n" +
                "Jogador 3 - 0 pontos", jogo.getClassificacao());
        jogo.rodada(3,2,1);

        assertEquals(
                "Jogador 1 - 0 pontos\n" +
                "Jogador 2 - 20 pontos\n" +
                "Jogador 3 - 0 pontos", jogo.getClassificacao());
    }
}

