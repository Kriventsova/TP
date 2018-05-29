package Lab1;
import java.util.Scanner;
/**
 *
 * @author Pc
 */
public class Laboratornaya3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        point3d [] points = new point3d[3];
        for (int i = 0; i < 3; i++)
        {
        System.out.println("Vvedite point " + i + ";");
        System.out.print("x" + i + " = ");
        double x = scan.nextDouble();
        System.out.print("y" + i + " = ");
        double y = scan.nextDouble();
        System.out.print("z" + i + " = ");
        double z = scan.nextDouble();
        points[i] = new point3d(x,y,z);
        }
        System.out.println(" The are " + computeArea(points[0], points[1], points[2]));
    }
        public static double computeArea(point3d p1, point3d p2, point3d p3)
        {
        if (p1 == null || p2 == null || p3 == null) {System.out.print("Error 1 "); return -1;}
        boolean equal1 = p1.equals(p2);
        boolean equal2 = p1.equals(p3);
        boolean equal3 = p2.equals(p3);
        if (equal1 || equal2 || equal3) 
        {
        String err = equal1 ? "p1 equals" : (equal2 ? "p1 equals p3" : "p2 equals p3");
        System.out.print("Error 2 ");
        return -1;
        }
        double d12 = p1.distance(p2);
        //System.out.print("  /D12/  " + d12);
        double d13 = p1.distance(p3);
       // System.out.print("  /D13/  " + d13);
        double d23 = p2.distance(p3);
        //System.out.print("  /D23/  " + d23);
        double s = (d12 + d13 + d23)/2.0;
       // System.out.print("  /S/  " + s);
        double dist = s * (s - d12)*(s-d13)*(s-23);
        dist = Math.abs(dist);
       // System.out.print("  DIST  " + dist);
        dist = Math.sqrt(dist);
        return dist;
        }
       
    }
    
