public class B extends A{
	int b = 3;

	public B(){
		b = 4;
		System.out.println("B default contractar");
	}

	public B(int b){
		super(b);
		this.b = b;
		System.out.println("B peramiterazed contractar");
	}
}