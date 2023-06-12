package Marco2.Exercicio13;

public class Main {
    
    public static void main(String[] args) {
        MapaHashLSE mapa = new MapaHashLSE();

        Aluno a1 = new Aluno(1, "João");
        Aluno a2 = new Aluno(2, "Maria");
        Aluno a3 = new Aluno(3, "José");
        Aluno a4 = new Aluno(4, "Ana");
        Aluno a5 = new Aluno(5, "Carlos");
        Aluno a6 = new Aluno(6, "Pedro");
        Aluno a7 = new Aluno(7, "Paulo");
        Aluno a8 = new Aluno(8, "Paula");
        Aluno a9 = new Aluno(9, "Carla");
        Aluno a10 = new Aluno(10, "Gabriel");

        mapa.put(a1.getMatricula(), a1);
        mapa.put(a2.getMatricula(), a2);
        mapa.put(a3.getMatricula(), a3);
        mapa.put(a4.getMatricula(), a4);
        mapa.put(a5.getMatricula(), a5);

        mapa.imprime();

        mapa.remove(3);

        System.out.println(mapa.get(1));
        System.out.println(mapa.get(2));
        System.out.println(mapa.get(3));
        System.out.println(mapa.get(4));
        System.out.println(mapa.get(5));

        mapa.put(a6.getMatricula(), a6);
        mapa.put(a7.getMatricula(), a7);
        mapa.put(a8.getMatricula(), a8);
        mapa.put(a9.getMatricula(), a9);
        mapa.put(a10.getMatricula(), a10);

        System.out.println(mapa.get(1));
        System.out.println(mapa.get(2));
        System.out.println(mapa.get(3));
        System.out.println(mapa.get(4));
        System.out.println(mapa.get(5));
        System.out.println(mapa.get(6));
        System.out.println(mapa.get(7));
        System.out.println(mapa.get(8));
    }
}
