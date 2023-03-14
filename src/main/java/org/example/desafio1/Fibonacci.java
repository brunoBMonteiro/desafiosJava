package org.example.desafio1;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número inteiro para verificar se ele pertence à sequência de Fibonacci: ");
        int num = input.nextInt();
        boolean pertence = verificaFibonacci(num);
        if (pertence) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }
        input.close();
    }
    public static boolean verificaFibonacci(int num) {
        int a = 0, b = 1, c = 1;

        while (c < num) {
            c = a + b;
            a = b;
            b = c;
        }
        return c == num || num == 0;
    }
}
