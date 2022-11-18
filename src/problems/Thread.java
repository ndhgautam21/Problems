package problems;

class Coffee extends java.lang.Thread {
    
    public void run() {
        
        for (int i = 0; i < 10; i++) {
            System.out.println("making coffee " + i);
        }
    }
}

class Waiter extends java.lang.Thread {
    
    public void run() {
        
        for (int i = 0; i < 10; i++) {
            System.out.println("waiter " + i);
        }
    }
}

public class Thread {
    
    public static void main(String[] args) throws InterruptedException {
        
        Coffee coffee = new Coffee();
        Waiter waiter = new Waiter();
        coffee.start();
        waiter.start();
    }
}
