package br.com.targetsistemas.desafio.desafio02;

public class Calculadora {

    public static int fibonacci(int num) {
        if(num < 2) {
            return 1;
        }
        return fibonacci(num-1) + fibonacci(num-2);
    }

    public static void main(String[] args) {
        for (int i=0; i<10; i++) {
            System.out.println(Calculadora.fibonacci(i) + " pertence a seguência!");
        }
    }
}
