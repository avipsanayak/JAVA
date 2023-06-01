interface Motor
{ 
   void run(); 
   void consume();
}

class WashingMachine implements Motor
{
  int capacity; 
  public WashingMachine(int capacity)
  {
     this.capacity = capacity; 
  }
  public void run()
  {
    System.out.println("Run");
  }
  public void consume()
  { 
    System.out.println("Consume");
  }
}
class Q2
{
  public static void main(String[] args)
  {
    WashingMachine wm = new WashingMachine(1000);
    System.out.println("Capacity of washing machine = " + wm.capacity + " watts.");
    wm.run();
    wm.consume(); 
  }
}