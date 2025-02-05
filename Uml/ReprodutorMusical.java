public class ReprodutorMusical {
    private String musicaAtual;

    public void tocar() {
        System.out.println("Tocando música: " + musicaAtual);
    }

    public void pausar() {
        System.out.println("Música pausada.");
    }

    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("Música selecionada: " + musica);
    }
}
