import java.util.Scanner;
public class Calculator{
	public static void main(String[] args)
	{
		int a=10;
		int b=5;
		Scanner scanner=new Scanner(System.in);
		System.out.println("1.ADD   2.SUB   3.MUL   4.DIV   5.MOD");
		System.out.print("Enter your Choice:");
		int Choice=scanner.nextInt();
		switch(Choice)
		{
			case 1:
				System.out.println("ADDITION:"+(a+b));
				break;
			case 2:
				System.out.println("SUBTRACTION:"+(a-b));
				break;
			case 3:
				System.out.println("MULTIPLICATION:"+(a*b));
				break;
			case 4:
				System.out.println("DIVISION:"+(a/b));
				break;
			case 5:
				System.out.println("MODULUS:"+(a%b));
				break;
			default:
				System.out.print("Invalid choice");
		}
	}
}