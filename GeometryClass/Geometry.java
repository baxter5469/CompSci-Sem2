public class Geometry
{
		public static double cubeVolume(double h){
            double volume = h * h * h;
            return volume;
        }
        public static double cubeSurface(double h) {
            double surfaceArea = 6 * (h * h);
            return surfaceArea;
        }
        public static double cylinderVolume(double r, double h){
            double cylinderVol = 3.14 * (r * r) * h;
            return cylinderVol;
        }
        public static double cylinderSurface(double r, double h){
            double cylinderSurf = 2 * 3.14 * (r * r) + 2 * 3.14 * r * h;
            return cylinderSurf;
        }

}