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
    
    public static void main(String[] args) {

        int[][] tabuleiro = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 0} // 0 representa o espaço vazio
        };

        Scanner entrada = new Scanner(System.in);

        System.out.println("=== JOGO DO 8 ===");
        System.out.println("Objetivo: Organizar os numeros de 1 a 8 deixando o 0 no final.\n");
        
        while (true) {
            
            exibirTabuleiro(tabuleiro);

            System.out.print("Digite o numero que deseja mover (1 a 8): ");
            int numero = entrada.nextInt();
            
        }
    }
}
