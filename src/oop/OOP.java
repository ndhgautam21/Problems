package oop;

interface A {
    void fun();
}

interface B extends A{
    //void fun();
}

interface C extends A {
    //void fun();
}

class D implements B, C {
    
    int a;
    
    @Override
    public void fun() {
    
    }
}
public class OOP extends D {
    
    public static void main(String[] args) {
        D d = new D();
        int p = d.a;
    }
    
    
    public void fun() {
    
    }
}

// data hiding is achieved by the process of encapsulation

// encapsulation is implement level thing to reduce the complexity of the code.

// abstraction is design level thing we need only those things that is required for the project, inside implementation
// is hidden from the end user.
