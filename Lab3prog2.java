import java.util.Scanner;
public class Lab3prog2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("plazzz enter a number");
        int n = sc.nextInt();
        int m = n;
        int rev = 0;
        while(n!=0){
            int r = n%10;
            rev = (rev*10)+r;
            n = n / 10;
        }
        if(rev==m)
        {
            System.out.println("number is pelidrome");
        }
        else{
            System.out.println("number is not pelidrome");
        }
    }
}