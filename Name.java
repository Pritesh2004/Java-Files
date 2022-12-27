import java.util.Scanner;
public class Name{
    public static void main(String[] args)
    {
        String name;
        Scanner scanner=new Scanner(System.in);
	System.out.print("Enter a name:");
        name=scanner.nextLine();
        System.out.println("Hey their my name is "+name);
    }
}