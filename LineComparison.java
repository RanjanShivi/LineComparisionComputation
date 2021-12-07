import java.util.Scanner;
import java.lang.Double;

public class LineComparison {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter x and y cordinate for point 1 of line-1 ");
        double x11=sc.nextDouble();
        double y11=sc.nextDouble();
        System.out.println("Enter x and y cordinate for point 2 of line-1 ");
        double x21=sc.nextDouble();
        double y21=sc.nextDouble();
        System.out.println("Enter x and y cordinate for point 1 of line-1 ");
        double x12=sc.nextDouble();
        double y12=sc.nextDouble();
        System.out.println("Enter x and y cordinate for point 2 of line-1 ");
        double x22=sc.nextDouble();
        double y22=sc.nextDouble();

        double lengthOfLine1=Length1(x11,x21,y11,y21);
        System.out.println("Length of line-1=" + lengthOfLine1);
        double lengthOfLine2=Length2(x12,x22,y12,y22);
        System.out.println("Length of line 2= " + lengthOfLine2);

        if (Double.compare(lengthOfLine1, lengthOfLine2) == 0)
            System.out.println("Both lines are equal");
        else if (Double.compare(lengthOfLine1, lengthOfLine2) < 0)
            System.out.println("line1 is greater then line 2");
        else
            System.out.println("line 2 is greater then line 1");

    }
    public static double Length1(double x1, double x2, double y1, double y2)
    {
        double len=Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
        return len;
    }
    public static double Length2(double x1, double x2, double y1, double y2)
    {
        double len=Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
        return len;
    }


}

