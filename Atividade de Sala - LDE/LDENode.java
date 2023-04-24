public class LDENode{
    private char info;
    private LDENode prox;
    private LDENode ant;

    public LDENode(char info) {
        this.info = info;
    }

    public char getInfo() {
        return info;
    }

    public void setInfo(char info) {
        this.info = info;
    }

    public LDENode getProx() {
        return prox;
    }

    public void setProx(LDENode prox) {
        this.prox = prox;
    }

    public LDENode getAnt() {
        return ant;
    }

    public void setAnt(LDENode ant) {
        this.ant = ant;
    }
}
