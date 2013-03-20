public class ExceptionMethods {
    public static void main(String[] args) {
        try {
            throw new Exception("my exceptionm.");
        } catch(Exception e) {
            System.out.println("get message: " + e.getMessage());
            System.out.println("get localized message: " + 
                    e.getLocalizedMessage());
            System.out.println("to string: " + e);
            System.out.print("print stack trace: ");
            e.printStackTrace(System.out);
        }
    }
}
