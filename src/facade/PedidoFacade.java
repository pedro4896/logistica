package facade;

public class PedidoFacade {

    private ServicoEstoque servicoEstoque;
    private ServicoPagamento servicoPagamento;
    private ServicoRemessa servicoRemessa;

    public PedidoFacade() {
        this.servicoEstoque = new ServicoEstoque();
        this.servicoPagamento = new ServicoPagamento();
        this.servicoRemessa = new ServicoRemessa();
    }

    public void processarPedido(Produto produto) {
        if (ServicoEstoque.isAvailable(produto)) {
            if (ServicoPagamento.makePayment()) {
                ServicoRemessa.shipProduct(produto);
                System.out.println("Pedido processado com sucesso.");
            } else {
                System.out.println("Erro no pagamento. Pedido não processado.");
            }
        } else {
            System.out.println("Produto fora de estoque.");
        }
    }
}
