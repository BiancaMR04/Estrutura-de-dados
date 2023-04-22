public class PontoCartesiano{

    private double x;
    private double y;

    public PontoCartesiano(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }
    
    public double distance(PontoCartesiano outro) {
        double x2 = this.x - outro.x;
        double y2 = this.y - outro.y;
        return Math.sqrt(x2*x2 + y2*y2);
    }
    
}
