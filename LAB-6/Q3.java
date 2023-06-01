import java.util.Scanner;
public class Q3
{   
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("---Select a shape to calculate the area---\n1.Circle\n2.Triangle\n3.Square");
        int ch = sc.nextInt();
        switch (ch) 
        {
            case 1:
                System.out.print("Enter radius of the circle:");
                double r = sc.nextDouble();
                System.out.printf("Area of circle:%.2f", area(r));
                break;
            case 2:
                System.out.print("Enter base and height of the triangle:");
                double b = sc.nextDouble();
                double h = sc.nextDouble();
                System.out.printf("Area of triangle:%.2f", area(b, h));
                break;
            case 3:
                System.out.print("Enter side of the square:");
                int s = sc.nextInt();
                System.out.printf("Area of square:%.2f", area(s));
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
        sc.close();
    }
    public static double area(double r) 
    {
        return 3.14 * r * r;
    }
    public static double area(double b, double h) 
    {
        return 0.5 * b * h;
    }
    public static double area(int s) 
    {
        return s * s;
    }
}
