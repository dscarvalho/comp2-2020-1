package br.ufrj.dcc.comp2.aula3.lista2;

import java.util.Date;
import java.util.Stack;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exercicio3 {
    public static void main(String[] args) {
        // Item a
        //double[] v = new double[-10];

        //v[0] = 1;

        //System.out.printf("Número %f\n", v[0]);

        // Item b
        LocalDateTime dataLocal = LocalDateTime.now();

        System.out.println(String.valueOf(dataLocal));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/Y, E, H:m:s");
        System.out.println(dataLocal.minusDays(1).format(formatter));

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
}