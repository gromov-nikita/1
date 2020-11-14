/*
Exercise 9: (2) Write a program that demonstrates that autoboxing works for all the
primitive types and their wrappers.
 */
public class A9 {
    public static void main(String[] args) {
        Integer a1 = new Integer(7);
        int a = a1;
        long c = 5;
        Integer a2 = 9;
        Integer a3 = (int)c;
        Long b = (long)a2;
        Long b2 = (long)a;
        System.out.println(a);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(c);
        System.out.println(b);
        System.out.println(b2);
    }
}
