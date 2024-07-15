public class SmartTv {

    //Variáveis que definem o estado inicial da SmartTv
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    //Métodos para ligar e desligar a SmartTV
    public void ligar(){
        ligada=true;
        System.out.println("Ligando SmartTv " + ligada);
    }

    public void desligar(){
        ligada=false;
        System.out.println("Desligando SmartTv " + ligada);
    }

    //Métodos para aumentar e diminuir o volume em +1 e -1
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando volume para: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo volume para: " + volume);
    }

    //Método para mudar de canal em +1 e -1
    public void aumentarCanal(){
        canal++;
        System.out.println("Aumentando canal para: " + canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("Diminuindo canal para: " + canal);
    }

    //ou

    //Método para mudar canal para número escolhido
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Mudando para canal " + canal);
    }

}
