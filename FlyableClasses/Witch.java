public class Witch implements Flyable {
    private double witchAlt;
    private double witchVel;
    private String witchSpell;
    public Witch(double alt,double vel,String spell){
        witchAlt = alt;
        witchVel = vel;
        witchSpell = spell;
    }
    public double getAltitude(){
        return witchAlt;
    }
    public double getVelocity(){
        return witchVel;
    }
}