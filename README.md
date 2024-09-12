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

 Entrada de dados inválida:
 <br>
 ![image](https://github.com/user-attachments/assets/ecdc6470-609f-47d2-9f8b-ce484fefd6e4)
<br>
 Entrada de dados:
 <br>
![image](https://github.com/user-attachments/assets/5634efb4-02c7-4f2e-b51d-88adcc88d7d8)
<br>
![image](https://github.com/user-attachments/assets/c0535bec-1efc-4238-a56a-5477b106342f)
<br>
![image](https://github.com/user-attachments/assets/82d64771-58e2-44f0-a234-b24a0cbbf97d)
<br>
![image](https://github.com/user-attachments/assets/d9182723-5161-47bb-926f-749aa1cff520)
<br>
![image](https://github.com/user-attachments/assets/d1533fe2-9ece-45b7-84a0-550f3763d9ab)
<br>

## Vídeo Explicativo
<iframe width="560" height="315" src="https://www.youtube.com/embed/DBM-nFCUvjE?si=40ZPpPmvIj1fA2ng" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>







