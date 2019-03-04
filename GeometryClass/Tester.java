import java.util.Scanner;
public class Tester
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("What would you like the height to be? : ");
        double height = input.nextDouble();
        System.out.print("What would you like the radius to be? : ");
        double radius = input.nextDouble();
        double cubeVol = Geometry.cubeSurface(height);
        double cubeSurf = Geometry.cubeSurface(height);
        double cylinderVol = Geometry.cylinderVolume(radius, height);
        double cylinderSurf = Geometry.cylinderSurface(radius, height);
        System.out.printf("Cube Volume: %.3f", cubeVol);
        System.out.printf("\nCube Surface Area: %.3f", cubeSurf); 
        System.out.printf("\nCylinder Volume: %.3f", cylinderVol);
        System.out.printf("\nCylinder Surface Area: %.3f", cylinderSurf);
}
}