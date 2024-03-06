/*
1) Observe o trecho de código abaixo:

int INDICE = 13, SOMA = 0, K = 0;

enquanto K < INDICE faça

{

K = K + 1;

SOMA = SOMA + K;

}

imprimir(SOMA);



Ao final do processamento, qual será o valor da variável SOMA?

 */

package br.com.targetsistemas.ex01;

public class Main {
    public static void main(String[] args) {
        int INDICE = 13;
        int SOMA = 0;
        int K = 0;

        while(K < INDICE) {
            K +=1;
            SOMA += K;

        }
        System.out.println(SOMA);
    }
}
// NO final do processo SOMA tera o valor de 91