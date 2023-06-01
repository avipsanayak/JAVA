import java.util.Scanner;
class MathOperations
{
    public int subtract(int x, int y)
    {
        return x - y;
    }
    public double subtract(double x, double y) 
    {
        return x - y;
    }
    public int subtract(int x, int y, int z)
    {
        return x - y - z;
    }
    public long subtract(long x, long y)
    {
        return x - y;
    }
}
class Sub
{
    public static void main(String[] args)
    {
        MathOperations mathOps = new MathOperations();
        int result1 = mathOps.subtract(5, 3);
        System.out.println(+ result1);
        double result2 = mathOps.subtract(7.5, 2.5);
        System.out.println(+ result2);
        int result3 = mathOps.subtract(10, 2, 3);
        System.out.println(+ result3);
        long result4 = mathOps.subtract(10000000000L, 5000000000L);
        System.out.println(+ result4);
    }
}