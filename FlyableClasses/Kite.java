public class Kite implements Flyable {
    private double kiteAlt;
    private double kiteVel;
    private String kiteCol;
    public Kite(double alt,double vel,String col){
        kiteAlt = alt;
        kiteVel = vel;
        kiteCol = col;
    }
    public double getAltitude(){
        return kiteAlt;
    }
    public double getVelocity(){
        return kiteVel;
    }
}