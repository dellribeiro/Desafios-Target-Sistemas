/*
5) Escreva um programa que inverta os caracteres de um string.


IMPORTANTE:

a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida
no código;

b) Evite usar funções prontas, como, por exemplo, reverse;
 */

package br.com.targetsistemas.ex05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)){
            System.out.print("Informe uma String para que ela seja invertida: ");
            String str = scanner.nextLine();
            String strInvertida = inverteString(str);
            System.out.println("String invertida: " + strInvertida);

        }catch (Exception e){
            e.getMessage();
        }
    }

    private static String inverteString(String str) {
        String strInvertida = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            strInvertida += str.charAt(i);
        }
        return strInvertida;
    }

}
