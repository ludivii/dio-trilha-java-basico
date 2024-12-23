public class FormatadorCepExemplo {

    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("2376506");
        } catch (CepInvalidoException e) {
            System.out.println("Cep não corresponde as regras de negocio");;
        }    
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8){
            throw new CepInvalidoException();
        }

        return "23.765-064";
    }
}
