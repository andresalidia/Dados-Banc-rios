# CreateTextFile

Este projeto Java permite a criação e manipulação de um arquivo de texto (`clients.txt`) para armazenar registros de contas. Utiliza entrada de dados via `JOptionPane` para adicionar informações de contas e armazena essas informações em um arquivo de texto.

## Funcionalidades

- Criação de um arquivo de texto chamado `clients.txt`.
- Entrada de dados do usuário para armazenar registros de conta com número de conta, nome, sobrenome e saldo.
- Validação de entradas: O número da conta deve ser maior que 0, e o saldo deve ser um número válido.
- Exibe uma mensagem de erro caso o arquivo não possa ser criado ou se houver problemas durante a gravação dos dados.
- Apresenta os registros inseridos em uma janela de diálogo ao final.

## Estrutura do Código

- `openFile()`: Abre o arquivo `clients.txt` para gravação. Se houver falha na abertura, uma mensagem de erro é exibida e o programa fecha automaticamente após 5 segundos.
- `addRecords()`: Solicita ao usuário os dados de uma conta (número, nome, sobrenome e saldo) e os grava no arquivo.
  - Validações de número da conta e entrada de saldo.
  - Exibe os registros ao final da inserção.
- `closeFile()`: Fecha o arquivo após a gravação.

## Como Usar

1. Execute o programa.
2. Insira o número da conta, nome, sobrenome e saldo conforme solicitado.
3. Para finalizar a inserção de registros, pressione "Cancelar" na caixa de diálogo do número da conta.
4. O programa exibirá os registros inseridos e os gravará no arquivo `clients.txt`.

## Dependências

Este projeto utiliza a classe `AccountRecord` do pacote `com.deitel.ch17`.

## Tratamento de Erros

- O programa trata exceções como `SecurityException` (acesso negado ao arquivo), `FileNotFoundException` (erro ao abrir o arquivo) e `FormatterClosedException` (erro ao gravar no arquivo).
- Mensagens de erro são exibidas ao usuário via `JOptionPane`.

## Exemplo de Saída no Arquivo

