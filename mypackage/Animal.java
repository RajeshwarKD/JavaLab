package mypackage;

public class Animal {
    public void eat() {
        System.out.println("Eating...");
    }

    protected void sleep() {
        System.out.println("Sleeping...");
    }

    void run() {
        System.out.println("Running...");
    }

    private void breathe() {
        System.out.println("Breathing...");
    }

    // Method to demonstrate access to private method within the same class
    public void showBreathe() {
        breathe();
    }
}