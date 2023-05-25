class NodePrincipal {
    char letra;
    NodeSecundario listaSecundaria;
    NodePrincipal next;

    public NodePrincipal (char letra) {
        this.letra = letra;
        this.listaSecundaria = null;
        this.next = null;
    }
}
