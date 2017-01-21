package lab01;

public class Test {
	public static void main(String[] args) {
		System.out.println(23. / 4.);
		System.out.println((int) 4.75);
		System.out.println((int) 2.5/0.15);
		System.out.println((int)(2.5/0.15));
		
		System.out.println(2 + 3 + "hello" + 7 + 2 * 3);
		System.out.println((2 + 3) + "hello" + (7 + 2 * 3));
		
		int x = 10;
		int y = 20;
		System.out.println(x + "," + y);
		int z = ++x * y--;
		System.out.println(x + "," + y + "," + z);
		
	}
}
