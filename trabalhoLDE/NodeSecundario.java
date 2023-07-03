package trabalhoLDE;

public class NodeSecundario {
    Termo termo;
    NodeSecundario prox;
    private Integer info;

    public NodeSecundario(Integer termo) {
        this.info = termo;
        this.prox = null;
        this.termo = new Termo(null, null);
    
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

    public Integer getInfo() {
        return info;
    }

    public void setInfo(Integer info) {
        this.info = info;
    }

    
    
}
