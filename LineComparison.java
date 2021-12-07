import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x and y cordinate for point 1 of line-1 ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.println("Enter x and y cordinate for point 2 of line-1 ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double lengthOfLine = Length(x1, x2, y1, y2);
        System.out.println("Length of line=" + lengthOfLine);
    }
    public static double Length(double x1, double x2, double y1, double y2)
    {
        double len=Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
        return len;
    }
}
