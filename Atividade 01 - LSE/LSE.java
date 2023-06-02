public class LSE {
    private LSENode primeiro;
    
    public void inserir (Funcionario f) {
        LSENode novo;
        novo = new LSENode ();    
        novo.setInfo(f);          
        
        if (this.primeiro == null) {    
             this.primeiro = novo;
        }
        else {
            novo.setProx(this.primeiro);
            this.primeiro = novo;
        }
    }
}

