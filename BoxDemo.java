class Box{
	double length;
	double breadth;
	double height;
}
class BoxDemo{
	public static void main(String[] args) {
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		double vol;

		mybox1.length = 10;
		mybox1.breadth = 10;
		mybox1.height = 10;

		mybox2.length = 5;
		mybox2.breadth = 5;
		mybox2.height = 5;

		vol = mybox1.length*mybox1.breadth*mybox1.height;
		System.out.println("box1 volume="+vol);
		vol = mybox2.length*mybox2.breadth*mybox2.height;
		System.out.println("box1 volume="+vol);
	}
}