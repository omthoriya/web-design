public class Pra2{
	static void om(int x){
		x = 23;
	}
	static void om(int[] x){
		x[0] = 21;
	}
	public static void main(String[] args) {
		// int a = 54;
		// om(a);
		// System.out.println(+a);

		int[] a = {34, 56, 78, 23, 01};
		om(a);
		System.out.println(+a[0]);
	}
}