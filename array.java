public class array {
    public static void main(String[] args){
        int[] arr={10,20,30,40,50};
        arr[0]=100;
        System.out.println(arr[0]);
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            System.out.println(arr[i]);
        }
        System.out.println("Sum of array is "+sum);

    }
}
