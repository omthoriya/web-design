import java.util.Scanner;
public class Lab4prog3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[4];
        System.out.println("plazee enter a array element");
        for (int i = 0; i < 4; i++){
            int value = sc.nextInt();
            a[i] = value;
        }
        int sum = 0;
        for(int i = 0; i < 4; i++){
            sum = sum + a[i];
        }
        double average = sum/(double)4;
        System.out.println("sum"+sum);
        System.out.println("average"+average);
        sc.close();
    }
}
