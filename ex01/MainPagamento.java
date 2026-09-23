public class MainPagamento {

    public static void finalizarCompra(MetodoPagamento metodo, double total) {
        System.out.println(metodo.obterDetalhes());
        metodo.processarPagamento(total);
    }

    public static void main(String[] args) {
        MetodoPagamento cartao = new CartaoCredito("1234-5678-9012", 1000.0);
        MetodoPagamento pix = new Pix("pedro@email.com");

        finalizarCompra(cartao, 250.0);
        System.out.println();
        finalizarCompra(pix, 90.0);
    }
}
