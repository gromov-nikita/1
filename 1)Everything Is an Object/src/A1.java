/*
Exercise 1: (2) Create a class containing an int and a char that are not initialized, and
print their values to verify that Java performs default initialization.
 */
public class A1 {
    A1(){}
    A1(int a, char b){
        this.a = a;
        this.b = b;
    }
    private int a;
    private char b;
    public void setA(int a) {
        this.a = a;
    }
    public void setB(char b) {
        this.b = b;
    }
    public char getB() {
        return b;
    }
    public int getA() {
        return a;
    }

    public static void main(String[] args) {
        A1 obj = new A1();
        System.out.println(obj.a);
        System.out.println(obj.b);

        A11 a11 = new A11();

        System.out.println(a11.a.a);
        System.out.println(a11.a.b);
    }
}
