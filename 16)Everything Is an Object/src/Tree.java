/*
Exercise 16: (1) In the Initialization & Cleanup chapter, locate the Overloading.java
example and add Javadoc documentation. Extract this comment documentation into an
HTML file using Javadoc and view it with your Web browser
 */
/**
 * @author Gromov Nikita
 * @version 1.1
 */
public class Tree{

    int height;

    /**
     *
     */
    public Tree(){
        System.out.println("Planting a seedling");
        height = 0;
    }

    /**
     *
     * @param initialHeight Tree hight
     */
    public Tree(int initialHeight){
        height = initialHeight;
        System.out.println("Creating new Tree that is " + height + " feet tall");
    }

    /**
     *Get information about object
     */
    public void info(){
        System.out.println("Tree is " + height + " feet tall");
    }

    /**
     * Get information about object
     * @param s String
     */
    public void info(String s){
        System.out.println(s + ": Tree is " + height + " feet tall");
    }
}
