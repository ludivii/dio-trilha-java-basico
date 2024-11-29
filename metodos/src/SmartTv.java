public class SmartTv {
    
    private boolean ligada = false;
    private int canal = 1;
    private int volume = 25;

    public boolean getLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void ligar(){
        ligada = true;
        System.out.println("Ligando TV");
    }

    public void desligar(){
        ligada  = false;
        System.out.println("Desligando TV");
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Mudando o canal para: " + canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("Mudando o canal para: " + canal);
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Mudando o canal para: " + canal);
    }
}
