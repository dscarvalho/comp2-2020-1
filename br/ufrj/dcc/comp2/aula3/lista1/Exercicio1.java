package br.ufrj.dcc.comp2.aula3.lista1;

import java.util.Scanner;

/**
 * Implementa um programa que receba da entrada padrão as coordenadas de dois pontos no
 * espaço euclidiano e escreva na saída padrão a distância entre os dois pontos.
 */
public class Exercicio1 {
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
     * Calcula a distância entre dois pontos de duas dimensões.
     * @param ponto1x A coordenada x do primeiro ponto.
     * @param ponto1y A coordenada y do primeiro ponto.
     * @param ponto2x A coordenada x do segundo ponto.
     * @param ponto2y A coordenada y do segundo ponto.
     * @return A distância euclidiana entre os dois pontos.
     */
    public static double distancia(double ponto1x, double ponto1y, double ponto2x, double ponto2y) {
        double distancia = Math.sqrt(Math.pow(ponto1x - ponto2x, 2) + Math.pow(ponto1y - ponto2y, 2));

        return distancia;
    }

    public static void main(String[] args) {
        // Instancia um Scanner para ler da entrada padrão.
        Scanner scanner = new Scanner(System.in);

        // Converte nas coordenadas dos pontos;
        System.out.println("Digite a coordenada x do primeiro ponto:");
        double ponto1x = Exercicio1.leNumeroReal(scanner);

        System.out.println("Digite a coordenada y do primeiro ponto:");
        double ponto1y = Exercicio1.leNumeroReal(scanner);

        System.out.println("Digite a coordenada x do segundo ponto:");
        double ponto2x = Exercicio1.leNumeroReal(scanner);

        System.out.println("Digite a coordenada y do segundo ponto:");
        double ponto2y = Exercicio1.leNumeroReal(scanner);
        

        // Escreve a distancia na saida padrao
        System.out.printf("A distância entre os dois pontos é: %.3f \n", Exercicio1.distancia(ponto1x, ponto1y, ponto2x, ponto2y));
    }
}
