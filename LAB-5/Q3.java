//Program to sort the user entered list of numbers of any size
import java.util.Arrays;
import java.util.Scanner;
public class Q3 
{
	public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the nO. of elements in the list:");
        int size = scanner.nextInt();
        int[] num = new int[size];
        System.out.print("Enter the elements :");
        for (int i = 0; i < size; i++) 
		{
            	num[i] = scanner.nextInt();
        	}
        Arrays.sort(num);
        System.out.print("Sorted list:" + Arrays.toString(num));
    	}
}