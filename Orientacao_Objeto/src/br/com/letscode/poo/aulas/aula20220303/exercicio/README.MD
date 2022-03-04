## Exercício

Uma concessionária deseja realizar a automação de seus processos de compra de veículos e realizar orçamentos para manutenção destes veículos. Esta concessionária realiza a compra de carros e motos, que possuem as seguintes características:

- Fabricante
- Modelo
- Ano
- Tipo de combustão: Gasolina, Álcool, Flex ou Elétrico
- Preço

Somente os carros possuem as características abaixo:
- Quantidade de Portas
- Indicativo de airbag

Somente as motos possuem a quantidade de cilindradas.

A partir destas informações, precisamos de um sistema que:
- Apresente a lista de carros e motos disponíveis na loja
- Realize a compra de um novo Carro ou Moto

Também será possível realizar o orçamento de uma manutenção nos veículos, no qual é necessário calcular o valor da visita, que pode variar de acordo com a tabela abaixo:

| Tipo de Veículo | Condição             | Valor |
|-----------------|----------------------|-------|
| Moto            | <= 125 cc            | 250.0 |
| Moto            | > 125 cc <= 250 cc   | 500.0 |
| Moto            | > 250 cc             | 625.0 |
| Carro           | Combustão a álcool   | 250.0 |
| Carro           | Combustão a gasolina | 500.0 |
| Carro           | Modelo Flex          | 625.0 |

---