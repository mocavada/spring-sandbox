package moc.app.FunctionalProgramming_Advance;

public class A_FunctionalInterfaces {

    @FunctionalInterface
    public interface GreetingMessage {
        public abstract void greet(String name);
    }



    public static void main(String[] args) {
        GreetingMessage gm = new GreetingMessage() {
            @Override
            public void greet(String name) {
                System.out.println("Hello " + name);
            }
        };


        gm.greet("Marc");
    }



}
