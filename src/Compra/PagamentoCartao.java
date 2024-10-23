package Compra;

public class PagamentoCartao implements Pagamento{
    @Override
    public String pagamento() {
        return "Cartao";
    }
}
