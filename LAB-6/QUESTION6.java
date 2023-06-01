import java.util.Scanner;
class QUESTION6
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Circle\n2.Square\n3.Triangle\nEnter your choice:");
        int choice = sc.nextInt();
        double area = 0;
        switch(choice)
        {
            case 1:
                System.out.print("Enter the radius of the circle:");
                int r = sc.nextInt();
                area = 3.14*r*r;
                break;
            case 2:
                System.out.print("Enter the side of the square:");
                int side = sc.nextInt();
                area = side*side;
                break;
            case 3:
                System.out.print("Enter the base and height of the triangle:");
                int base = sc.nextInt();
                int height = sc.nextInt();
                area = 0.5 * base * height;
                break;
            default:
                System.out.println("Inavlid choice.");
        }
        System.out.println("Area:"+area);
    }
}