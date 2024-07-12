public class Usuario {
    public static void main(String[] args) throws Exception {

        //Você pode testar em "BreakPoint" para testar parte por parte, marque a linha à esquerda, clique em "Debug" e aperte F10.

        SmartTv smartTv = new SmartTv();
        
        //Testar estado inicial da SmartTV
        System.out.println("Estado inicial da SmartTv: " + "Está ligada? " + smartTv.ligada + " | Canal atual: " + smartTv.canal + " | Volume atual: " + smartTv.volume);

        //Ligar e Desligar a SmartTV
        smartTv.ligar();
        smartTv.desligar();

        //Diminuindo o volume 3x e aumentando 1x, no final terá que parar em 23
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Volume Atual: " + smartTv.volume);

        //Aumentando o canal 5x e diminuindo 2x, no final terá que parar em 4
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();

        System.out.println("Canal atual: " + smartTv.canal);

        //Mudando canal para o número desejado
        smartTv.mudarCanal(57);

        System.out.println("Canal atual: " + smartTv.canal);

    }
}
