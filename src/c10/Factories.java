//: Factories.java
package c10;

interface Service {
    void method1();
    void method2();
}

interface ServiceFactory {
    Service getServie();
}

class Implementation1 implements Service {
    private Implementation1() {

    }

    public void method1() {
        System.out.println("Implementation1 method1");
    }

    public void method2() {
        System.out.println("Implementation1 method2");
    }

    public static ServiceFactory factory =
            new ServiceFactory() {
                public Service getServie() {
                    return new Implementation1();
                }
            };
}

class Implementation2 implements Service {
    private Implementation2() {

    }

    public void method1() {
        System.out.println("Implementation1 method1");
    }

    public void method2() {
        System.out.println("Implementation1 method2");
    }

    public static ServiceFactory factory =
            new ServiceFactory() {
                public Service getServie() {
                    return new Implementation2();
                }
            };
}

public class Factories {
    public static void serviceConsumer(ServiceFactory fact) {
        Service s = fact.getServie();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(Implementation1.factory);
        // Implementations are completely interchangeable:
        serviceConsumer(Implementation2.factory);
    }
}
