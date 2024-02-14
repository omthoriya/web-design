import java.util.Scanner;
public class Lab4prog4 {
    public static void main(String[] args) {
        int n,temp,i,j=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array : ");
        n =sc. nextInt();
        int arr[] = new int[n];
        System.out.println("enter "+n+ "element");
        for(i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(i=0; i<n; i++){
            temp = arr[i];
            arr[i]=arr[n-1];
            arr[n-1]=temp;
        }
        System.out.println("reverse = ");
        for(i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
