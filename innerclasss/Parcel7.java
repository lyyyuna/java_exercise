interface Contents {
    int value();
}

public class Parcel7 {
    public Contents contens() {
        return new Contents() { // Insert a class definition
            private int i = 11;
            public int value() { return i; }
        }; // semicolon required in this case
    }
    public static void main(String[] as) {
        Parcel7 p = new Parcel7();
        Contents c = p.contens();
    }
}
