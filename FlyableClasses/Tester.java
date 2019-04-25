public class Tester {
    public static void main(String[] args)
    {
    Flyable[] myArray = {new Kite(1,5,"blue"),new Kite(3,5,"red"),new Witch(4,5,"fire"),new Witch(6,4,"water")};
    for (Flyable i : myArray){
        System.out.print("Altitude: " + i.getAltitude() + "  ");
        System.out.print("Velocity: " + i.getVelocity());
        System.out.println();
    }
}
}