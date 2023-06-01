//WAP to take first name and last name from user and print both in one line as last name followed by first name.
import java.util.Scanner;
public class Q5
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first name");
        String fs=sc.nextLine();
        System.out.println("First name:"+ fs);
        System.out.print("Enter last name");
        String ls=sc.nextLine();
        System.out.println("Last name:"+ ls);
        System.out.println("\n" + ls + " " + fs);
    }
}

        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String str = br.readLine();
        // int i = Integer.parseInt(br.readLine());