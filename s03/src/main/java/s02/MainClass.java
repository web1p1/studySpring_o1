package s02;

public class MainClass {

	public static void main(String[] args) {
		MyCalucator myCalucator = new MyCalucator();
		myCalucator.setCalculator(new Calculator());

		myCalucator.setFirstNum(30);
		myCalucator.setSecondNum(5);
		
		myCalucator.add();
		myCalucator.sub();
		myCalucator.mul();
		myCalucator.div();
	}

}
