## 1.
<br>Cria uma Classe Calculadora, que realiza as 4 operações aritméticas básicas a partir de dois valores recebidos em console. Faça um controle de exceção caso o usuário tente fazer uma divisão por zero.

_Dicas:_
- _Faça a divisão por 0 e veja qual a exceção que é lançada. Trate exclusivamente essa exceção._
- _Dê nomes significativos a cada objeto, variável e função que estiver criando : )_

## 2. 
<br>Considere um cadastro de um cliente, no qual vamos precisar receber informações digitadas em console referentes ao nome, cpf e a renda mensal da pessoa.
<br>Assim que o cadastro for realizado, imprima em console a mensagem “Cadastro realizado com sucesso” seguido do nome, cpf e renda informados.
<br>Trate a exceção de casos nos quais os valores foram digitados incorretamente em console (exemplo: letra informada em campo numérico).
<br>Após informar que o usuário incluiu um valor inválido, dê uma nova chance para ele fazer o cadastro. Se o usuário errar 3 vezes, finalize o processamento.

## 3. 
<br>Desenvolver programa que peça ao usuário para cadastrar uma senha; na sequência, deve pedir ao usuário que digite duas variáveis numéricas, e irá calcular a divisão da primeira pela segunda.
<br>O programa irá pedir ao usuário que digite a sua senha: se estiver correta, ela mostra o resultado da divisão. Senão dá mensagem de erro e encerra o aplicativo.
<br>Crie uma exceção exclusiva para tratar a entrada incorreta da senha.
<br>Também faça, em caráter de reforço, o tratamento de divisão por 0 e de erro de input.

## 4. 
Crie uma classe chamada ContaBancaria, pertencente ao pacote exercicio.excecao.contas com os seguintes atributos:
```java
private double saldo; // Determina o saldo da conta
private double limite; // Determina o limite de crédito do cheque especial
```
E os métodos:
```java
// Construtor padrão da classe.
public ContaBancaria(double valorSaldo, double valorLimite){}
// Retorna o saldo da conta.
public double getSaldo(){}

// Retorna o limite da conta.
protected double getLimite(){}

// Retorna o saldo da conta somado ao limite.
public double getSaldoComLimite(){}

// Deve decrementar o valor do saque da Conta. Retorna "true" caso a operação tenha sido bem sucedida, ou seja, a conta possui este valor (lembre-se de considerar o limite).
public boolean sacar(double valor) throws ContaException {}

// Deve incrementar o valor a Conta.
public void depositar(double valor) throws ContaException {}
```
E crie também a seguinte classe:
```java
public class ContaException extends Exception {
// Construtor padrão da classe.
    public ContaException (String _mensagem) {
        // Deve chamar o construtor da superclasse.
    }
}
```
Requisitos:
- A sua classe conta bancária deve permitir apenas saques inferiores a R$ 500,00 ou que não façam com que a soma entre o saldo e o limite da conta resultem em um valor menor do que zero. Caso estas condições não se cumpram, deve ser lançada uma ContaException com uma mensagem que identifique o tipo de erro.
- A conta não deve permitir depósitos superiores a R$ 1.000,00. Caso esta condição não se cumpra, deve ser lançada uma ContaException com uma mensagem que identifique o tipo de erro.
- Crie uma classe para testar a classe ContaBancaria.
