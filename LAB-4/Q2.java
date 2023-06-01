//Program to print the corresponding grade for the given mark using if..else statement in Java
public class Q2
{
    public static void main(String[] args) 
    {
        int mrk=78;
        if (mrk<=40)
            System.out.println("C Grade");
        else if (mrk>40 && mrk<=80)
            System.out.println("B Grade");
        else if (mrk>80 && mrk<=100)
            System.out.println("A Grade"); 
        else
            System.out.println("FAIL");
    }
}