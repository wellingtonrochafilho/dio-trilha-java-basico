public class AparelhoTelefonico {
    private String numeroChamada;

    public void ligar(String numero) {
        this.numeroChamada = numero;
        System.out.println("Ligando para: " + numero);
    }

    public void atender() {
        System.out.println("Atendendo chamada de: " + numeroChamada);
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }
}
