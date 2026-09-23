public interface MetodoPagamento {
    void processarPagamento(double valor);
    String obterDetalhes();
}

public class CartaoCredito implements MetodoPagamento {
    private String numeroCartao;
    private double limite;

    public CartaoCredito(String numeroCartao, double limite) {
        this.numeroCartao = numeroCartao;
        this.limite = limite;
    }

    @Override
    public void processarPagamento(double valor) {
        if (valor > limite) {
            System.out.println("Pagamento recusado: valor excede o limite do cartão.");
        } else {
            limite -= valor;
            System.out.println("Pagamento de R$" + valor + " aprovado no cartão.");
        }
    }

    @Override
    public String obterDetalhes() {
        return "Cartão de Crédito - Número: " + numeroCartao + " - Limite restante: " + limite;
    }
}

public class Pix implements MetodoPagamento {
    private String chavePix;

    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado via Pix.");
    }

    @Override
    public String obterDetalhes() {
        return "Pix - Chave: " + chavePix;
    }
}
