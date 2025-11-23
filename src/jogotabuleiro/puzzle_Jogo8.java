/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jogotabuleiro;

import java.util.Scanner;

public class puzzle_Jogo8 {

    // ------------------------------------
    // Exibe o tabuleiro para o jogador
    // ------------------------------------
    public static void exibirTabuleiro(int[][] t) {
        System.out.println("\nTabuleiro:");
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print((t[i][j] == 0 ? " " : t[i][j]) + " ");
            }
            System.out.println();
        }
    }

// ------------------------------------
// Move a peça, se possível
// ------------------------------------
    public static boolean moverPeca(int[][] t, int numero) {
        int linhaPeca = -1, colunaPeca = -1;
        int linhaVazio = -1, colunaVazio = -1;

// Localiza a peça e o vazio
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {

                if (t[i][j] == numero) {
                    linhaPeca = i;
                    colunaPeca = j;
                }

                if (t[i][j] == 0) {
                    linhaVazio = i;
                    colunaVazio = j;
                }
            }
        }

// Verifica adjacência (mesma linha ou mesma coluna)
        boolean adjacente = (linhaPeca == linhaVazio && Math.abs(colunaPeca - colunaVazio) == 1) || (colunaPeca == colunaVazio && Math.abs(linhaPeca - linhaVazio) == 1);

        if (!adjacente) {
            return false;
        }

// Troca
        t[linhaVazio][colunaVazio] = numero;
        t[linhaPeca][colunaPeca] = 0;

        return true;
    }

// ------------------------------------
// Embaralha o tabuleiro com movimentos válidos
// ------------------------------------
    public static void embaralhar(int[][] t) {
        for (int i = 0; i < 50; i++) {   // quantidade de tentativas de movimentos aleatórios
            int numero = 1 + (int) (Math.random() * 8); // de 1 a 8
            moverPeca(t, numero); // tenta mover
        }
    }

    public static void main(String[] args) {

        int[][] tabuleiro = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 0} // 0 representa o espaço vazio
        };

        Scanner entrada = new Scanner(System.in);

        System.out.println("=== JOGO DO 8 ===");
        System.out.println("Objetivo: Organizar os numeros de 1 a 8 deixando o 0 no final.\n");

        // Embaralha o tabuleiro antes de começar
        embaralhar(tabuleiro);

        while (true) {

            exibirTabuleiro(tabuleiro);

            System.out.print("Digite o numero que deseja mover (1 a 8): ");
            int numero = entrada.nextInt();

            if (!moverPeca(tabuleiro, numero)) {
                System.out.println("Movimento invalido! So e possivel mover pecas adjacentes ao espaco vazio.\n");
            }

        }
    }
}
