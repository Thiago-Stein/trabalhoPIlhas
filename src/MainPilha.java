public class MainPilha {
    public static void main(String[] args) {
        PilhaSimples pilhaSimples = new PilhaSimples(3);

        pilhaSimples.empilhar(5);
        pilhaSimples.empilhar(5);
        pilhaSimples.empilhar(5);
        pilhaSimples.exibir();
        pilhaSimples.empilhar(5);
    }
}
