import java.io.*;
import java.util.Scanner;
public class Q2
{
    public static void main(String[] args)
    {
        int a;
        Scanner sc=new Scanner(System.in);
        a= sc.nextInt();
        try
        {
            if(a<10 || a>50)
            {
                throw new ExceptionOutOfRange();
            }
            else
            {
                System.out.println("Square of the number:" + (a*a));
            }
        }
        catch(ExceptionOutOfRange e)
        {
            System.out.println("Out of Range Exception!" + e.getMessage());
        }
    }
}