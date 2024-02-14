import java.util.Scanner;
public  class Lab3prog1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("plazzzz enter a number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int sum = a+b+c+d+e;
        float per = sum/5;
        if(per>=60){
            System.out.println("first division");
        }
        else if(per>=50 || per<59){
            System.out.println("second division");
        }
        else if(per>=40 || per<49){
            System.out.println("third division");
        }
        else if(per<40){
            System.out.println("fail");  
        }
    }
}