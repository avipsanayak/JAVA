import java.util.*;
class FirstClass 
{
    int a;
    public int getA() 
    {
        System.out.println("Parent class Method");
        return 0;
    }
    FirstClass(int a) 
    {
        this.a = a;
        System.out.println("Parent class Constructor - value:" + a);
        System.out.println();
    }
}
class SecondClass extends FirstClass 
{
    SecondClass(int c) 
    {
        super(c);
        super.getA();
        System.out.println("Derived class constructor");
    }
}
public class Q6 
{
    public static void main(String[] args) 
    {
        FirstClass e = new FirstClass(40);
        SecondClass d = new SecondClass(5);
    }
}