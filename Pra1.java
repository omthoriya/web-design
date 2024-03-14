class Patel{
	int id;
	String name;
	public void printdetali(){
		System.out.println("id is "+ id);
		System.out.println("name is "+ name);
	}
}
public class Pra1{
	public static void main(String[] args) {
		Patel om = new Patel()	;
		Patel dhulo = new Patel(); 


		om.id = 12;
		om.name = "omu";
		dhulo.id = 13;
		dhulo.name = "raj";
	}
}