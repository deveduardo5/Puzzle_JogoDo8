## Jogo do 8 (8-Puzzle) em Java

Este projeto foi desenvolvido para a disciplina Algoritmos e Programação I, do curso Análise e Desenvolvimento de Sistemas do Senac.<br>
O objetivo é implementar um jogo de tabuleiro utilizando arrays bidimensionais, explorando lógica, funções e interação com o usuário.

## Descrição do Jogo

O Jogo do 8 consiste em um tabuleiro 3x3 contendo números de 1 a 8 e um espaço vazio representado pelo número 0.

O objetivo é reorganizar o tabuleiro para alcançar a forma final:

```
1 2 3
4 5 6
7 8 _
```

O jogador move peças digitando o número da peça desejada.<br>
Somente peças que estejam ao lado do espaço vazio podem ser movimentadas.

## Funcionalidades

- Tabuleiro implementado como matriz 3x3<br>
- Embaralhamento automático do tabuleiro<br>
- Movimentação de peças adjacentes ao espaço vazio<br>
- Exibição atualizada do tabuleiro a cada jogada<br>
- Verificação automática da condição de vitória<br>
- Interação via teclado<br>
- Código modularizado em funções sem uso de variáveis globais

## Estrutura do Código

O programa utiliza quatro funções principais:

- exibirTabuleiro(): exibe o tabuleiro no console<br>
- moverPeca(): movimenta peças adjacentes ao espaço vazio<br>
- verificarVitoria(): verifica se a condição de vitória foi atingida<br>
- embaralhar(): mistura as peças com movimentos válidos

O tabuleiro é passado como parâmetro entre as funções, garantindo modularidade e organização.

## Divisão do Trabalho entre os Membros do Grupo

**@deveduardo5** - Eduardo Alcantara de Souza

- Implementação do tabuleiro e exibição visual

**@Rickzss** - Henrique Gonçalves da Silva Espíndola

- Embaralhamento inicial, movimentação das peças e lógica de adjacência

**@flaviosb** - Flavio da Silva Batista

- Verificação de vitória, interação com o usuário e controle do fluxo principal do jogo

## Objetivo

Este projeto demonstra os seguintes conteúdos:

- Arrays bidimensionais<br>
- Estruturas de repetição e decisão<br>
- Funções com parâmetros e retorno<br>
- Boas práticas de organização e legibilidade de código<br>
- Interação básica com o usuário via console
