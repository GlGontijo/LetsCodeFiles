## Projeto: App de Delivery de uma Cantina
Fui conversar com o nosso novo cliente e ele tem o desejo de criar um app de delivery para realizar os pedidos e entregas de sua Cantina Italiana.

Para isso, o dono me passou algumas necessidades que o sistema precisa satisfazer.

Ele acha legal que a primeira interação com o cliente apareça um 
### “Seja bem Vindo à Cantina Codifichiamo*”.

Em seguida ele gostaria de oferecer a opção de lanche ou comida para seu cliente e passou as seguintes tabelas que ele quer trabalhar.

| _Lanches_ | _R$_  |
|-----------|-------|
| Burguer   | 30,00 |
| Pizza     | 45,00 |
| Fogazza   | 20,00 |

| _Pratos_  | _R$_  |
|-----------|-------|
| Pasta     | 30,00 |
| Lasanha   | 70,00 |
| Polpetone | 50,00 |

| _Bebidas_    | _R$_  |
|--------------|-------|
| Refrigerante | 05,00 |
| Suco         | 07,00 |
| Vinho        | 50,00 |

O cliente deve selecionar os itens de seu pedido e o sistema deve calcular o valor total, considerando a taxa de entrega.

Sempre que um item for adicionado ao pedido, o sistema deve perguntar se o cliente deseja mais alguma coisa ou então fechar o pedido.
A Taxa de Entrega varia de acordo com o tipo da refeição, sendo que será adicionado: 

_**R$1** para cada lanche ou bebida,_ 

_**R$2** para cada prato no pedido._

Crie uma _interface_ contendo o método de cálculo da taxa de entrega.
Ao final, o requisitante gostaria de informar um resumo do pedido contendo _itens + valor total_ e também mandar uma mensagem para seu cliente: 
### “Obrigado pelo pedido – Conte conosco!”

***

## Considerações:

A ideia é construir o backend Java da aplicação e testar a aplicação em console, o front será desenvolvido por outro time

Considere fazer um menu para: 
- consulta dos pratos, 
- inclusão de itens no pedido, 
- fechamento do pedido, 
- sair da aplicação

A inclusão de item é a partir do nome do prato, portanto quando o cliente selecionar a opção de adicionar itens no pedido, será solicitado que ele digite o nome do prato

Caso o prato solicitado não exista, deverá ser lançada uma exception de prato não encontrado.

Você pode instanciar os pratos e o cardápio de forma hardcoded, para que não precise ficar cadastrando essas informações sempre que for iniciar o programa

Neste momento, pode usar arrays[] com tamanho fixo (são 9 itens no total, de acordo com a especificação) para representar os pratos no cardápio e no pedido (contudo, se você estiver confortável para usar ArrayList, ou outra Collection de sua preferência
_[que é um conteúdo mais avançado do curso, e por isso não está sendo cobrado aqui]_, fique à vontade).
