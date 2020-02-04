package moc.app.DataStructure_Advance;

import java.util.LinkedList;

public class B_StoreQueue {

    public B_StoreQueue() {
    }

    public static class Customer {
        private boolean hasBeenServed;
        private String name;

        public Customer(String name) {
            hasBeenServed = false;
            this.name = name;
        }

        public void serve() {
            hasBeenServed = true;
            System.out.println(name + " has been served");
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void serveCustomer(LinkedList<Customer> queue) {
        Customer c = queue.poll();
        c.serve();
    }

    public static void main(String[] args) {

        LinkedList<Customer> queue = new LinkedList<>();
        queue.add(new Customer("Sally"));
        queue.add(new Customer("Ben"));
        queue.add(new Customer("Emma"));
        queue.add(new Customer("Fred"));
        System.out.println(queue);
        serveCustomer(queue);
        System.out.println(queue);

    }


}
