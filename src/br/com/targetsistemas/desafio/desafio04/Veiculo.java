package br.com.targetsistemas.desafio.desafio04;

public class Veiculo {
    public static void main(String[] args) {
        double distancia = 100;
        double pedagio = 5;
        double velCarro = 110;
        double velCaminhao = 80;
        double disCarro;
        double disCaminhao;

        disCaminhao = distancia / (velCaminhao - (pedagio * 2));
        disCarro = distancia / velCarro;

        if (disCaminhao < disCarro) {
            System.out.printf("O caminhão está mais próximo da cidade: %.2f km", disCaminhao);
        } else {
            System.out.printf("O carro está mais próximo da cidade: %.2f km", disCarro);
        }

    }
}
