
public class Swapp {

	public static void main(String[] args) {
		int a = 20;
		int b = 30;

		System.out.println("Value of a: " + a + "   value of b: " + b);

		a = a + b; // 50
		b = a - b; // 50-30=20 swapp
		a = a - b;// 50-20=30 swapp
		System.out.println("value of a: " + a + "   value of b: " + b);
	}

}
