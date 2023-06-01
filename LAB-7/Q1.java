import java.util.*;
class twoD 
{
    double area;
    public double twodimension(double l, double b) 
    {
        area = l*b;
        return area;
    }
}
class threeD extends twoD 
{
    double volume;
    public double threedimension(double l, double b, double h) 
    {
        volume = l*b*h;
        return volume;
    }
}
class Q1
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length and width of 2D sheet in feets:");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        twoD ob1 = new twoD();
        double sheetCost = ob1.twodimension(l, b)*40;
        System.out.println("Cost of plastic sheet:"+ sheetCost);
        System.out.print("Enter length, width and height of 3D box in feets:");
        l = sc.nextDouble();
        b = sc.nextDouble();
        double h = sc.nextDouble();
        threeD ob2 = new threeD();
        double boxCost = ob2.threedimension(l, b, h)*60;
        System.out.print("Cost of plastic box:"+ boxCost);
        sc.close();
    }
}
