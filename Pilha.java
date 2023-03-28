public class Pilha {

    public Object[] pilha;
    public int posicaoPilha;

    public Pilha() {
        this.posicaoPilha = -1;
        this.pilha = new Object[1000];
    }

    public boolean pilhaVazia() {
        //Vazia
        if (this.posicaoPilha == -1) {
            return true;
        }
        return false;
    }

    public int tamanho() {
        return this.posicaoPilha + 1;
    }

    public Object exibeUltimoValor() {
        //topo
        if (this.pilhaVazia()) {
            return null;
        }
        return this.pilha[this.posicaoPilha];
    }

    public Object desempilhar() {
        //pop
        if (pilhaVazia()) {
            return null;
        }
        return this.pilha[this.posicaoPilha--];
    }

    public void empilhar(Object valor) {

        if (this.posicaoPilha < this.pilha.length - 1) {
            this.pilha[++posicaoPilha] = valor;
        }
    }
}