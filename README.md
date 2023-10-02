<h1 align="center"><strong>Teste de Caixa Branca</strong></h1>

## **Introdução**
O código inserido dentro do repositório, demoninado de `Caixa Branca`, refere-se a uma conexão com um banco de dados criado hipotéticamente.

## **Estrutura**
O código está organizado dentro de uma classe denominada `User`, utilizando a linguagem Java. Nele estão presentes os seguintes métodos/variáveis:

- Método - `conectarBD()`: Neste método é estabelecido a conexão com um banco de dados MySQL.
- Método - `verificarUsuario(String login, String senha)`: Neste método é realizado a verificação das credencias do usuário dentro do banco de dados, onde o resultado é armazenado dentro de uma variável denominada como `result` (booleana) e o nome do usuário é armazenado em uma variável denominada como `nome` (string).

## **Análise**

Fazendo uma análise minuciosa do códgio, é valido ressaltar os pontos a seguir:

- **Documentação:** O código possui uma grande escassez de comentários explicando cada parte do código, o que é algo que implica diretamente na organização e facilidade para análise.

- **Nomenclatura de Variáveis e Constantes:** Ao todo, é válido dizer que as variáveis possuem nomes aceitáveis e de fácil entendimento, porém ainda sim há algumas que podem ser aperfeiçoadas deixando algo ma explicativo ou especifíco, no caso da variável `result`.

- **Legibilidade e Organização:** Em questão da estrura/formatação do código, pode-se dizer que o código tem muitas partes em que pode ser melhorado e consequentemente torna-lo mais legível. A organização das chaves que abrem e fecham estruturas, o uso de linhas em branco para o espaçamento de funções diferentes e a adição de mais comentários, contribuiriam bastante para deixar o código limpo, bem organizado e principalmente mais legível.

- **NullPointers:** O código não pssui tratamento algum para valores nulos nem exceções para erros que podem eventualmente acontecer. É necessário o acréscimo desse tratamento de exceções para que o código fique blindado de erros que podem prejudicar o funcionamento da aplicação.

- **Arquitetura:** Não é possível ao certo dizer qualfoi a arquitetura usada no desenvolvimento desse código, pois ela não está muito bem explícita e definida, o que evidencia novamente a má organização da aplicação em geral.

- **Conexões:** As conexões com a base de dados não são tão bem realizadas, uma vez que a senha e o login ficam explícitas no código, além de que, não são fechadas corretamente, o que deixar o sistema vulnerável a possíveis vazamentos de dados. Portanto, seria bom utilizar métodos eficazes para tratar o BD com o código em si, gerando assim, uma segurança maior para com os dados coletados.
