/*
2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores
anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde,
informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado
pertence ou não a sequência.

IMPORTANTE:

Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;
 */

package br.com.targetsistemas.ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Informe um valor: ");
            int valor = scanner.nextInt();
            if (verificaFibonacci(valor)) {
                System.out.printf("O número %d é da sequencia de Fibonacci", valor);
            } else {
                System.out.printf("O número %d NÃO é da sequencia de Fibonacci", valor);
            }
        } catch (Exception e) {
            System.err.println("Valor inválido!! Tente novamente.");
        }
    }

    public static boolean verificaFibonacci(int valor) {
        int anterior = 0;
        int atual = 1;

        while (atual < valor) {
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
        return atual == valor;
    }
}
