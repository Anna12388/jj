package lesson0205;


public class Main {
    public static void main(String[] args) {

//        MyInterface obj = new MyInterfaceImpl();
//        System.out.println(obj.get());

        PrintInterface in = new PrintInterface() {
            @Override
            public void print() {
                System.out.println("Hello World");
            }
        };
        in.print();
    }

}

