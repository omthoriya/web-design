import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
public class Lab3prog3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("plazzz enter a number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println("number a is max");
            }
            else{
                System.out.println("number c is max");
            }
        }
        else if(b>c){
            System.out.println("number b is max");
        }
        else{
            System.out.println("number c is max");
        }   
    }
}