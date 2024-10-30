package Test;

import Compra.PagamentoBoleto;
import Compra.Pessoa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    void deveRetoranaBoleto(){
        Pessoa p = new Pessoa();
        p.tipoBoleto();
        assertEquals("Boleto", p.getTipoPagamento());
    }

    @Test
    void deveRetoranaPIX(){
        Pessoa p = new Pessoa();
        p.tipoPix();
        assertEquals("PIX", p.getTipoPagamento());
    }

    @Test
    void deveRetoranaCartao(){
        Pessoa p = new Pessoa();
        p.tipoCartao();
        assertEquals("Cartao", p.getTipoPagamento());
    }

}