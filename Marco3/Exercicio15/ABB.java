package Marco3.Exercicio15;

public class ABB {

    /**
     * @attribute raiz - Raiz da árvore
     */
    private Noh raiz;

    /**
     * @method ABB - Construtor da classe
     */
    public ABB() {
        raiz = null;
    }

    /**
     * @method getRaiz - Retorna a raiz da árvore
     * @return raiz - Raiz da árvore
     */
    public Noh getRaiz() {
        return raiz;
    }

    /**
     * @method isEmpty - Verifica se a árvore está vazia
     * @return true - Se a árvore estiver vazia | false - Se a árvore não estiver vazia
     */
    public boolean isEmpty() {
        return this.raiz == null;
    }

    /**
     * @method add - Adiciona um elemento na árvore
     * @param element - Elemento a ser adicionado
     */
    public void add(int element) {
        if (isEmpty()) {
            this.raiz = new Noh(element);
        } else {
            Noh aux = this.raiz;
            while (aux != null) {
                if (element < aux.valor) {
                    if (aux.esq == null) {
                        Noh newNode = new Noh(element);
                        aux.esq = newNode;
                        newNode.pai = aux;
                        return;
                    }
                    aux = aux.esq;
                } else {
                    if (aux.dir == null) {
                        Noh newNode = new Noh(element);
                        aux.dir = newNode;
                        newNode.pai = aux;
                        return;
                    }
                    aux = aux.dir;
                }
            }
        } 
    }


    /**
     * @method recursiveAdd - Adiciona um elemento na árvore de forma recursiva
     * @param element - Elemento a ser adicionado
     */
    public void recursiveAdd(int element) {
        if (isEmpty()) {
            this.raiz = new Noh(element);
        } else {
            recursiveAdd(this.raiz, element);
        }
    }

    /**
     * @method recursiveAdd - Adiciona um elemento na árvore de forma recursiva
     * @param node - Nó atual
     * @param element - Elemento a ser adicionado 
     */
    private void recursiveAdd(Noh node, int element) {
        if (element < node.valor) {
            if (node.esq == null) {
                Noh novoNoh = new Noh(element);
                node.esq = novoNoh;
                novoNoh.pai = node;
                return;
            }
            recursiveAdd(node.esq, element);
        } else {
            if (node.dir == null) {
                Noh novoNoh = new Noh(element);
                node.dir = novoNoh;
                novoNoh.setPai(node);
                return;
            }
            recursiveAdd(node.dir, element);
        }
    }


    /**
     * @method search - Busca um elemento na árvore
     * @param element - Elemento a ser buscado
     * @return true - Se o elemento for encontrado | false - Se o elemento não for encontrado
     */
    public boolean search(int element) {
        if (isEmpty()) {
            return false;
        } else {
            Noh aux = this.raiz;
            while (aux != null) {
                if (element == aux.valor) {
                    return true;
                } else if (element < aux.valor) {
                    aux = aux.esq;
                } else {
                    aux = aux.dir;
                }
            }
            return false;
        }
    }

    /**
     * @method recursiveSearch - Busca um elemento na árvore de forma recursiva
     * @param element - Elemento a ser buscado
     * @return true - Se o elemento for encontrado | false - Se o elemento não for encontrado
     */
    public boolean recursiveSearch(int element) {
        if (isEmpty()) {
            return false;
        } else {
            return recursiveSearch(this.raiz, element);
        }
    }

    /**
     * @method recursiveSearch - Busca um elemento na árvore de forma recursiva
     * @param node - Nó atual
     * @param element - Elemento a ser buscado
     * @return true - Se o elemento for encontrado | false - Se o elemento não for encontrado
     */
    private boolean recursiveSearch(Noh node, int element) {
        if (node == null) {
            return false;
        } else if (element == node.valor) {
            return true;
        } else if (element < node.valor) {
            return recursiveSearch(node.esq, element);
        } else {
            return recursiveSearch(node.dir, element);
        }
    }

    /**
     * @method imprimePreOrdem - Imprime a árvore em pré-ordem
     */
    public void imprimePreOrdem() {
        if (isEmpty()) {
            System.out.println("Árvore vazia!");
        } else {
            imprimePreOrdem(this.raiz);
        }
    }

    /**
     * @method imprimePreOrdem - Imprime a árvore em pré-ordem
     * @param node - Nó atual
     */
    public void imprimePreOrdem(Noh node) {
        if (node != null) {
            System.out.print(node.valor + " ");
            imprimePreOrdem(node.esq);
            imprimePreOrdem(node.dir);
        }
    }



}
