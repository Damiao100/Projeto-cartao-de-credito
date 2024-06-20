# Projeto-cartao-de-credito

Este projeto é uma aplicação para registrar compras em um cartão de crédito, oferecendo uma interface simples para o usuário gerenciar suas transações.

## 🔨 Objetivos do Projeto

### 1. Classe de Compras
- **Descrição**: A classe `Compra` é criada para representar uma transação específica.
- **Atributos**: Cada instância de `Compra` possui uma descrição e um valor.

### 2. Classe de Cartão de Crédito
- **Descrição**: A classe `Cartao` é responsável por gerenciar o limite do cartão, o saldo e a lista de compras.
- **Métodos**: Inclui um método para registrar uma compra, verificando se o saldo disponível permite a transação.

### 3. Classe Principal com Método Main
- **Passos**:
  1. Solicitar ao usuário o limite do cartão de crédito.
  2. Criar um objeto `Cartao` com o limite fornecido.
  3. Pedir ao usuário a descrição e o valor da compra.
  4. Criar um objeto `Compra` com as informações fornecidas.
  5. Registrar a compra no cartão de crédito e informar ao usuário se a transação foi realizada ou não, com base no saldo remanescente.
  6. Perguntar ao usuário se deseja registrar uma nova compra ou finalizar.
  7. Repetir os passos 3 a 6 caso o usuário deseje continuar. Se não, imprimir o saldo final do cartão e a lista de compras realizadas, ordenadas pelo valor.

## Observações
- Utilização da classe `Scanner` para ler as informações fornecidas pelo usuário.
- Implementação de construtores nas classes para facilitar a criação de objetos com os atributos necessários.

