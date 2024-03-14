class Square{
	double width;
	double height;
}
class SquareDemo{
	public static void main(String[] args) {
		Square sq1 = new Square();
		Square sq2 = new Square();
		double vol;

		sq1.width = 10;
		sq1.height = 10;

		sq2.width = 20;
		sq2.height = 40;

		vol = sq1.width*sq1.height;
		System.out.println("square 1 volume = "+vol);
		vol = sq2.width*sq2.height;
		System.out.println("square 1 volume = "+vol);
	}
}