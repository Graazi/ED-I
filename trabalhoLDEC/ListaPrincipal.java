package trabalhoLDEC;

public class ListaPrincipal {
    NodePrincipal primeiro;

    public ListaPrincipal() {
        this.primeiro = null;
    }


    public void inserirLetra(char letra) {
        NodePrincipal newNode = new NodePrincipal(letra);

        if (primeiro == null) {
            primeiro = newNode;
            primeiro.next = primeiro;
        } else {
            NodePrincipal atual = primeiro;
            while (atual.next != primeiro) {
                atual = atual.next;
            }
            atual.next = newNode;
            newNode.next = primeiro;
        }
    }
    
    public boolean isEmpty() {
        return primeiro == null;
    }

    public void exibirTermo() {
        if (isEmpty()) {
            System.out.println("Lista principal vazia.");
            return;
        }

        NodePrincipal atual = primeiro;
        do {
            System.out.print(atual.letra + " ");
            atual = atual.next;
        } while (atual != primeiro);
        System.out.println();
    }
}
