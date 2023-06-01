//Find sum of each diagonal (left & right) elements separately of a user entered 3 X 3 matrixes in Java.
import java.util.Scanner;
public class Q6 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[3][3];
        System.out.println("Enter the elements of matrix:");
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                m[i][j] = sc.nextInt();
            }
        }
        int leftDSum = 0;
        int rightDSum = 0;
        for (int i = 0; i < 3; i++) 
        {
            leftDSum += m[i][i];
            rightDSum += m[i][2 - i];
        }
        System.out.print("Left diagonal sum:" + leftDSum);
        System.out.print("\nRight diagonal sum:" + rightDSum);
    }
}