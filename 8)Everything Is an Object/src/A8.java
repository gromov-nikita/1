/*
Exercise 8: (3) Write a program that demonstrates that, no matter how many objects
you create of a particular class, there is only one instance of a particular static field in that
class.
 */
public class A8 {
    static int a = 0;
    A8(){
        a++;
    }
    public static void main(String[] args) {
        System.out.println(A8.a);
        A8 a1 = new A8();
        System.out.println(a1.a);
        a1 = new A8();
        a1.a +=30;
        System.out.println(a1.a);
        a1.a +=30;
        System.out.println(a1.a);
        a1.a +=30;
        System.out.println(a1.a);



    }
}
