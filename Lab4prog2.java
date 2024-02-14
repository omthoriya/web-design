import java.util.Scanner;
public class Lab4prog2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("plazeee enter a string");
        String a = sc.nextLine();
        int cv=0,cc=0;
        a=a.toLowerCase();
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u'){
                cv++;
            }
            else{
                cc++;
            }
        }
        System.out.println("vowels"+cv);
        System.out.println("constant"+cc);
        sc.close();
    }
}
