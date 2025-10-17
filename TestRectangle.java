public class TestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle box1 = new Rectangle(); 
		box1.printBasicInfo();
		System.out.println(box1.findPerimeter());
		System.out.println(box1.findDiagonal());
		if (box1.isSquare()==true) {
			System.out.println("It is a square box.");}
		else{
			System.out.println("It is not a square box.");
			}
		Rectangle box2 = new Rectangle(2,3);
		box2.printBasicInfo();
		System.out.println(box2.findPerimeter());
		System.out.println(box2.findDiagonal());
		if (box2.isSquare()==true) {
			System.out.println("It is a square box.");}
		else{
			System.out.println("It is not a square box.");
			}
		}
}

