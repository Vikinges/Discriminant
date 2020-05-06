
package discriminant;

public class Discriminant {

    public static void main(String[] args) {
 double a = 1;
        double b = 20;
        double c = 3;

        //a*x*x+b*x+c=0
        double d = b * b - (4 * a * c);
        System.out.println("root D = " + Math.sqrt(d));
        System.out.println("diskriminant D = ax2 + bx + c = " + b);
        if (d < 0) {
            System.out.println("D<0 - the equation has 2 imaginary roots (i.e. there are no real roots)");
            double x1 = (-b + (Math.sqrt(d))) / (2 * a);
            double x2 = (-b - (Math.sqrt(d))) / (2 * a);
            System.out.println("x1=" + x1 + " and x2= " + x2);

        }
        if (d == 0) {
            System.out.println("D=0 - the equation has 1 root (or 2 matching real roots)");
            double x = (-b) / (2 * a);
            System.out.println("x=" + x);

        }
        if (d > 0) {
            System.out.println("D>0 - the equation has 2 different real roots;");
            double x1 = (-b + (Math.sqrt(d))) / (2 * a);
            double x2 = (-b - (Math.sqrt(d))) / (2 * a);
            System.out.println("x1=" + x1 + " and x2= " + x2);

        }

    }

}
