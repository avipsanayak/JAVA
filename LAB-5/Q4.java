//Program to find no. of objects created out of a class using static modifier.
public class Q4
{
    private static int count = 0;
    public Q4() 
    {
        count++;
    }
    public static int getCount() 
    {
        return count;
    }
    public static void main(String[] args) 
    {
        Q4 obj1 = new Q4();
        Q4 obj2 = new Q4();
        Q4 obj3 = new Q4();
        System.out.print("Number of objects created:" + Q4.getCount());
    }
}