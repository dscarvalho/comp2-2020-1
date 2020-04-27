package br.ufrj.dcc.comp2.aula3.lista2;

import java.util.Date;
import java.util.Stack;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;



public class Exercicio3 {
    public static void testaMemoria() {
        // Item a - I
        double[] v = new double[1000000000];

        v[0] = 1;

        System.out.printf("Número %f\n", v[0]);

    }

    public static void testaAlocacaoNegativa() {
        // Item a - II
        double[] v = new double[-10];

        v[0] = 1;

        System.out.printf("Número %f\n", v[0]);

    }

    public static void representaDataHora() {
        // Item b
        LocalDateTime dataLocal = LocalDateTime.now();

        System.out.println(String.valueOf(dataLocal));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/Y, E, H:m:s");
        System.out.println(dataLocal.minusDays(1).format(formatter));
    }

    public static void usaPilha() {
        Stack<Integer> pilha = new Stack<Integer>();

        pilha.push(10);
        pilha.push(5);

        System.out.println(String.valueOf(pilha));

        int num = pilha.pop();
        System.out.println(String.valueOf(num));
        System.out.println(String.valueOf(pilha));

        pilha.push(100);
        pilha.push(42);

        num = pilha.peek();

        System.out.println(String.valueOf(num));
        System.out.println(String.valueOf(pilha));

        if (!pilha.empty()) {
            pilha.pop();
        }
    }

    public static void main(String[] args) {
        switch(args[0]) {
            case "Memoria": Exercicio3.testaMemoria();
                break;
            case "AlocacaoNegativa": Exercicio3.testaAlocacaoNegativa();
                break;
            case "DataHora": Exercicio3.representaDataHora();
                break;
            case "Pilha":  Exercicio3.usaPilha();
                break;
            default:
                break;
        }
    }
}