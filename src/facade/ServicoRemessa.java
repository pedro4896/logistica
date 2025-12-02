package facade;

public class ServicoRemessa {

    public static void shipProduct(Produto produto) {
        // Simula envio do produto
        System.out.println("Enviando produto " + produto.getName() + " para o cliente...");
    }
}
