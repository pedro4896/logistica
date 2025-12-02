# Documentação do uso da IA na Questão 4 (Facade)

## Prompts utilizados

1. "Crie uma implementação em Java para a Questão 4 da Lista Avaliativa II utilizando o padrão Facade para simplificar o processamento de pedidos em uma loja de comércio eletrônico."
2. "Implemente uma classe PedidoFacade que combina os serviços de Estoque, Pagamento e Remessa."

## O que a IA gerou

- Estrutura das classes `ServicoEstoque`, `ServicoPagamento` e `ServicoRemessa`.
- Implementação do padrão **Facade** com a classe `PedidoFacade`, que simplifica o processo de pedido.
- Classe `Main.java` para testar o processamento de pedidos.
- Integração dos três serviços de forma centralizada na classe `PedidoFacade`.

## Ajustes manuais feitos

- A IA forneceu a estrutura inicial das classes, mas fiz os seguintes ajustes:
    - Adicionei a lógica de verificação de disponibilidade no **ServicoEstoque** e processamento de pagamento no **ServicoPagamento**.
    - Melhorei a clareza das mensagens no console para facilitar a visualização durante a execução.
    - Simplifiquei a interação com os serviços de pagamento e remessa para fins de demonstração.

## Porque os ajustes foram necessários

Os ajustes ajudaram a tornar o código mais robusto, lógico e claro, atendendo melhor aos requisitos da atividade e proporcionando uma demonstração mais efetiva do padrão Facade.

Essas melhorias deixaram a solução mais eficiente e com maior clareza na execução do código.
