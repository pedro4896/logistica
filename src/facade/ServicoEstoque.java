package facade;

public class ServicoEstoque {

    public static boolean isAvailable(Produto produto) {
        // Simula verificação de estoque
        System.out.println("Verificando estoque do produto " + produto.getName());
        return true;  // Sempre retorna true para simplificação
    }
}
