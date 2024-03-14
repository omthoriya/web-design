class A{
	int a = 1;

	public A(){
		a = 2;
		System.out.println("A default contractar");
	}
	public A(int a){
		this.a = a;
		System.out.println("Appendable peramiterazed contractar");
	}
}