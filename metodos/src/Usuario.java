public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv tv = new SmartTv();

        System.out.println("TV ligada ? " + tv.getLigada());

        tv.ligar();

        System.out.println("Canal atual ? " + tv.getCanal());

        tv.mudarCanal(13);

        System.out.println("Volume atual ? " + tv.getVolume());

        tv.diminuirVolume();
        tv.diminuirVolume();
        tv.diminuirVolume();
        tv.aumentarVolume();

        tv.desligar();

    }
}
