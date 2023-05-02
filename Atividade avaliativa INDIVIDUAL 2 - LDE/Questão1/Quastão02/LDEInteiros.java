public class LDEInteiros {
    private LDENode primeiro;
    private LDENode ultimo;
    private int qtd;

    public LDENode getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(LDENode primeiro) {
        this.primeiro = primeiro;
    }

    public LDENode getUltimo() {
        return ultimo;
    }

    public void setUltimo(LDENode ultimo) {
        this.ultimo = ultimo;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    private boolean isEmpty(){
        if (this.primeiro == null && this.ultimo == null && qtd == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public void inserirOrdenado (int valor) {
        LDENode novo, atual, anterior;
        if (this.isEmpty() == true) {
            novo = new LDENode (valor);
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd = 1;
            System.out.println("Inserção efetuada.");
        }
        else { // lista não vazia
            if (valor == this.primeiro.getInfo()) {
                System.out.println("Valor repetido. Inserção não efetuada.");
            }
            else if (valor < this.primeiro.getInfo()) { // inserir antes do primeiro
                novo = new LDENode (valor);
                this.primeiro.setAnt(novo);
                novo.setProx(this.primeiro);
                this.primeiro = novo;
                this.qtd++; 
                System.out.println("Inserção efetuada.");
            }
            else if (valor == this.ultimo.getInfo()) {
                System.out.println("Valor repetido. Inserção não efetuada.");
            }
            else if (valor > this.ultimo.getInfo()) { // inserir depois do último
                novo = new LDENode (valor);
                this.ultimo.setProx(novo);
                novo.setAnt(this.ultimo);
                this.ultimo = novo;
                this.qtd++;     
                System.out.println("Inserção efetuada.");
            }
            else { // inserir no "meio" da lista. Precisa procurar a posição de inserção
                atual = this.primeiro;
                while (atual != null) {
                    if (atual.getInfo() == valor) {
                        System.out.println("Valor repetido. Inserção não efetuada.");
                        return;
                    }
                    else if (atual.getInfo() > valor) { // achamos a posição de inserção
                        novo = new LDENode (valor);
                        anterior = atual.getAnt();
                        // inserir novo nó entre o anterior e o atual                       
                        anterior.setProx(novo);
                        novo.setAnt(anterior);
                        novo.setProx(atual);
                        atual.setAnt(novo);
                        this.qtd++;
                        System.out.println("Inserção efetuada.");
                        return;
                    }
                    else {
                        atual = atual.getProx();
                    }
                }
            }
        }
    }

}
