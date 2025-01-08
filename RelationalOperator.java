public class RelationalOperator {
	public static void main(String[] args) {
		int i = 1;
		int y = 2;
		
		boolean c = i > y;
		
		System.out.println(c);
		
		String name1 = "Jai";
		String name2 = "Jai";
		String name3 = new String("Jai");
		boolean d = name1 == name2;
		boolean e = name1 == name3;
		System.out.println(d); // string pool
		System.out.println(e); // heap memory
	}
}
