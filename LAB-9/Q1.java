import Marketing.Sales;
public class Q1
{
     public static void main(String[] args) 
     {
           Sales salesPerson = new Sales(101, "John", 50000);
           double totalEarnings = salesPerson.earnings() + salesPerson.tallowance();
           System.out.println("Employee ID: " + salesPerson.getEmpid());
           System.out.println("Total earnings: " + totalEarnings);
     }
}

