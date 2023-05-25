import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NodePrincipal {
    private char letra;
    private List<NodeSecundario> listaSecundaria;

    public NodePrincipal(char letra) {
        this.letra = letra;
        listaSecundaria = new ArrayList<>();
    }

    public char getLetra() {
        return letra;
    }

    public void adicionarTermo(String nome, String definicao) {
        NodeSecundario nodeSecundario = buscarNodeSecundario(nome);
        if (nodeSecundario != null) {
            System.out.println("O termo " + nome + " já existe no dicionário.");
        } else {
            nodeSecundario = new NodeSecundario(nome, definicao);
            listaSecundaria.add(nodeSecundario);
            Collections.sort(listaSecundaria, Comparator.comparing(NodeSecundario::getNome));
        }
    }

    public String buscarTermo(String nome) {
        NodeSecundario nodeSecundario = buscarNodeSecundario(nome);
        if (nodeSecundario != null) {
            return nodeSecundario.getDefinicao();
        } else {
            return null;
        }
    }

    public boolean removerTermo(String nome) {
        NodeSecundario nodeSecundario = buscarNodeSecundario(nome);
        if (nodeSecundario != null) {
            listaSecundaria.remove(nodeSecundario);
            return true;
        } else {
            return false;
        }
    }

    public void exibirListaSecundaria() {
        System.out.println("===== Letra " + letra + " =====");
        for (NodeSecundario nodeSecundario : listaSecundaria) {
            System.out.println("Termo: " + nodeSecundario.getNome());
            System.out.println("Definição: " + nodeSecundario.getDefinicao());
        }
    }

    private NodeSecundario buscarNodeSecundario(String nome) {
        for (NodeSecundario nodeSecundario : listaSecundaria) {
            if (nodeSecundario.getNome().equals(nome)) {
                return nodeSecundario;
            }
        }
        return null;
    }
    
}
