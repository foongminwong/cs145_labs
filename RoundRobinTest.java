package lab010;

public class RoundRobinTest {
	public static void main(String[] args) {
		RoundRobinList list1 = new RoundRobinList();

		list1.add("avocado");
		list1.add("banana");
		list1.add("coconut");
		list1.add("durian");

		// call get 8 times
		System.out.println(list1.get());
		System.out.println(list1.get());
		System.out.println(list1.get());
		System.out.println(list1.get());
		System.out.println(list1.get());
		System.out.println(list1.get());
		System.out.println(list1.get());
		System.out.println(list1.get());
		System.out.println(list1.size());
		
	}
}
