import java.util.Scanner;
public class Tester
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("What would you like the height of the cube to be? : ");
        double heightCube = input.nextDouble();
        System.out.print("What would you like the radius of the Cube to be? : ");
        double radiusCube = input.nextDouble();
        System.out.print("What would you like the height of the cylinder to be? : ");
        double heightCyl = input.nextDouble();
        System.out.print("What would you like the radius of the cylinder to be? : ");
        double radiusCyl = input.nextDouble();
        double cubeVol = Geometry.cubeVolume(heightCube);
        double cubeSurf = Geometry.cubeSurface(heightCube);
        double cylinderVol = Geometry.cylinderVolume(radiusCyl, heightCyl);
        double cylinderSurf = Geometry.cylinderSurface(radiusCyl, heightCyl);
        System.out.printf("Cube Volume: %16.2f", cubeVol);
        System.out.printf("\nCube Surface Area: %10.2f", cubeSurf); 
        System.out.printf("\nCylinder Volume: %12.2f", cylinderVol);
        System.out.printf("\nCylinder Surface Area: %.2f", cylinderSurf);
}
}