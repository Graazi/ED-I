package trabalhoLDE;

public class ListaPrincipal {
    private NodePrincipal primeiro;
    private NodePrincipal ultimo;
    private NodePrincipal qtd;

    public ListaPrincipal() {
        this.primeiro = null;
    }

    public void inserirTermo(Integer valor) { // inserir o novo antes do primeiro
        NodePrincipal novo = new NodePrincipal(valor);
        NodePrincipal retorno = buscar(valor);
        if (retorno == null) {  // não achou, pode inserir
            if (this.isEmpty() == true) { // lista vazia
                this.primeiro = novo;
                this.ultimo = novo;
            } else {  // lista não vazia
                novo.setProx(this.primeiro);
                this.primeiro.setAnt(novo);
                this.primeiro = novo;
            }
            System.out.println("Inserção efetuada.");
        } 
    }

    public void inserirLetra(Integer valor) {
        NodePrincipal newNode = new NodePrincipal(valor);

        if (primeiro == null) {
            primeiro = newNode;
            primeiro.prox = primeiro;
        } else {
            NodePrincipal atual = primeiro;
            while (atual.prox != primeiro) {
                atual = atual.prox;
            }
            atual.prox = newNode;
            newNode.prox = primeiro;
        }
    }
    
    public void exibirTermo() {
        if (isEmpty()) {
            System.out.println("Lista principal vazia.");
            return;
        }

        NodePrincipal atual = primeiro;
        do {
            System.out.print(atual.info + " ");
            atual = atual.prox;
        } while (atual != primeiro);
        System.out.println();
    }

    public NodePrincipal buscar(Integer valor) {
        NodePrincipal nodePrincipal;
        NodeSecundario nodeSecundario = null;
        boolean achou = false;

        nodePrincipal = this.primeiro;
        while (nodeSecundario != null) {
            if (nodeSecundario.getTermo().compareTo(valor) == 0) {
                achou = true;
                break;
            }
            nodeSecundario = nodeSecundario.getProx();
        }
        if (achou == true) {
            return nodePrincipal;
        } else {
            return null;
        }
    }
    
    public boolean isEmpty() {
        if (this.primeiro == null && this.ultimo == null && this.qtd == null) {
            return true;
        } else {
            return false;
        }
    }


}