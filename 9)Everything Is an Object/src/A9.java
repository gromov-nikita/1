/*
Exercise 9: (2) Write a program that demonstrates that autoboxing works for all the
primitive types and their wrappers.
 */
public class A9 {
    public static void main(String[] args) {
        Integer a1 = new Integer(7);
        int a = a1;
        Integer a2 = 9;
        Long l1 = new Long(1000);
        long l = l1;
        Long l2 = 4000L;
        Integer a3 = (int)l;
        Long l3 = (long)a;
        System.out.println(a);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(l);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
    }
}
