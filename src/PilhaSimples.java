public class PilhaSimples {
    Integer[] pilha;
    int tamanho;

    public PilhaSimples(int tamanho) {
        this.tamanho = tamanho;
        this.pilha = new Integer[tamanho];
        System.out.println("A pilha foi criada!");
    }

    public void empilhar(int valor) {
        if(!estaCheia()) {
            this.pilha[encontrarPosicao()] = valor;
            System.out.println("O valor " + valor + " foi empilhado!");
        }
    }


    public int encontrarPosicaoTopo(){
        int i = 0;
        if(!estaVazia()) {
            while (i<pilha.length && pilha[i] != null) {
                i++;
            }
            return i - 1;
        }
        return -1;
    }

    public void desempilhar() {
        int topo = encontrarPosicaoTopo();
        if(topo == -1) {
            return;
        }
        System.out.println("O valor " + pilha[encontrarPosicaoTopo()] + " foi desempilhado!");
        pilha[topo] = null;
    }

    public void exibir() {
        for(int i = 0; i < tamanho; i++){
            System.out.print(pilha[i] + " ");
        }
        System.out.println();
    }

    private int encontrarPosicao() {
        int i;
        for (i = 0; i < this.pilha.length; i++) {
            if(this.pilha[i] == null) {
                break;
            }
        }
        return i;
    }

    private boolean estaCheia() {
        for (int i = 0; i < this.tamanho; i++) {
            if(this.pilha[i] == null) {
                return false;
            }
        }
        System.out.println("A pilha está cheia!");
        return true;
    }

    public boolean estaVazia() {
        if(this.pilha[0] == null) {
            System.out.println("A pilha está vazia!");
            return true;
        } else {
            return false;
        }
    }

}
