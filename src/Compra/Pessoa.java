package Compra;

public class Pessoa {

    private String tipoPagamento;

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void tipoBoleto() {
        Transacao transacao = new Transacao();
        this.tipoPagamento = transacao.pagamento(new PagamentoBoleto());
    }

    public void tipoPix() {
        Transacao transacao = new Transacao();
        this.tipoPagamento = transacao.pagamento(new PagamentoPIX());
    }

    public void tipoCartao() {
        Transacao transacao = new Transacao();
        this.tipoPagamento = transacao.pagamento(new PagamentoCartao());
    }
}
