class A {}

public class VarArgs {
    static void printArray(Object[] args) {
        for (Object obj : args) {
            System.out.println(obj + " ");
        }
    }
    public static void main(String[] args) {
        printArray(new Object[]
                {new Integer(2), new Float(23.2), new Double(22.33)});
        printArray(new Object[]{"we", "wew", "q2323", "wezs"});
        printArray(new Object[]{new A(), new A(), new A()});

    }
}
