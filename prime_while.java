import java.util.Scanner;
public class prime_while {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int num;
        int count=0;
        System.out.print("Enter a number:");
        num=scanner.nextInt();
        int i=2;
        while(i<=num-1){
            if(num%i==0){
                count++;
            }
            i++;
        }
        if(count>0){
            System.out.println("Number is not Prime");
        }
        else{
            System.out.println("Number is prime");
        }
    }
    
}


