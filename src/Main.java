import facade.*;

public class Main {
    public static void main(String[] args) {

        // Criando um produto
        Produto produto = new Produto(1, "Smartphone");

        // Criando o Facade para processar o pedido
        PedidoFacade pedidoFacade = new PedidoFacade();
        pedidoFacade.processarPedido(produto);
    }
}
