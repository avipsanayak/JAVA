import java.util.Scanner;
class STUDENT 
{ 
	int roll;
 	String name; 
 	double cgpa; 
	public void getData() 
	{
		Scanner sc = new Scanner(System.in);
 		System.out.print("Enter roll:"); 
		roll = sc.nextInt(); 
 		System.out.print("Enter name:");
		name = sc.next(); 
 		System.out.print("Enter CGPA:");
		cgpa = sc.nextDouble();
	}
 	public void printData() 
	{ 
		System.out.println("Roll:" + roll + "\nName:" + name + "\nCGPA:" + cgpa); 
	} 
}
class QUESTION5 
{ 
	static void findLowestCgpa(STUDENT[] obj, int num) 
	{ 
		double min = obj[0].cgpa;
		int minIndex = 0; 
		for (int i = 0 ; i < num ; i++) 
		{ 
			if (obj[i].cgpa < min) 
			{ 
				min = obj[i].cgpa; 
				minIndex = i; 
			} 
		} 
		System.out.print("\nStudent with lowest CGPA is:" + (obj[minIndex].name));
	}
	public static void main(String[] args) 
	{ 
		int num; 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of students:"); 
		num = sc.nextInt(); 
		STUDENT[] obj = new STUDENT[num]; 
		for (int i = 0 ; i < num ; i++) 
		{ 
			obj[i] = new STUDENT(); 
			System.out.println("\nEnter Student " + (i + 1) + " details"); 
			obj[i].getData();
		} 
		System.out.println("\nDetails of students entered are:");
		for (int i = 0 ; i < num ; i++) 
		{ 
			System.out.println("\nStudent " + (i + 1)); 
			obj[i].printData(); 
		} 
		findLowestCgpa(obj, num); 
	} 
}