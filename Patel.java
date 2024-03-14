import java.util.*;
class Student{
	int id_no;
	int no_of_subject_registered;
	int[] subject_code;
	int[] subject_credits;
	String[] grade_obtained;
	int spi;
	Student(){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a student id_no");
		this.id_no = sc.nextInt();
		System.out.println("enter a no_of_subject_registered");
		this.no_of_subject_registered = sc.nextInt();
		subject_code = new int[no_of_subject_registered];
		subject_credits = new int[no_of_subject_registered];
		grade_obtained = new String[no_of_subject_registered];
	
		 for (int i = 0; i < no_of_subject_registered; i++){
			System.out.println("enter a subject_code "+ i + 1);
			subject_code[i] = sc.nextInt();
			System.out.println("enter a subject_credits "+ i + 1);
			subject_credits[i] = sc.nextInt();
			System.out.println("enter a grade_obtained "+ i + 1);
			grade_obtained[i] = sc.nextLine();
		}
	}
		int spi() {
        return 0;
		}
		public void printDetail(){
			for(int i = 0; i < no_of_subject_registered; i++){
				System.out.println("subject code[i] = "+subject_code);
				System.out.println("subject_credits[i] = "+subject_credits);
				System.out.println("grade_obtained[i] = "+grade_obtained);
			}
		}
}
public class Patel{
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		Student[] s = new Student[n];
        for (int i = 0; i < s.length; i++) {
            s[i] = new Student();

        }
        for (int i = 0; i < s.length; i++) {
            s[i].printDetail();

        }	}
}