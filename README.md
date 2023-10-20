<h1 align="center"><strong>Teste de Caixa Branca</strong></h1>

## **Introdução**
O código inserido dentro do repositório, demoninado de `Caixa Branca`, refere-se a uma conexão com um banco de dados criado hipotéticamente.

## **Estrutura**
O código está organizado dentro de uma classe denominada `User()`, utilizando a linguagem Java. Nele estão presentes os seguintes métodos/variáveis:

- Método - `conectarBD()`: Neste método é estabelecido a conexão com um banco de dados MySQL.
- Método - `verificarUsuario(String login, String senha)`: Neste método é realizado a verificação das credencias do usuário dentro do banco de dados, onde o resultado é armazenado dentro de uma variável denominada como `result` (booleana) e o nome do usuário é armazenado em uma variável denominada como `nome` (string).

## **Análise**

Fazendo uma análise minuciosa do código, é valido ressaltar os pontos a seguir:

- **Documentação:** O código possui uma grande escassez de comentários explicando cada parte do código, o que é algo que implica diretamente na organização e facilidade para análise.

- **Nomenclatura de Variáveis e Constantes:** Ao todo, é válido dizer que as variáveis possuem nomes aceitáveis e de fácil entendimento, porém ainda sim, há algumas que podem ser aperfeiçoadas deixando algo ma explicativo ou especifíco, no caso da variável `result`.

- **Legibilidade e Organização:** Em questão da estrura/formatação do código, pode-se dizer que o código tem muitas partes em que pode ser melhorado e consequentemente torna-lo mais legível. A organização das chaves que abrem e fecham estruturas, o uso de linhas em branco para o espaçamento de funções diferentes e a adição de mais comentários, contribuiriam bastante para deixar o código limpo, bem organizado e principalmente mais legível.

- **NullPointers:** O código não possui tratamento algum para valores nulos e nem exceções para erros que podem eventualmente acontecer. É necessário o acréscimo desse tratamento de exceções para que o código fique blindado de possíveis erros/falhas que podem prejudicar o funcionamento correto da aplicação.

- **Arquitetura:** Não é possível ao certo dizer qual foi a arquitetura usada no desenvolvimento desse código, pois ela não está muito bem explícita e definida, o que evidencia novamente a má organização da aplicação em geral.

- **Conexões:** As conexões com a base de dados não são tão bem realizadas, uma vez que a senha e o login ficam explícitas no código, além de que, não são fechadas corretamente, o que deixa o sistema vulnerável a possíveis vazamentos de dados. Portanto, seria bom utilizar métodos eficazes para tratar o BD com o código em si, gerando assim, uma segurança maior para com os dados coletados.

## **Classe `User()`**

Dentro do código, há uma classe chamada `User()`, na qual é utilizada para autenticar o usuário e estebalecer uma conexão o banco de dados MySQL utilizado.

Como dito anteriormente, a classe `User()`, possui os seguintes métodos/variáveis:
- `conectarBD()`: Método que estabelece uma conexão efetiva com o banco de dados MySQL;
- `verificarUsuario(String login, String senha)`: Método que verifica as credenciais, ou seja, o login e a senha do usuário, consultando diretamente o banco de dados;
- `nome`: Variável que receberá como valor, o nome do usuário;
- `result`: Variável que receberá como valor, o resultado da autenticação, ou seja, terá como valores, **verdadeiro** para sucesso e **falso** para falha. 

### **Como usar:**

A classe `User()`, basicamente, pode ser usada para gerar uma conexão com o banco de dados MySQL, verificando o nome do usuário e a senha definida. Vejamos um exemplo a seguir:

```java
public static void main(String[] args) {
    User user = new User();
		
    System.out.println(user.conectarBD());
		
    String login = "admin";
    String senha = "123456";
		
    System.out.println(user.verificarUsuario(login, senha));
}
