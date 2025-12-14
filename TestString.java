<<<<<<< HEAD
public class TestString {
    public static void main(String[] args) {
        String name1 = "Jai";
        String name2 = "Jai";
        System.out.println(name1 == name2); // same memory allocation from string pool

        String a = new String("Jai");
        String b = new String("Jai");
        System.out.println(a == b);   // a and b are pointing different memory location inside heap memory
    }
}
=======
public class TestString {
    public static void main(String[] args) {
        String name1 = "Jai";
        String name2 = "Jai";
        System.out.println(name1 == name2); // same memory allocation from string pool

        String a = new String("Jai");
        String b = new String("Jai");
        System.out.println(a == b);   // a and b are pointing different memory location inside heap memory
    }
}
>>>>>>> 5efe359440216b3281f45b1f03b0bb1f03badd30
