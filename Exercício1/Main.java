public class Main {

    public static void main(String[] args) {
        
        PontoCartesiano ponto1 = new PontoCartesiano(4.0, 5.0);
        PontoCartesiano ponto2 = new PontoCartesiano(6.0, 7.0);
            
        double distance = ponto1.distance(ponto2);
        System.out.println("A distância entre os dois pontos é: " + distance);

    }
}
