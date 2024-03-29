import java.io.*;
import java.util.*;

public class Turtle {
    private String name;
    private Formatter f;
    public Turtle(String name, Formatter f) {
        this.name = name;
        this.f = f;
    }
    public void move(int x, int y) {
        f.format("%s the turtle is at (%d,%d)\n", name, x, y);
    }
    public static void main(String[] args) {
        PrintStream outAlias = System.out;
        Turtle tommy = new Turtle("tommy",
                new Formatter(System.out));
        Turtle terry = new Turtle("terry",
                new Formatter(outAlias));
        tommy.move(0,0);
        terry.move(3,4);
        tommy.move(2,3);
        terry.move(9,9);
    }
}
