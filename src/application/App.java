package application;

public class App {

	public static void main(String[] args) {
		
		double tempInF = 69;
		double tempInC;
		
		tempInC = (tempInF - 32) * (5.0/9.0);
		
		System.out.println(tempInF + "F in C is: " + tempInC);
		
		tempInF = 5;
		tempInC = (tempInF - 32) * (5.0/9.0);
		
		System.out.println(tempInF + "F in C is: " + tempInC);
		
	}

}
