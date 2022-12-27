import java.util.Scanner;
import java.util.*;
public class Add{
	public static void main(String[] args)
	{
		int A;
		int B;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number A:");
		A=scanner.nextInt();
		System.out.println("Enter number B:");
		B=scanner.nextInt();
		int C=A+B;
		System.out.println("Addition of two no is:"+C);
	}
}