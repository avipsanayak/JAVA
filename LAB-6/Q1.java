import java.util.Scanner;

 class Box {
    private double length;
    private double width;
    private double height;
    
    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    
    public double volume() {
        return length * width * height;
    }
}

class Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter length: ");
        double length = input.nextDouble();
        
        System.out.print("Enter width: ");
        double width = input.nextDouble();
        
        System.out.print("Enter height: ");
        double height = input.nextDouble();
        
        Box box = new Box(length, width, height);
        
        System.out.println("Volume of the box: " + box.volume());
    }
}