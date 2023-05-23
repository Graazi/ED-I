public import java.util.ArrayList;
import java.util.List;

public class Dicionario {
    private List<NoPrincipal> listaPrincipal;

    public Dicionario() {
        listaPrincipal = new ArrayList<>();
        for (char letra = 'A'; letra <= 'Z'; letra++) {
            listaPrincipal.add(new NoPrincipal(letra));
        }
    }

    public void adicionarTermo(String nome, String definicao) {
        char primeiraLetra = Character.toUpperCase(nome.charAt(0));
        NoPrincipal noPrincipal = buscarNoPrincipal(primeiraLetra);
        if (noPrincipal != null) {
            noPrincipal.adicionarTermo(nome, definicao);
        } else {
            System.out.println("A letra " + primeiraLetra + " não está presente no dicionário.");
        }
    }

    public String buscarTermo(String nome) {
        char primeiraLetra = Character.toUpperCase(nome.charAt(0));
        NoPrincipal noPrincipal = buscarNoPrincipal(primeiraLetra);
        if (noPrincipal != null) {
            return noPrincipal.buscarTermo(nome);
        } else {
            return null;
        }
    }

    public boolean removerTermo(String nome) {
        char primeiraLetra = Character.toUpperCase(nome.charAt(0));
        NoPrincipal noPrincipal = buscarNoPrincipal(primeiraLetra);
        if (noPrincipal != null) {
            return noPrincipal.removerTermo(nome);
        } else {
            return false;
        }
    }

    public void exibirDicionario() {
        for (NoPrincipal noPrincipal : listaPrincipal) {
            noPrincipal.exibirListaSecundaria();
        }
    }

    private NoPrincipal buscarNoPrincipal(char letra) {
        for (NoPrincipal noPrincipal : listaPrincipal) {
            if (noPrincipal.getLetra() == letra) {
                return noPrincipal;
            }
        }
        return null;
    }
}
 {
    
}
