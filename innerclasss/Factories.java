interface Service {
    void method1();
    void method2();
}

interface ServiceFactory {
    Service getService();
}

class Implementation1 implements Service {
    private Implementation1() {}
    public void method1() {
        System.out.println("Implementation1 method1.");
    }
    public void method2() {
        System.out.println("Implementation1 methos21");
    }
    public static ServiceFactory fact = 
        new ServiceFactory() {
            public Service getService() {
                return new Implementation1();
            }
        };
}

class Implementation2 implements Service {
    private Implementation2() {}
    public void method1() {
        System.out.println("Implementaion2 method1.");
    }
    public void method2() {
        System.out.println("Implementaion2 method2.");
    }
    public static ServiceFactory fact = 
        new ServiceFactory() {
            public Service getService() {
                return new Implementation2();
            }
        };
}

public class Factories {
    public static void serviceConsumer(ServiceFactory fact) {
        Service s = fact.getService();
        s.method1();
        s.method2();
    }
    public static void main(String[] ar) {
        serviceConsumer(Implementation1.fact);
        serviceConsumer(Implementation2.fact);
    }
}

