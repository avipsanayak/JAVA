class Parent
{
    public void print() 
    {
        System.out.println("This is parent class");
    }
}

class Child extends Parent 
{
    public void print() 
    {
        System.out.println("This is child class");
    }
}

public class PC
{
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        p.print(); 
        c.print();
        Parent p2 = new Child();
        p2.print();
    }
}