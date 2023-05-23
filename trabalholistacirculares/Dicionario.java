import java.util.ArrayList;
import java.util.List;

public class Dicionario {
    private List<NodePrincipal> listaPrincipal;

    public Dicionario() {
        listaPrincipal = new ArrayList<>();
        for (char letra = 'A'; letra <= 'Z'; letra++) {
            listaPrincipal.add(new NodePrincipal(letra));
        }
    }

    public void adicionarTermo(String nome, String definicao) {
        char primeiraLetra = Character.toUpperCase(nome.charAt(0));
        NodePrincipal nodePrincipal = buscarNodePrincipal(primeiraLetra);
        if (nodePrincipal != null) {
            nodePrincipal.adicionarTermo(nome, definicao);
        } else {
            System.out.println("A letra " + primeiraLetra + " não está presente no dicionário.");
        }
    }

    public String buscarTermo(String nome) {
        char primeiraLetra = Character.toUpperCase(nome.charAt(0));
        NodePrincipal noPrincipal = buscarNodePrincipal(primeiraLetra);
        if (noPrincipal != null) {
            return noPrincipal.buscarTermo(nome);
        } else {
            return null;
        }
    }

    public boolean removerTermo(String nome) {
        char primeiraLetra = Character.toUpperCase(nome.charAt(0));
        NodePrincipal nodePrincipal = buscarNodePrincipal(primeiraLetra);
        if (nodePrincipal != null) {
            return nodePrincipal.removerTermo(nome);
        } else {
            return false;
        }
    }

    public void exibirDicionario() {
        for (NodePrincipal nodePrincipal : listaPrincipal) {
            nodePrincipal.exibirListaSecundaria();
        }
    }

    private NodePrincipal buscarNodePrincipal(char letra) {
        for (NodePrincipal nodePrincipal : listaPrincipal) {
            if (nodePrincipal.getLetra() == letra) {
                return nodePrincipal;
            }
        }
        return null;
    }
    
}
