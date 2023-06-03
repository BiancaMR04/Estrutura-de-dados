public class Main {
    
    public static void main(String[] args) {
        Pilha p = new Pilha();
        p.push(2);
        p.push(3);
        p.push(4);
        p.push(5);
        System.out.println(p.imprime());
        System.out.println("-------------");
        Pilha p2 = p.inverte();
        System.out.println(p2.imprime());
    }
}
