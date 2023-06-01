import java.util.Scanner;
class NUMBER
{ 
  int [] NUMBER; 
  int leng; 
  public NUMBER(int max_Size) 
  { 
    NUMBER = new int[max_Size]; 
    leng = 0; 
  } 
  public void readElements() 
  { 
    System.out.print("Enter the elements:"); 
    Scanner s = new Scanner(System.in); 
    for(int i = 0; i < leng; i++) 
      NUMBER[i] = s.nextInt(); 
  } 
  public void swapElements() 
  { 
    int max = 0; 
    for(int i = 0; i < leng; i++) 
      if(NUMBER[i] > NUMBER[max]) 
        max = i; 
    int min = 0; 
    for(int i = 0; i < leng; i++) 
      if(NUMBER[i] < NUMBER[min]) 
        min = i; 
    int temp = NUMBER[max]; 
    NUMBER[max] = NUMBER[min]; 
    NUMBER[min] = temp; 
  } 
  public void displayElements() 
  { 
    System.out.println("Elements after swapping are:"); 
    for(int i = 0; i < leng; i++) 
      System.out.println(NUMBER[i] + " "); 
  } 
  public static void main(String[] args) 
  { 
    int n; 
    Scanner s = new Scanner(System.in); 
    System.out.print("Enter the number of elements:"); 
    n = s.nextInt(); 
    NUMBER obj = new NUMBER(n); 
    obj.leng = n;  
    obj.readElements(); 
    obj.swapElements(); 
    obj.displayElements(); 
  } 
}