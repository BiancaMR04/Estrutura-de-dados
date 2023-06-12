package Marco2.Exercicio12;

public class Main {

    public static void main(String[] args) {

        MapaHashVetor mapa = new MapaHashVetor();

        Aluno aluno1 = new Aluno(1, "João");
        Aluno aluno2 = new Aluno(2, "Maria");
        Aluno aluno3 = new Aluno(3, "José");
        Aluno aluno4 = new Aluno(4, "Ana");
        Aluno aluno5 = new Aluno(5, "Carlos");
        Aluno aluno6 = new Aluno(6, "Pedro");
        Aluno aluno7 = new Aluno(7, "Paula");
        Aluno aluno8 = new Aluno(8, "Mariana");
        Aluno aluno9 = new Aluno(9, "Fernando");
        Aluno aluno10 = new Aluno(10, "Fernanda");
        Aluno aluno11 = new Aluno(11, "Rafael");

        mapa.put(aluno1.getMatricula(), aluno1);
        mapa.put(aluno2.getMatricula(), aluno2);
        mapa.put(aluno3.getMatricula(), aluno3);
        mapa.put(aluno4.getMatricula(), aluno4);
        mapa.put(aluno5.getMatricula(), aluno5);

        System.out.println(mapa.get(1));
        System.out.println(mapa.get(2));
        System.out.println(mapa.get(3));
        System.out.println(mapa.get(4));
        System.out.println(mapa.get(5));

        mapa.put(aluno6.getMatricula(), aluno6);
        mapa.put(aluno7.getMatricula(), aluno7);
        mapa.put(aluno8.getMatricula(), aluno8);
        mapa.put(aluno9.getMatricula(), aluno9);
        mapa.put(aluno10.getMatricula(), aluno10);
        mapa.put(aluno11.getMatricula(), aluno11);

        System.out.println(mapa.get(6));
        System.out.println(mapa.get(7));
        System.out.println(mapa.get(8));
        System.out.println(mapa.get(9));
        System.out.println(mapa.get(10));
        System.out.println(mapa.get(11));

        mapa.remove(1);
        mapa.remove(2);

        System.out.println(mapa.get(1));
        System.out.println(mapa.get(2));

    }


    
}
