class Art {
    Art() {
        System.out.println("1111");
    }
}
class Drawing extends Art {
    Drawing() {
        System.out.println("2222");
    }
}
public class Cartoon extends Drawing {
    Cartoon() {
        System.out.println("33333");
    }
    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }
}
