package org.example.desafio4;

import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String str = sc.nextLine();

        String strInvertida = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            strInvertida += str.charAt(i);
        }

        System.out.println("A string invertida é: " + strInvertida.toLowerCase());
    }
}
