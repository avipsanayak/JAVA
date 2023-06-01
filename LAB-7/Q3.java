public class Q3
{
    public static void main(String[] args) 
    {
        A ob1 = new A();
        ob1.print();
        ob1 = new B();
        ob1.print();
    }
}
class A 
{
    public void print() 
    {
        System.out.println("Class A");
    }
}
class B extends A 
{
    public void print() 
    {
        System.out.println("Class B");
    }
}
