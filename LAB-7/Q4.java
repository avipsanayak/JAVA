import java.util.*;
class shape
{
    Scanner sc = new Scanner(System.in);
    double area;
    void showArea()
    {
        System.out.println("showArea() declared");
    }
}
class Circle extends shape 
{
    double r;
    void read() 
    {
        System.out.print("Enter the radius of the circle:");
        r = sc.nextDouble();
    }
    void showArea() 
    {
        double area = Math.PI*r*r;
        System.out.println("Area of circle:"+ area);
    }
}
class Rectangle extends shape 
{
    double l, w;
    void read() 
    {
        System.out.print("Enter length and breadth of rectangle:");
        l = sc.nextDouble();
        w = sc.nextDouble();
    }
    void showArea() 
    {
        double area = l*w;
        System.out.println("Area of rectangle:"+ area);
    }
}
class Q4
{
    public static void main(String[] args) 
    {
        Circle ob1 = new Circle();
        Rectangle ob2 = new Rectangle();
        ob1.read();
        ob1.showArea();
        ob2.read();
        ob2.showArea(); 
    }
}