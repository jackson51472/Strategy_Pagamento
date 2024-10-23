package Compra;

public class PagamentoPIX implements Pagamento{
    @Override
    public String pagamento() {
        return "PIX";
    }
}
