package br.com.targetsistemas.desafio.desafio03;

import br.com.targetsistemas.desafio.desafio02.Calculadora;

public class Complete {
    public static void main(String[] args) {

        int i = 1;
        do {

            System.out.printf(" " + i);
            i += 2;
        } while (i < 20);

        System.out.println("\n");

        int j = 2;
        do {
            System.out.printf(" " + j);
            j += j;
        } while (j < 1000);

        System.out.println("\n");

        for (int k = 0; k <= 10; k++) {
            System.out.printf(" " + k * k);
        }

        System.out.println("\n");

        for (int d = 2; d <= 20; d += 2) {
            System.out.printf(" " + d * d);
        }

        System.out.println("\n");


        int x1 = 1;
        int x2 = 0;
        int aux;
        for (int y = 0; y < 10; y++) {
            System.out.printf(" " + x1);
            aux = x1;
            x1 = x1 + x2;
            x2 = aux;
        }

        System.out.println("\n");

        System.out.println("f) 2, 10 , 12, 16, 17, 18, 19, 200 |São números começados com a letra D" );
    }
}
