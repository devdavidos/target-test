package br.com.targetsistemas.desafio.desafio01;

public class Soma {
    public static void main(String[] args) {

        int indice = 13, soma = 0, k = 0;

        while(k < indice) {
            k += 1;
            soma += k;
        }
        System.out.println("Soma: " + soma);
    }
}
