package edu.pedro.Metodos;

public class Usuario {
    public static void main(String[] args) throws Exception{

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("A TV canal? " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("A TV canal? " + smartTv.canal);

        System.out.println("Volume atual? " + smartTv.volume);

        System.out.println("A TV ligada? " + smartTv.ligada);
        System.out.println("A TV canal? " + smartTv.canal);
        System.out.println("Volume atual? " + smartTv.volume);


        smartTv.ligar();
        System.out.println("Novo Status TV - " + smartTv.ligada);
        
        smartTv.desligar();
        System.out.println("Novo Status TV - " + smartTv.ligada);


    }
}
