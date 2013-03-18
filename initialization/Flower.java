public class Flower {
    int petalCount = 0;
    String s = "initial value";
    Flower(int petals) {
        petalCount = petals;
        System.out.println(" petalCount= " + petalCount);
    }
    Flower(String ss) {
        System.out.println(" s = " + ss);
        s = ss;
    }
    Flower(String s, int petals) {
        this(petals);
        this.s = s;
        System.out.println("int & steingd ");
    }
    Flower() {
        this("hi", 348);
        System.out.println("default constructor");
    }
    void printPetalCount() {
        System.out.println("d " + petalCount + " s= " + s);
    }
    public static void main(String[] args) {
        Flower x = new Flower();
        x.printPetalCount();
    }
}
