import java.util.Scanner;
public class ID{
	public static void main(String[] args){
		
		Scanner scanner=new Scanner(System.in);
		String name,bg;
		int age;
		
		System.out.print("Enter name:");
		name=scanner.nextLine();
		System.out.print("Enter age:");
		age=scanner.nextInt();
		System.out.println("Enter Blood group:");
		bg=scanner.nextLine();	
		System.out.println("________________________________________________");
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Blood Group:");
		System.out.println("________________________________________________");
		if(age>=20)
		{
			System.out.println("Your Group is RED");
		}
		else if(age>=15)
		{
			System.out.println("Your Group is BLUE");
		}
		else
		{
			System.out.println("Your Group is YELLOW");
		}
		System.out.println("________________________________________________");
	}
}