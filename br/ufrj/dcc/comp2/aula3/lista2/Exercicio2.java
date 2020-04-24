package br.ufrj.dcc.comp2.aula3.lista2;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * Recebe da entrada padrão dois vetores de números reais (um vetor por linha, em Rn), 
 * calcula o ângulo entre eles e escreve o ângulo, em graus, na saída padrão.
 */
public class Exercicio2 {
    /**
     * Lê um vetor de números reais da entrada desejada.
     * @param scanner Objeto scanner utilizado para apontar para a entrada desejada.
     * @return O vetor preenchido correspondente a entrada desejada.
     */
    public static ArrayList<Double> leVetor(Scanner scanner) {
        ArrayList<Double> vetor = new ArrayList<Double>();

        String linha = scanner.nextLine();
        Scanner scannerDouble = new Scanner(linha);

        while (scannerDouble.hasNextDouble()) {
            vetor.add(scannerDouble.nextDouble());
        }
        
        return vetor;
    }

    /**
     * Calcula o ângulo entre dois vetores de números reais.
     * @param vetor1 O primeiro vetor
     * @param vetor2 O segundo vetor
     * @return O ângulo entre vetor1 e vetor2, em radianos.
     */
    public static double calculaAngulo(ArrayList<Double> vetor1, ArrayList<Double> vetor2) {
        if (vetor1.size() != vetor2.size()) {
            System.out.println("Os vetores devem ter o mesmo tamanho!");
            return 0;
        }

        // Calcular o cosseno do angulo entre os vetores
        double prod_interno = 0;
        double norma_v1 = 0;
        double norma_v2 = 0;

        for (int i = 0; i < vetor1.size(); i++) {
            prod_interno += vetor1.get(i) * vetor2.get(i);
            norma_v1 += vetor1.get(i) * vetor1.get(i);
            norma_v2 += vetor2.get(i) * vetor2.get(i);
        }

        norma_v1 = Math.sqrt(norma_v1);
        norma_v2 = Math.sqrt(norma_v2);

        double cosseno = prod_interno / (norma_v1 * norma_v2);

        // Obter o angulo atraves da funcao arco-cosseno.
        return Math.acos(cosseno);
    }

    /**
     * Converte um ângulo dado em radianos para graus.
     * @param angulo O angulo a ser convertido, em radianos.
     * @return O angulo correspondente em graus.
     */
    public static double converterRadianosEmGraus(double angulo) {
        return angulo * (180 / Math.PI);
    }

    public static void main(String[] args) {
        //Ler os vetores de numeros da entrada padrao
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> vetor1 = Exercicio2.leVetor(scanner);
        ArrayList<Double> vetor2 = Exercicio2.leVetor(scanner);

        //Calcular o angulo entre os vetores
        double angulo = Exercicio2.calculaAngulo(vetor1, vetor2);

        //Converter o angulo para graus
        double anguloEmGraus = Exercicio2.converterRadianosEmGraus(angulo);

        //Imprimir o angulo na saida padrao
        System.out.printf("O ângulo entre os vetores é %.3f\n", anguloEmGraus);
    }
}