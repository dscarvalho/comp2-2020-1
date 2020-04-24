package br.ufrj.dcc.comp2.aula3.lista1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Implementa um programa que recebe da entrada padrão uma lista de palavras e 
 * retorna para a saída padrão a lista ordenada alfabeticamente, com uma palavra por linha.
 */
public class Exercicio3 {
    public static void main(String[] args) {
        // Criar uma lista dinâmica para guardar as palavras
        ArrayList<String> listaPalavras = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra por linha.\nDigite uma linha vazia (<Enter>) para terminar.");

        // Ler as palavras da entrada padrão
        boolean fim = false;
        while (!fim) {
            String palavra = scanner.nextLine();

            if (palavra.strip() == "") {
                fim = true;
            }
            else {
                // Preencher a lista de palavras
                listaPalavras.add(palavra);
            }
        }
     
        // Ordenar as palavras da lista
        Collections.sort(listaPalavras);

        // Imprimir as palavras ordenadas na saída padrão
        for (String palavra : listaPalavras) {
            System.out.println(palavra);
        }

        //System.out.println(String.valueOf(listaPalavras));
    }
}