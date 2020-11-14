/*
Exercise 16: (1) In the Initialization & Cleanup chapter, locate the Overloading.java
example and add Javadoc documentation. Extract this comment documentation into an
HTML file using Javadoc and view it with your Web browser
 */
public class Overloading {
    /**
     * Main method
     * @param args main method arguments
     */
    public static void main(String[] args) {
        for(int i = 0; i<5; i++){
            Tree t = new Tree(i);
            t.info();
            t.info("overloaded method");
        }
        new Tree();
    }
}
