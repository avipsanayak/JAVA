//1. Find the largest among 3 user entered nos. using  Java
import java.util.Scanner;
public class Q1
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if (a>b)
        {
            if (a>c)
               System.out.print(a + " is the largest"); 
            else
               System.out.print(c + " is the largest");
        }
        else
        {
            if(b>c)
                System.out.print(b + " is the largest");
            else
                System.out.print(c + " is the largest");
        } 
    }
}