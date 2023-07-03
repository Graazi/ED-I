package trabalhoLDE;

public class NodeSecundario {
    Termo termo;
    NodeSecundario prox;

    public NodeSecundario(Termo termo) {
        this.termo = termo;
        this.prox = null;
    
    }

    public Termo getTermo() {
        return termo;
    }

    public void setTermo(Termo termo) {
        this.termo = termo;
    }

    public NodeSecundario getProx() {
        return prox;
    }

    public void setProx(NodeSecundario prox) {
        this.prox = prox;
    }
    
}
