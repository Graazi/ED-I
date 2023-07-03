package trabalhoLDE;

public class NodePrincipal {
    ListaSecundaria listaSecundaria;
    private NodePrincipal next;
    private NodePrincipal ant;
    private Integer info;

    public NodePrincipal (Integer valor) {
        this.info = valor;
        this.listaSecundaria = new ListaSecundaria();
        this.next = null;
    }

    public ListaSecundaria getListaSecundaria() {
        return listaSecundaria;
    }

    public void setListaSecundaria(ListaSecundaria listaSecundaria) {
        this.listaSecundaria = listaSecundaria;
    }

    public NodePrincipal getNext() {
        return next;
    }

    public void setNext(NodePrincipal next) {
        this.next = next;
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
