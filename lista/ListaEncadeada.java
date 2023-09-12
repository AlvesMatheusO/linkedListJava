package Estudo.lista;

public class ListaEncadeada<T> {
    
    private No<T> inicio;
    private No<T> ultimo;


    private int tamanho ;

    public void adiciona(T elemento) {
        No<T> celula = new No<T>(elemento);

        if (tamanho == 0) {
            this.inicio = celula;

        } else {
            this.ultimo.setProximo(celula);
        }
        this.ultimo = celula;

        // Fazer a incrementação para saber o tamanho da lista
        this.tamanho++;
    }

    public int getTamanho() {
        return this.tamanho;
    }


    public void limpaLista() {

    for (No<T> atual = this.inicio; atual != null;) {
        No<T> proximo = atual.getProximo();

        atual.setElemento(null);
        atual.setProximo(null);
        atual = proximo;
    }

    this.inicio = null;
    this.ultimo = null;
    this.tamanho = 0;

    System.out.println("Lista Limpa com Sucesso!");
    }


    public void removerPosicao () {
        if (this.getTamanho() == 0) {
            System.out.println("Lista vazia!");
        }

        No<T> posicaNo
    }
 

    //Imprimir lista em um vetor com String builder
    @Override
    public String toString() {

        if (this.tamanho  == 0) {
          return "[]" ;
        } 

            StringBuilder builder = new StringBuilder("[");
            No<T> atual = this.inicio;

            for (int i = 0 ; i < this.tamanho-1; i++) {

                builder.append(atual.getElemento()).append(",");
                atual  = atual.getProximo();
            }
            builder.append(atual.getElemento()).append("]");
         return builder.toString();
    }
}
