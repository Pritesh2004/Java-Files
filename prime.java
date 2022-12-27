import java.util.Scanner;
public class prime {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int num;
        int count=0;
        System.out.print("Enter a number:");
        num=scanner.nextInt();
        for(int i=2;i<=num-1;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count>0){
            System.out.println("Number is not Prime");
        }
        else{
            System.out.println("Number is prime");
        }
    }
    
}
