package trabalhoLDE;

public class NodePrincipal {
    ListaSecundaria listaSecundaria;
    NodePrincipal prox;
    private NodePrincipal ant;
    Integer info;

    public NodePrincipal (Integer valor) {
        this.info = valor;
        this.listaSecundaria = new ListaSecundaria();
        this.prox = null;
    }

    public ListaSecundaria getListaSecundaria() {
        return listaSecundaria;
    }

    public void setListaSecundaria(ListaSecundaria listaSecundaria) {
        this.listaSecundaria = listaSecundaria;
    }

    public NodePrincipal getProx() {
        return prox;
    }

    public void setProx(NodePrincipal prox) {
        this.prox = prox;
    }

    public NodePrincipal getAnt() {
        return ant;
    }

    public void setAnt(NodePrincipal ant) {
        this.ant = ant;
    }

    public Integer getInfo() {
        return info;
    }

    public void setInfo(Integer info) {
        this.info = info;
    }

    
}
