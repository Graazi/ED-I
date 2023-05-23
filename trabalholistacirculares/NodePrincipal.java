public import java.util.ArrayList;
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
        NodeSecundario noSecundario = buscarNoSecundario(nome);
        if (noSecundario != null) {
            System.out.println("O termo " + nome + " já existe no dicionário.");
        } else {
            noSecundario = new NodeSecundario(nome, definicao);
            listaSecundaria.add(noSecundario);
            Collections.sort(listaSecundaria, Comparator.comparing(NodeSecundario::getNome));
        }
    }

    public String buscarTermo(String nome) {
        NodeSecundario noSecundario = buscarNodeSecundario(nome);
        if (noSecundario != null) {
            return noSecundario.getDefinicao();
        } else {
            return null;
        }
    }

    public boolean removerTermo(String nome) {
        NodeSecundario noSecundario = buscarNodeSecundario(nome);
        if (noSecundario != null) {
            listaSecundaria.remove(noSecundario);
            return true;
        } else {
            return false;
        }
    }

    public void exibirListaSecundaria() {
        System.out.println("===== Letra " + letra + " =====");
        for (NodeSecundario noSecundario : listaSecundaria) {
            System.out.println("Termo: " + noSecundario.getNome());
            System.out.println("Definição: " + noSecundario.getDefinicao());
            System.out.println("----------------------");
        }
        System.out.println();
    }

    private NodeSecundario buscarNoSecundario(String nome) {
        for (NodeSecundario noSecundario : listaSecundaria) {
            if (noSecundario.getNome().equals(nome)) {
                return noSecundario;
            }
        }
        return null;
    }
}
 {
    
}
