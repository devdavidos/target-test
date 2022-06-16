package br.com.targetsistemas.desafio.desafio05;

public class Converter {

    public static void main(String[] args) {


        String[] nome = new String[5];
        nome[0] = "D";
        nome[1] = "A";
        nome[2] = "V";
        nome[3] = "I";
        nome[4] = "D";

        for (int i = 0; i < nome.length; i++) {
            System.out.printf(nome[i]);
        }
        System.out.println("\n");

        for (int y = 4; y >= 0 && y <= nome.length; y--) {
            System.out.printf(nome[y]);
        }
    }
}
