public class A8 {
    static int a = 0;
    A8(){
        a++;
    }
    public static void main(String[] args) {
        System.out.println(A8.a);
        A8 a1 = new A8();
        System.out.println(a1.a);
        System.out.println(A8.a);
        A8 a2 = new A8();
        a1.a +=30;
        System.out.println(a2.a);
        System.out.println(a1.a);
        System.out.println(A8.a);
        A8.a +=30;
        System.out.println(a2.a);
        System.out.println(a1.a);
        System.out.println(A8.a);
        a2.a +=30;
        System.out.println(a2.a);
        System.out.println(a1.a);
        System.out.println(A8.a);


    }
}
