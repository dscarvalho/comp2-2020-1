package br.ufrj.dcc.comp2.aula3.lista1;

import java.util.Scanner;

/**
 * Implementa um programa que recebe da entrada padrão uma lista de números e escreve na saída padrão a média dos números da lista. 
 * A primeira entrada é o tamanho da lista, seguido do primeiro elemento, segundo, e assim por diante.
 */
public class Exercicio2 {
    /**
     * Lê um numero real a partir de um Scanner.
     * @param scanner O objeto scanner de onde a entrada será lida.
     * @return O número lido. 
     */
    public static double leNumeroReal(Scanner scanner) {
        boolean numeroValido = false;
        double numeroReal = 0.0;
        
        while (!numeroValido) {
            String linha = scanner.nextLine();
            System.out.println("Leu: " + linha);
            try {
                numeroReal = Double.parseDouble(linha);
                numeroValido = true;
            }
            catch (NumberFormatException e) {
                System.out.println("Não é um número real válido");
            }
        }

        return numeroReal;
    }

    /**
     * Calcula a média aritmética de uma lista de números reais.
     * @param lista A lista de números.
     * @param tamanhoLista O tamanho da lista de números.
     * @return O número lido. 
     */
    public static double media(double[] lista, int tamanhoLista) {
        double soma = 0.0;

        for (int i = 0; i < tamanhoLista; i++) {
            soma += lista[i];
        }

        return soma / tamanhoLista;
    }

    public static void main(String[] args) {
        // Instancia um Scanner para ler da entrada padrão.
        Scanner scanner = new Scanner(System.in);

        // Converter o primeiro numero no tamanho da lista
        //Double tamanhoDouble = new Double(Exercicio2.leNumeroReal(scanner));
        //int tamanho = tamanhoDouble.intValue();
        System.out.println("Digite o tamanho da lista:");
        int tamanho = (int)Exercicio2.leNumeroReal(scanner);
        double[] listaNumeros = new double[1];

        try {
            listaNumeros = new double[tamanho];
        }
        catch (NegativeArraySizeException e) {
            System.out.println("Tamanho da lista não pode ser negativo!");
            System.exit(1);
        }

        // Preencher o array de numeros
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite o próximo número da lista:");
            listaNumeros[i] = Exercicio2.leNumeroReal(scanner);
        }

        // Calcular a media
        double media = Exercicio2.media(listaNumeros, tamanho);

        // Imprimir a media na saida padrao
        System.out.printf("A média dos números é: %.3f \n", media);
        
    }
}