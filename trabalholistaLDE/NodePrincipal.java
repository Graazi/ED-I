package trabalholistaLDE;
public class NodePrincipal {
    private NodePrincipal next;
    private NodePrincipal ant;
    private Integer letra;
    
    public NodePrincipal (Integer letra) {
        this.letra = letra;
        this.listaSecundaria = new ListaSecundaria();
        this.next = null;
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
    public Integer getLetra() {
        return letra;
    }
    public void setLetra(Integer letra) {
        this.letra = letra;
    }

    
}
