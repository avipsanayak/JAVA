//Find the no. of occurrence of each element in an user entered list of nos.
import java.util.Scanner;
public class Q5
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        int size = sc.nextInt();
        int[] num = new int[size];
        System.out.print("Enter the elements:");
        for (int i = 0; i < size; i++) 
            num[i] = sc.nextInt();
        int[] counts = new int[size];
        for (int i = 0; i < size; i++) 
        {
            int count = 0;
            for (int j = 0; j < size; j++) 
            {
                if (num[i] == num[j]) 
                {
                    count++;
                }
            }
            counts[i] = count;
        }
        System.out.print("Element counts:");
        for (int i = 0; i < size; i++) 
        {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) 
                if (num[i] == num[j]) 
                {
                    isDuplicate = true;
                    break;
                }
            if (!isDuplicate) 
                System.out.print(num[i] + ":" + counts[i] + " ");
        }
    }
}