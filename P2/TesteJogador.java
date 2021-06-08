package provaIoo2.provaIoo2;

//Amanda Carolyne de Lima
//Isabela Taques Vitek
//Marco Amaral

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TesteJogador {

    private Jogador jogador;

    @BeforeEach
    public void antesDeCadaTeste() {
        jogador = new Jogador("Jogador 1");
    }

    @Test
    public void deveInstanciarInformandoONome() {
        assertEquals("Jogador 1", jogador.getNome());
    }

    @Test
    public void deveTerEscoreInicialZero() {
        assertEquals(0, jogador.getEscore());
    }

    @Test
    public void deveIncrementarOEscore() {
        jogador.incrementarEscore(10);
        jogador.incrementarEscore(5);

        assertEquals(15, jogador.getEscore());
    }

    @Test
    public void deveAtribuirONumeroDaRodada() {
        jogador.setNumeroDaRodada(20);

        assertEquals(20, jogador.getNumeroDaRodada());
    }

    @Test
    public void naoDeveAceitarValoresNegativosParaOIncrementoDoEscore() {
        jogador.incrementarEscore(-1);
        assertEquals(0, jogador.getEscore());
    }

    @Test
    public void naoDeveAlterarONomeCasoOArgumentoSejaVazio() {
        Jogador j = new Jogador("");

        assertEquals("", j.getNome());
    }

    @Test
    public void deveAtualizarEscoreACadaRodada() {
        //Crio os jogadores
        Jogador jogador1 = new Jogador("Isa");
        Jogador jogador2 = new Jogador("Marco");
        Jogador jogador3 = new Jogador("Amanda");

        //Crio o jogo
        Jogo j = new Jogo(jogador1, jogador2, jogador3);

        //Seto os valores que cada jogador escolhe
        jogador1.setNumeroDaRodada(10);
        jogador2.setNumeroDaRodada(5);
        jogador3.setNumeroDaRodada(3);

        //Numero de cada jogador para a rodada
        j.rodada(jogador1.getNumeroDaRodada(), jogador2.getNumeroDaRodada(), jogador3.getNumeroDaRodada());

        assertEquals(10, jogador2.getEscore());

        //Seto novos valores para cada jogador
        jogador1.setNumeroDaRodada(20);
        jogador2.setNumeroDaRodada(10);
        jogador3.setNumeroDaRodada(5);

        //Outra rodada
        j.rodada(jogador1.getNumeroDaRodada(), jogador2.getNumeroDaRodada(), jogador3.getNumeroDaRodada());

        assertEquals(20, jogador2.getEscore());
    }
}

