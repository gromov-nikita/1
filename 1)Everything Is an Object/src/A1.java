public class A1 {
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
    }
}
