package moc.app.FunctionalProgramming_Advance;

public class B_Lambdas {

    @FunctionalInterface
    public interface GreetingMessage {
        public abstract void greet(String name);
    }

    @FunctionalInterface
    public interface  MessagePrinter {
        public abstract void printMessage();
    }


    public static void main(String[] args) {

        GreetingMessage gm2 = (String name) -> {
            System.out.println("Hello " + name);
        };

        gm2.greet("Senthil");

        MessagePrinter mp = () -> {
            System.out.println("This is a Message");
        };

        mp.printMessage();


    }
}
