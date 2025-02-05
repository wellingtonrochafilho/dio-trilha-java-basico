import java.util.ArrayList;
import java.util.List;

public class NavegadorInternet {
    private List<String> abasAbertas = new ArrayList<>();

    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    public void adicionarNovaAba() {
        abasAbertas.add("Nova aba");
        System.out.println("Nova aba adicionada.");
    }

    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }
}
