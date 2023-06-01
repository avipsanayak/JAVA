import java.util.*;
interface Account{
public double earning(double basic);
public double deduction(double basic);
public double bonus(double basic);
}
abstract class Manager implements Account{
double basic, da, hra;
public double earning(double basic)
{
hra=0.15*basic;
da=0.8*basic;
return basic+hra+da;
}
public double deduction(double basic)
{
return 0.12*basic;
}
}
class Substaff extends Manager
{
public double bonus(double basic)
{
return 0.5*basic;
}
}
class Q3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter basic salary:");
double b=sc.nextInt();
Substaff sf= new Substaff();
System.out.println("The total earning is:"+sf.earning(b) + "\nThe total deduction is:"+sf.deduction(b) + "\nThe bonus earned is:"+sf.bonus(b));
}
}