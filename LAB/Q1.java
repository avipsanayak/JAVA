import java.io.*;
import java.util.Scanner;
public class Q1
{
    public static void main(String[] args)
    {
        int a[2][2], b[2][2], c[2][2];
        int i, j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first matrix:");
        for(i=0; i<2; i++)
        {
            for(j=0; j<2; j++)
            {
                a[i][j]= sc.nextInt();
            }
        }
        System.out.println("Enter second matrix:");
        for(i=0; i<2; i++)
        {
            for(j=0; j<2; j++)
            {
                b[i][j]= sc.nextInt();
            }
        }
        System.out.println("Addition of matrices:");
        for(i=0; i<2; i++)
        {
            for(j=0; j<2; j++)
            {
                c[i][j]=a[i][j] + b[i][j];
            }
        }
        for(i=0; i<2; i++)
        {
            for(j=0; j<2; j++)
            {
                System.out.println(c[i][j]);
            }
        }
    }
}