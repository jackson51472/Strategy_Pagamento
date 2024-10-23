package Compra;

public class PagamentoBoleto implements Pagamento{
    @Override
    public String pagamento() {
        return "Boleto";
    }
}
